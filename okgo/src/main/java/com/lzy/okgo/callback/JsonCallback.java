package com.lzy.okgo.callback;


import com.google.gson.stream.JsonReader;
import com.lzy.okgo.bean.HttpBean;
import com.lzy.okgo.bean.HttpTempBean;
import com.lzy.okgo.https.Convert;
import com.lzy.okgo.model.HttpNotice;
import com.lzy.okgo.request.BaseRequest;


import org.greenrobot.eventbus.EventBus;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import okhttp3.Response;

public abstract class JsonCallback<T> extends AbsCallback<T> {

    @Override
    public void onBefore(BaseRequest request) {
        super.onBefore(request);
    }

    @Override
    public T convertSuccess(Response response) throws Exception {

        Type genType = getClass().getGenericSuperclass();
        Type[] params = ((ParameterizedType) genType).getActualTypeArguments();
        Type type = params[0];

        if (!(type instanceof ParameterizedType)) throw new IllegalStateException("没有填写泛型参数");

        Type rawType = ((ParameterizedType) type).getRawType();
        Type typeArgument = ((ParameterizedType) type).getActualTypeArguments()[0];

        JsonReader jsonReader = new JsonReader(response.body().charStream());
        if (typeArgument == Void.class) {
            HttpTempBean httpTempBean = Convert.fromJson(jsonReader, HttpTempBean.class);
            response.close();
            return (T) httpTempBean.toLzyResponse();
        } else if (rawType == HttpBean.class) {
            HttpBean httpBean = Convert.fromJson(jsonReader, type);
            response.close();
            int code = httpBean.Status;

            if (code == 1) {
                return (T) httpBean;
            }else if (code == 2) {
                throw new IllegalStateException("请求失败");
            }else if (code == 11) {
                HttpNotice notice=new HttpNotice();
                notice.code=11;
                EventBus.getDefault().post(notice);

                throw new IllegalStateException("账号在另一台设备上登录");
            }else {
                throw new IllegalStateException(httpBean.Message);
            }
        } else {
            response.close();
            throw new IllegalStateException("基类错误无法解析!");
        }
    }
}