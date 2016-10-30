package com.sundyzhou.github.shareandlogin.login;

import android.os.Handler;
import android.os.Message;
import android.widget.Toast;

import com.sundyzhou.github.shareandlogin.ShareLogin;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.UiError;

import org.json.JSONObject;

/**
 * Created by zhouz on 2016/10/30.
 */

public class BaseUiListener implements IUiListener {
    Handler handler;

    public BaseUiListener(Handler handler) {
        this.handler = handler;
    }

    @Override
    public void onComplete(Object response) {
        String res = response.toString();
        if (handler != null){
            Message message = new Message();
            message.obj = response;
            message.what = LoginWithQQ.LOGIN_SUCCESS;
            handler.sendMessage(message);
        }
    }

    @Override
    public void onError(UiError e) {
/*
        Toast.makeText(ShareLogin.application.getApplicationContext(), "onError:"+"code:" + e.errorCode + ", msg:"
                + e.errorMessage + ", detail:" + e.errorDetail, Toast.LENGTH_SHORT).show();
*/

        if (handler != null){
            Message message = new Message();
            message.obj = e;
            message.what = LoginWithQQ.LOGIN_ERROR;
            handler.sendMessage(message);
        }
    }
    @Override
    public void onCancel() {

        if (handler != null){
            Message message = new Message();
            message.obj = "";
            message.what = LoginWithQQ.LOGIN_CANCEL;
            handler.sendMessage(message);
        }
    }
}
