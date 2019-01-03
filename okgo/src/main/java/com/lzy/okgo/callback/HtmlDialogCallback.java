package com.lzy.okgo.callback;

import android.app.Activity;
import com.lzy.okgo.request.BaseRequest;
import com.lzy.okgo.view.LoadingDialog;

public abstract class HtmlDialogCallback extends HtmlCallback {

    private LoadingDialog dialog;

    public HtmlDialogCallback(Activity activity) {
        dialog = new LoadingDialog(activity);
    }

    @Override
    public void onBefore(BaseRequest request) {
        super.onBefore(request);

        if (dialog != null && !dialog.isShowing()) {
            dialog.show();
        }
    }

    @Override
    public void onAfter( String s, Exception e) {
        super.onAfter(s, e);

        if (dialog != null && dialog.isShowing()) {
            dialog.dismiss();
        }
    }
}
