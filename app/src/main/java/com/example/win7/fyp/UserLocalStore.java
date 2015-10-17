package com.example.win7.fyp;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Win7 on 8/6/2015.
 */

public class UserLocalStore {
    public static final String SP_NAME = "userDetails";
    SharedPreferences userLocalDatabase;


    public UserLocalStore(Context context){
        userLocalDatabase = context.getSharedPreferences(SP_NAME,0);
    }

    public void storeUserData(user user){
        SharedPreferences.Editor spEditor = userLocalDatabase.edit();

        spEditor.putString("username", user.username);
        spEditor.putString("password",user.password);
        spEditor.commit();
    }

    public user getLoggedInUser(){

        String username = userLocalDatabase.getString("username", "");
        String password = userLocalDatabase.getString("password", "");

        user storedUser = new user(username,password);
        return storedUser;
    }

    public void setUserLoggedIn(boolean loggedIn){
        SharedPreferences.Editor spEditor = userLocalDatabase.edit();
        spEditor.putBoolean("loggedIn",loggedIn);
        spEditor.commit();
    }

    public boolean getUserLoggedIn(){
        if(userLocalDatabase.getBoolean("loggedIn",false) ==  true)
            return true;
        else
            return false;
    }

    public void clearUserData(){
        SharedPreferences.Editor spEditor = userLocalDatabase.edit();
        spEditor.clear();
        spEditor.commit();
    }
}
