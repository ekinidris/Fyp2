package com.example.win7.fyp;

/**
 * Created by Win7 on 9/1/2015.
 */
public class userStaff {
    String name, username, password;
    int age;

    public userStaff(String name, int age, String username, String password){

        this.username = username;
        this.password = password;

    }

    public userStaff(String username, String password){

        this.username = username;
        this.password = password;

    }

}
