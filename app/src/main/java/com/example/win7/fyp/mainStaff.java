package com.example.win7.fyp;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class mainStaff extends ActionBarActivity implements View.OnClickListener {


    EditText etUsername;
    UserLocalStoreStaff userLocalStoreStaff;
    ImageButton bCalendarStaff;
    TextView tvLogoutStaff;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setLogo(R.drawable.uitmlogo);
        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);
        setContentView(R.layout.activity_main_staff);


        etUsername = (EditText) findViewById(R.id.etUsername);
        bCalendarStaff = (ImageButton) findViewById(R.id.bCalendarStaff);
        tvLogoutStaff = (TextView) findViewById(R.id.tvLogoutStaff);

        bCalendarStaff.setOnClickListener(this);
        tvLogoutStaff.setOnClickListener(this);
        userLocalStoreStaff = new UserLocalStoreStaff(this);


    }

    @Override
    protected void onStart() {
        super.onStart();
        if (authenticate() == true)
            displayUserDetails();
        else
            startActivity(new Intent(mainStaff.this, loginStaff.class));
    }


    private boolean authenticate() {
        return userLocalStoreStaff.getUserLoggedInStaff();
    }

    private void displayUserDetails() {
        userStaff userStaff = userLocalStoreStaff.getLoggedInUserStaff();

        etUsername.setText(userStaff.username);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.bCalendarStaff:
                startActivity(new Intent(this,calendar_staff_update.class));
                break;
            case R.id.tvLogoutStaff:

                userLocalStoreStaff.clearUserDataStaff();
                userLocalStoreStaff.setUserLoggedInStaff(false);
                startActivity(new Intent(this, loginStaff.class));

                break;


        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_calendar_staff, menu);


        return super.onCreateOptionsMenu(menu);

    }

    public boolean onOptionsItemSelected(MenuItem item) {

        LinearLayout main_view = (LinearLayout) findViewById(R.id.main_view);
        switch (item.getItemId()) {




            case R.id.mainCal:
                if (item.isChecked())
                    item.setChecked(false);
                else
                    item.setChecked(true);
                startActivity(new Intent(this, calendar_staff_update.class));
                return true;

            case R.id.homeStaff:
                if (item.isChecked())
                    item.setChecked(false);
                else
                    item.setChecked(true);
                startActivity(new Intent(this, mainStaff.class));
                return true;

            default:
                return super.onOptionsItemSelected(item);

        }

    }


}