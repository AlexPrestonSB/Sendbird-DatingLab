package com.sendbird.datinglab;

import android.app.Application;

import com.sendbird.android.ApplicationUserListQuery;
import com.sendbird.android.SendBird;
import com.sendbird.android.User;
import com.sendbird.datinglab.entities.MyUserInfo;
import com.sendbird.uikit.SendBirdUIKit;
import com.sendbird.uikit.adapter.SendBirdUIKitAdapter;
import com.sendbird.uikit.interfaces.CustomUserListQueryHandler;
import com.sendbird.uikit.interfaces.UserInfo;
import com.sendbird.uikit.interfaces.UserListResultHandler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BaseApplication extends Application {


    @Override
    public void onCreate() {
        super.onCreate();

        /**
         * TODO SENDBIRD CODE FOR UIKIT HERE
         */
    }
}
