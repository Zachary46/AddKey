package com.lzy.okgo.callback;

import android.app.Activity;
import android.os.Build;
import com.lzy.okgo.request.BaseRequest;
import com.lzy.okgo.view.LoadingDialog;

public abstract class StringDialogCallback extends StringCallback {

    private  LoadingDialog dialog;
    private Activity a;

    public StringDialogCallback(Activity activity) {
        a=activity;
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
    public void onAfter( String s,  Exception e) {
        super.onAfter(s, e);

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
