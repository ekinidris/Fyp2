package com.example.win7.fyp;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Win7 on 10/2/2015.
 */
public class UserLocalStoreStaffCalendar {

    public static final String SP_NAME = "userDetails";
    SharedPreferences userLocalDatabaseStaffCalendar;


    public UserLocalStoreStaffCalendar(Context context){
        userLocalDatabaseStaffCalendar = context.getSharedPreferences(SP_NAME,0);
    }

    public void storeUserDataStaffCalendar(userStaffCalendar userStaffCalendar){
        SharedPreferences.Editor spEditor = userLocalDatabaseStaffCalendar.edit();

        spEditor.putString("calSession", userStaffCalendar.calSession);
        spEditor.putString("kuliahStart",userStaffCalendar.kuliahStart);
        spEditor.putString("kuliahEnd",userStaffCalendar.kuliahEnd);
        spEditor.putString("entranceStart",userStaffCalendar.entranceStart);
        spEditor.putString("entranceEnd",userStaffCalendar.entranceEnd);
        spEditor.putString("cutiPertStart",userStaffCalendar.cutiPertStart);
        spEditor.putString("cutiPertEnd",userStaffCalendar.cutiPertEnd);
        spEditor.putString("kuliah2Start",userStaffCalendar.kuliah2Start);
        spEditor.putString("kuliah2End",userStaffCalendar.kuliah2End);
        spEditor.putString("sufoStart",userStaffCalendar.sufoStart);
        spEditor.putString("sufoEnd",userStaffCalendar.sufoEnd);
        spEditor.putString("exitStart",userStaffCalendar.exitStart);
        spEditor.putString("exitEnd",userStaffCalendar.exitEnd);
        spEditor.putString("studyweekStart",userStaffCalendar.studyweekStart);
        spEditor.putString("studyweekEnd",userStaffCalendar.studyweekEnd);
        spEditor.putString("examStart",userStaffCalendar.examStart);
        spEditor.putString("examEnd",userStaffCalendar.examEnd);
        spEditor.putString("resultDate",userStaffCalendar.resultDate);
        spEditor.putString("examKhasStart",userStaffCalendar.examKhasStart);
        spEditor.putString("examKhasEnd",userStaffCalendar.examKhasEnd);
        spEditor.putString("cutisemStart",userStaffCalendar.cutisemStart);
        spEditor.putString("cutisemEnd",userStaffCalendar.cutisemEnd);


        spEditor.commit();
    }

    public  userStaffCalendar getLoggedInUserStaffCalendar(){

        String calSession = userLocalDatabaseStaffCalendar.getString("calSession", "");
        String kuliahStart = userLocalDatabaseStaffCalendar.getString("kuliahStart", "");
        String kuliahEnd = userLocalDatabaseStaffCalendar.getString("kuliahEnd", "");
        String entranceStart = userLocalDatabaseStaffCalendar.getString("entranceStart", "");
        String entranceEnd = userLocalDatabaseStaffCalendar.getString("entranceEnd", "");
        String cutiPertStart = userLocalDatabaseStaffCalendar.getString("cutiPertStart", "");
        String cutiPertEnd = userLocalDatabaseStaffCalendar.getString("cutiPertEnd", "");
        String kuliah2Start = userLocalDatabaseStaffCalendar.getString("kuliah2Start", "");
        String kuliah2End = userLocalDatabaseStaffCalendar.getString("kuliah2End", "");
        String sufoStart = userLocalDatabaseStaffCalendar.getString("sufoStart", "");
        String sufoEnd = userLocalDatabaseStaffCalendar.getString("sufoEnd", "");
        String exitStart = userLocalDatabaseStaffCalendar.getString("exitStart", "");
        String exitEnd = userLocalDatabaseStaffCalendar.getString("exitEnd", "");
        String studyweekStart = userLocalDatabaseStaffCalendar.getString("studyweekStart", "");
        String studyweekEnd = userLocalDatabaseStaffCalendar.getString("studyweekEnd", "");
        String examStart = userLocalDatabaseStaffCalendar.getString("examStart", "");
        String examEnd = userLocalDatabaseStaffCalendar.getString("examEnd", "");
        String resultDate = userLocalDatabaseStaffCalendar.getString("resultDate", "");
        String examKhasStart = userLocalDatabaseStaffCalendar.getString("examKhasStart", "");
        String examKhasEnd = userLocalDatabaseStaffCalendar.getString("examKhasEnd", "");
        String cutisemStart = userLocalDatabaseStaffCalendar.getString("cutisemStart", "");
        String cutisemEnd = userLocalDatabaseStaffCalendar.getString("cutisemEnd", "");


        userStaffCalendar storeuserStaffCalendar = new userStaffCalendar(calSession,kuliahStart,kuliahEnd,entranceStart,entranceEnd,cutiPertStart,cutiPertEnd,
                                                    kuliah2Start,kuliah2End,sufoStart,sufoEnd,exitStart,exitEnd,studyweekStart,studyweekEnd,examStart,examEnd,
                                                    resultDate,examKhasStart,examKhasEnd,cutisemStart,cutisemEnd);
        return storeuserStaffCalendar;
    }

    public void setUserLoggedInStaffCalendar(boolean loggedIn){
        SharedPreferences.Editor spEditor = userLocalDatabaseStaffCalendar.edit();
        spEditor.putBoolean("loggedIn",loggedIn);
        spEditor.commit();
    }

    public  boolean getUserLoggedInStaffCalendar(){
        if(userLocalDatabaseStaffCalendar.getBoolean("loggedIn",false) ==  true)
            return true;
        else
            return false;
    }

    public void clearUserDataStaffCalendar(){
        SharedPreferences.Editor spEditor = userLocalDatabaseStaffCalendar.edit();
        spEditor.clear();
        spEditor.commit();
    }
}
