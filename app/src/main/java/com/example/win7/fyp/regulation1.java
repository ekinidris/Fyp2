package com.example.win7.fyp;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

public class regulation1 extends AppCompatActivity {

    Spinner spinner;

    ArrayAdapter<CharSequence> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setLogo(R.drawable.uitmlogo);
        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);
        setContentView(R.layout.activity_regulation1);
        spinner = (Spinner)findViewById(R.id. spinner);
        adapter = ArrayAdapter.createFromResource(this,R.array.country_names,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);



        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onClick(View v) {
                // TODO Auto-generated method stub

            }

            @Override
            public void onItemSelected(AdapterView<?> arg0, View view, int position, long id) {

                final Intent intent;
                switch (position) {
                    case 1:
                        startActivity(new Intent(regulation1.this, regulation1.class));
                        break;
                    case 2:
                        startActivity(new Intent(regulation1.this, regulation2.class));
                        break;



                }


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });



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

            default:
                return super.onOptionsItemSelected(item);

        }
    }


    public void onCalcClick(View a)
    {
        if(a.getId() == R.id.calcBut)
        {
            EditText a1 = (EditText)findViewById(R.id.etNum1);
            EditText a2 = (EditText)findViewById(R.id.etNum2);

            double num1,num2;

            num1 = Double.parseDouble(a1.getText().toString());
            num2 = Double.parseDouble(a2.getText().toString());

            double ans = (num1/num2)*100;

            TextView t = (TextView)findViewById(R.id.tvAns);
            t.setText(""+ans);



        }
    }


}
