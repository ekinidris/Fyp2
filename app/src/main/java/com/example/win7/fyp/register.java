package com.example.win7.fyp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class register extends ActionBarActivity implements View.OnClickListener {

    Button bRegister;
    EditText etUsername, etPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setLogo(R.drawable.uitmlogo);
        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);
        setContentView(R.layout.activity_register);


        etUsername = (EditText) findViewById(R.id.etUsername);
        etPassword = (EditText) findViewById(R.id.etPassword);

        bRegister = (Button) findViewById(R.id.bRegister);

        bRegister.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bRegister:


                String username = etUsername.getText().toString();
                String password = etPassword.getText().toString();

                user user = new user(username, password);
                registerUser(user);
                break;
        }

    }
    private void registerUser(user user){
        ServerRequest serverRequests = new ServerRequest(this);
        serverRequests.storeUserDataInBackground(user, new GetUserCallback() {
            @Override
            public void done(user returnedUser) {
                startActivity(new Intent(register.this, login.class));
            }
        });
    }

}
