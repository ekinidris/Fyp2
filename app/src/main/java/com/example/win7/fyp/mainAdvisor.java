package com.example.win7.fyp;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class mainAdvisor extends ActionBarActivity implements View.OnClickListener {


    EditText etUsername;
    UserLocalStoreAdvisor userLocalStoreAdvisor;
    ImageButton bARegulation,bACalendar;
    TextView tvALogout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setLogo(R.drawable.uitmlogo);
        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);
        setContentView(R.layout.activity_main_advisor);

        tvALogout = (TextView) findViewById(R.id.tvALogout);

        tvALogout.setOnClickListener(this);


        etUsername = (EditText) findViewById(R.id.etUsername);

        bARegulation = (ImageButton) findViewById(R.id.bRegulation);
        bACalendar = (ImageButton) findViewById(R.id.bACalendar);



        userLocalStoreAdvisor = new UserLocalStoreAdvisor(this);

        bACalendar.setOnClickListener(this);


    }

    @Override
    protected void onStart() {
        super.onStart();
        if (authenticate() == true)
            displayUserDetails();
        else
            startActivity(new Intent(mainAdvisor.this, loginAdvisor.class));
    }


    private boolean authenticate() {
        return userLocalStoreAdvisor.getUserLoggedInAdvisor();
    }

    private void displayUserDetails() {
        userAdvisor userAdvisor = userLocalStoreAdvisor.getLoggedInUserAdvisor();

        etUsername.setText(userAdvisor.username);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.bACalendar:


                startActivity(new Intent(this, calendar_advisor.class));

                break;



            case R.id.tvALogout:

                userLocalStoreAdvisor.clearUserDataAdvisor();
                userLocalStoreAdvisor.setUserLoggedInAdvisor(false);
                startActivity(new Intent(this, loginAdvisor.class));

                break;



        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_advisor, menu);
        return true;
    }


    public boolean onOptionsItemSelected(MenuItem item) {

        LinearLayout main_view = (LinearLayout) findViewById(R.id.main_view);
        switch (item.getItemId()) {






            case R.id.mainCal:
                if(item.isChecked())
                    item.setChecked(false);
                else
                    item.setChecked(true);
                startActivity(new Intent(this, calendar_advisor.class));
                return true;

            case R.id.mainAdv:
                if(item.isChecked())
                    item.setChecked(false);
                else
                    item.setChecked(true);
                startActivity(new Intent(this, advisor_advisor.class));
                return true;

            case R.id.homeAdvisor:
                if(item.isChecked())
                    item.setChecked(false);
                else
                    item.setChecked(true);
                startActivity(new Intent(this, mainAdvisor.class));
                return true;

            default:
                return super.onOptionsItemSelected(item);

        }

    }


}