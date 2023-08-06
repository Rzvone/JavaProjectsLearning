package com.loginsystem;

import java.util.HashMap;

public class IdAndPassword {

    HashMap<String, String> loginInfo = new HashMap<String, String>();

    IdAndPassword() {
        loginInfo.put("admin", "admin");
        loginInfo.put("user", "user");
        loginInfo.put("guest", "guest");
    }


    protected  HashMap getLoginInfo() {
        return loginInfo;
    }

}
