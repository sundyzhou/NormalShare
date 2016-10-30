package com.sundyzhou.github.shareandlogin;

import android.app.Application;

/**
 * Created by zhouz on 2016/10/30.
 */

public class ShareLogin {
    public static Application application;
    public static String QQ_APP_ID = "";

    public ShareLogin(Application application) {
        this.application = application;
    }

    public ShareLogin() {
    }

    public static void init(Application app){
        application = app;
    }

    public static void setQqAppId(String qqAppId) {
        QQ_APP_ID = qqAppId;
    }

    public static String getQqAppId() {
        return QQ_APP_ID;
    }
}
