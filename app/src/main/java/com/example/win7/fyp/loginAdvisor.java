package com.example.win7.fyp;

import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class loginAdvisor extends ActionBarActivity implements View.OnClickListener  {







        Button bLoginAdvisor;

        EditText etUsername, etPassword;
        UserLocalStoreAdvisor userLocalStoreAdvisor;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            ActionBar actionBar = getSupportActionBar();
            actionBar.setLogo(R.drawable.uitmlogo);
            actionBar.setDisplayUseLogoEnabled(true);
            actionBar.setDisplayShowHomeEnabled(true);
            setContentView(R.layout.activity_login_advisor);


            etUsername = (EditText) findViewById(R.id.etUsername);
            etPassword = (EditText) findViewById(R.id.etPassword);
            bLoginAdvisor = (Button) findViewById(R.id.bLoginAdvisor);


            bLoginAdvisor.setOnClickListener(this);


            userLocalStoreAdvisor = new UserLocalStoreAdvisor(this);
            Typeface myTypeFace =  Typeface.createFromAsset(getAssets(),"OptimusPrinceps.ttf");
            TextView myTextView = (TextView)findViewById(R.id.tvTitle);
            myTextView.setTypeface(myTypeFace);
        }

        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.bLoginAdvisor:
                    String username = etUsername.getText().toString();
                    String password = etPassword.getText().toString();

                    userAdvisor userAdvisor = new userAdvisor(username,password);

                    authenticate(userAdvisor);

                    break;




            }
        }
        private void authenticate(userAdvisor userAdvisorr){
            ServerRequestAdvisor serverRequest = new ServerRequestAdvisor(this);
            serverRequest.fetchUserDataInBackground(userAdvisorr, new GetUserCallBackAdvisor() {
                @Override
                public void done(userAdvisor returnedUserAdvisor) {
                    if(returnedUserAdvisor == null)
                    {
                        showErrorMessage();
                    }
                    else
                    {
                        logUserIn(returnedUserAdvisor);
                    }
                }
            });
        }
        private void showErrorMessage(){
            AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(loginAdvisor.this);
            dialogBuilder.setMessage("Incorrect User");
            dialogBuilder.setPositiveButton("ok", null);
            dialogBuilder.show();
        }

        private void logUserIn(userAdvisor returnedUserAdvisor){
            userLocalStoreAdvisor.storeUserDataAdvisor(returnedUserAdvisor);
            userLocalStoreAdvisor.setUserLoggedInAdvisor(true);
            startActivity(new Intent(this, mainAdvisor.class));
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






