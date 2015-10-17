package com.example.win7.fyp;

import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import static android.graphics.Color.RED;
import static android.graphics.Color.YELLOW;


public class login extends ActionBarActivity implements View.OnClickListener {


    Button bLogin,bLoginAd,bLoginStaff;
    TextView tvRegisterLink;
    EditText etUsername, etPassword;
    UserLocalStore userLocalStore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setLogo(R.drawable.uitmlogo);
        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);
        setContentView(R.layout.activity_login);



        etUsername = (EditText) findViewById(R.id.etUsername);
        etPassword = (EditText) findViewById(R.id.etPassword);
        bLogin = (Button) findViewById(R.id.bLogin);




        bLogin.setOnClickListener(this);


        userLocalStore = new UserLocalStore(this);
        Typeface myTypeFace =  Typeface.createFromAsset(getAssets(),"OptimusPrinceps.ttf");
        TextView myTextView = (TextView)findViewById(R.id.tvTitle);
        myTextView.setTypeface(myTypeFace);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bLogin:
                String username = etUsername.getText().toString();
                String password = etPassword.getText().toString();

                user user = new user(username,password);

                authenticate(user);

                break;

            case R.id.tvRegisterLink:
                startActivity(new Intent(this, register.class));
                break;


        }
    }
    private void authenticate(user user){
        ServerRequest serverRequest = new ServerRequest(this);
        serverRequest.fetchUserDataInBackground(user, new GetUserCallback() {
            @Override
            public void done(user returnedUser) {
                if (returnedUser == null) {
                    showErrorMessage();
                } else {
                    logUserIn(returnedUser);
                }
            }
        });
    }
    private void showErrorMessage(){
        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(login.this);
        dialogBuilder.setMessage("Incorrect User");
        dialogBuilder.setPositiveButton("ok", null);
        dialogBuilder.show();
    }

    private void logUserIn(user returnedUser){
        userLocalStore.storeUserData(returnedUser);
        userLocalStore.setUserLoggedIn(true);
        startActivity(new Intent(this, MainActivity.class));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_main, menu);


        return super.onCreateOptionsMenu(menu);

    }

    public boolean onOptionsItemSelected(MenuItem item)
    {

        LinearLayout main_view = (LinearLayout) findViewById(R.id.main_view);
        switch(item.getItemId()){

            case R.id.loginStaff:
                    if(item.isChecked())
                    item.setChecked(false);
                else
                    item.setChecked(true);
                startActivity(new Intent(this, loginStaff.class));
                    return true;

            case R.id.loginAdvisor:
                if(item.isChecked())
                    item.setChecked(false);
                else
                    item.setChecked(true);
                startActivity(new Intent(this, loginAdvisor.class));
                return true;

            case R.id.loginStudent:
                if(item.isChecked())
                    item.setChecked(false);
                else
                    item.setChecked(true);
                startActivity(new Intent(this, login.class));
                return true;

            default:
                    return super.onOptionsItemSelected(item);

        }
    }


}
