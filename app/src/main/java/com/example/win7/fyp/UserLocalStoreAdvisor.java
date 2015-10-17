package com.example.win7.fyp;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Win7 on 8/31/2015.
 */
public class UserLocalStoreAdvisor {

    public static final String SP_NAME = "userDetails";
    SharedPreferences userLocalDatabaseAdvisor;


    public UserLocalStoreAdvisor(Context context){
        userLocalDatabaseAdvisor = context.getSharedPreferences(SP_NAME,0);
    }

    public void storeUserDataAdvisor(userAdvisor userAdvisor){
        SharedPreferences.Editor spEditor = userLocalDatabaseAdvisor.edit();

        spEditor.putString("username", userAdvisor.username);
        spEditor.putString("password",userAdvisor.password);
        spEditor.commit();
    }

    public userAdvisor getLoggedInUserAdvisor(){

        String username = userLocalDatabaseAdvisor.getString("username", "");
        String password = userLocalDatabaseAdvisor.getString("password", "");

        userAdvisor storedUserAdvisor = new userAdvisor(username,password);
        return storedUserAdvisor;
    }

    public void setUserLoggedInAdvisor(boolean loggedIn){
        SharedPreferences.Editor spEditor = userLocalDatabaseAdvisor.edit();
        spEditor.putBoolean("loggedIn",loggedIn);
        spEditor.commit();
    }

    public boolean getUserLoggedInAdvisor(){
        if(userLocalDatabaseAdvisor.getBoolean("loggedIn",false) ==  true)
            return true;
        else
            return false;
    }

    public void clearUserDataAdvisor(){
        SharedPreferences.Editor spEditor = userLocalDatabaseAdvisor.edit();
        spEditor.clear();
        spEditor.commit();
    }
}
