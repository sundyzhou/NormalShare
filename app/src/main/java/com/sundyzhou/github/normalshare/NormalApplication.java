package com.sundyzhou.github.normalshare;

import android.app.Application;

import com.sundyzhou.github.shareandlogin.ShareLogin;

/**
 * Created by zhouz on 2016/10/30.
 */

public class NormalApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ShareLogin.init(this);
    }
}
