package com.example.win7.fyp;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Win7 on 9/1/2015.
 */
public class UserLocalStoreStaff {


    public static final String SP_NAME = "userDetails";
    SharedPreferences userLocalDatabaseStaff;


    public UserLocalStoreStaff(Context context){
        userLocalDatabaseStaff = context.getSharedPreferences(SP_NAME,0);
    }

    public void storeUserDataStaff(userStaff userStaff){
        SharedPreferences.Editor spEditor = userLocalDatabaseStaff.edit();

        spEditor.putString("username", userStaff.username);
        spEditor.putString("password",userStaff.password);
        spEditor.commit();
    }

    public userStaff getLoggedInUserStaff(){

        String username = userLocalDatabaseStaff.getString("username", "");
        String password = userLocalDatabaseStaff.getString("password", "");

        userStaff storedUserStaff = new userStaff(username,password);
        return storedUserStaff;
    }

    public void setUserLoggedInStaff(boolean loggedIn){
        SharedPreferences.Editor spEditor = userLocalDatabaseStaff.edit();
        spEditor.putBoolean("loggedIn",loggedIn);
        spEditor.commit();
    }

    public boolean getUserLoggedInStaff(){
        if(userLocalDatabaseStaff.getBoolean("loggedIn",false) ==  true)
            return true;
        else
            return false;
    }

    public void clearUserDataStaff(){
        SharedPreferences.Editor spEditor = userLocalDatabaseStaff.edit();
        spEditor.clear();
        spEditor.commit();
    }
}
