package com.example.win7.fyp;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity implements View.OnClickListener {


    ImageButton bRegulation,bCalendar,bAdvisor;
    EditText etUsername;
    UserLocalStore userLocalStore;
    TextView tvLogout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setLogo(R.drawable.uitmlogo);
        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);
        setContentView(R.layout.activity_main);
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#FFBE80FF")));


        etUsername = (EditText) findViewById(R.id.etUsername);

        bRegulation = (ImageButton) findViewById(R.id.bRegulation);
        bCalendar = (ImageButton) findViewById(R.id.bSCalendar);
        bAdvisor = (ImageButton) findViewById(R.id.bAdvisor);
        tvLogout = (TextView) findViewById(R.id.tvLogout);

        bRegulation.setOnClickListener(this);
        bCalendar.setOnClickListener(this);
        bAdvisor.setOnClickListener(this);
        tvLogout.setOnClickListener(this);
        userLocalStore = new UserLocalStore(this);


    }

    @Override
    protected void onStart(){
        super.onStart();
        if(authenticate()==true)
            displayUserDetails();
        else
            startActivity(new Intent(MainActivity.this, login.class));
    }


    private boolean authenticate(){
        return userLocalStore.getUserLoggedIn();
    }

    private void displayUserDetails(){
        user user = userLocalStore.getLoggedInUser();

        etUsername.setText(user.username);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){


            case R.id.bRegulation:



                startActivity(new Intent(this, regulation.class));

                break;

            case R.id.bSCalendar:


                startActivity(new Intent(this, calendar.class));

                break;
            case R.id.bAdvisor:


                startActivity(new Intent(this, advisor.class));

                break;


            case R.id.tvLogout:

                userLocalStore.clearUserData();
                userLocalStore.setUserLoggedIn(false);
                startActivity(new Intent(this, login.class));

                break;

        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_main_activity, menu);


        return super.onCreateOptionsMenu(menu);

    }

    public boolean onOptionsItemSelected(MenuItem item)
    {

        LinearLayout main_view = (LinearLayout) findViewById(R.id.main_view);
        switch(item.getItemId()){

            case R.id.mainReg:
                if(item.isChecked())
                    item.setChecked(false);
                else
                    item.setChecked(true);
                startActivity(new Intent(this, regulation.class));
                return true;

            case R.id.mainCal:
                if(item.isChecked())
                    item.setChecked(false);
                else
                    item.setChecked(true);
                startActivity(new Intent(this, calendar.class));
                return true;

            case R.id.mainAdv:
                if(item.isChecked())
                    item.setChecked(false);
                else
                    item.setChecked(true);
                startActivity(new Intent(this, advisor.class));
                return true;

            case R.id.homeStud:
                if(item.isChecked())
                    item.setChecked(false);
                else
                    item.setChecked(true);
                startActivity(new Intent(this, MainActivity.class));
                return true;

            default:
                return super.onOptionsItemSelected(item);

        }
    }


}
