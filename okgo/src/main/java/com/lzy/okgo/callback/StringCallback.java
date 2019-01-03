package com.lzy.okgo.callback;

import com.lzy.okgo.convert.StringConvert;
import com.lzy.okgo.model.HttpNotice;

import org.greenrobot.eventbus.EventBus;
import org.json.JSONObject;

import okhttp3.Response;

/**
 * ================================================
 * 作    者：廖子尧
 * 版    本：1.0
 * 创建日期：2016/9/11
 * 描    述：返回字符串类型的数据
 * 修订历史：
 * ================================================
 */
public abstract class StringCallback extends AbsCallback<String> {

    @Override
    public String convertSuccess(Response response) throws Exception {
        String s = StringConvert.create().convertSuccess(response);
        response.close();
        /**
         * 自己写的
         * */
        JSONObject jsonObject=new JSONObject(s);
        int code = jsonObject.getInt("Status");
        String error=jsonObject.getString("Message");

        if (code == 1) {
            return s;
        }else if (code == 2) {
            throw new IllegalStateException("请求失败");
        }else if (code == 11) {
            HttpNotice notice=new HttpNotice();
            notice.code=11;
            EventBus.getDefault().post(notice);
            throw new IllegalStateException("账号在另一台设备上登录");
        } else {
            throw new IllegalStateException(error);
        }

    }
}