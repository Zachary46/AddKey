package com.lzy.okgo.callback;

import android.app.Activity;
import android.os.Build;
import com.lzy.okgo.request.BaseRequest;
import com.lzy.okgo.view.LoadingDialog;

/**
 * ================================================
 * 作    者：廖子尧
 * 版    本：1.0
 * 创建日期：2016/1/14
 * 描    述：对于网络请求是否需要弹出进度对话框
 * 修订历史：
 * ================================================
 */
public abstract class DialogCallback<T> extends JsonCallback<T> {

    //private LoadingDialog dialog;
    private LoadingDialog dialog;
    private Activity a;

    public DialogCallback(Activity activity) {
        super();
        a=activity;
        //dialog=new LoadingDialog(activity);
        dialog = new LoadingDialog(activity);
    }

    @Override
    public void onBefore(BaseRequest request) {
        super.onBefore(request);
        if (dialog != null && !dialog.isShowing()) {
            if (isValidContext(a))
            dialog.show();
        }
    }

    @Override
    public void onAfter(T t, Exception e) {
        super.onAfter(t, e);
        if (dialog != null && dialog.isShowing()) {
            if (isValidContext(a))
            dialog.dismiss();
        }
    }

    private boolean isValidContext (Activity c) {
        Activity a = (Activity) c;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
            if (a.isDestroyed()|| a.isFinishing()) {
                return false;
            } else {
                return true;
            }
        }
        return true;
    }
}
