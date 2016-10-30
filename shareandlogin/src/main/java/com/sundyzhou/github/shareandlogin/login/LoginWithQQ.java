package com.sundyzhou.github.shareandlogin.login;

import com.sundyzhou.github.shareandlogin.ShareLogin;
import com.tencent.tauth.Tencent;

/**
 * Created by zhouz on 2016/10/30.
 */

public class LoginWithQQ {
    public static final int LOGIN_SUCCESS = 0x001;
    public static final int LOGIN_ERROR = 0x002;
    public static final int LOGIN_CANCEL = 0x003;


    public LoginWithQQ() {
    }

    public static void login(){
        Tencent tencent = Tencent.createInstance(ShareLogin.getQqAppId(), ShareLogin.application.getApplicationContext());
    }

}
