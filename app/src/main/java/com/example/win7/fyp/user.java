package com.example.win7.fyp;

/**
 * Created by Administrator on 24-May-15.
 */
public class user {
    String name, username, password;
    int age;

    public user(String name, int age, String username, String password){

        this.username = username;
        this.password = password;

    }

    public user(String username, String password){

        this.username = username;
        this.password = password;

    }
}
