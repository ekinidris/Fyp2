package com.example.win7.fyp;

/**
 * Created by Win7 on 8/31/2015.
 */
public class userAdvisor {

    String name, username, password;
    int age;

    public userAdvisor(String name, int age, String username, String password){

        this.username = username;
        this.password = password;

    }

    public userAdvisor(String username, String password){

        this.username = username;
        this.password = password;

    }
}
