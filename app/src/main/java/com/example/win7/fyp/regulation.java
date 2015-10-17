package com.example.win7.fyp;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v7.internal.widget.AdapterViewCompat;
import android.support.v7.internal.widget.AdapterViewCompat.OnItemClickListener;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ExpandableListView;

public class regulation extends ActionBarActivity {

    Spinner spinner;
    HashMap<String, List<String>> Movies_category;
    List<String> Movies_list;
    ExpandableListView Exp_list;
    MoviesAdapter Myadapter;
   ArrayAdapter<CharSequence> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setLogo(R.drawable.uitmlogo);
        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);
        setContentView(R.layout.activity_regulation);
        spinner = (Spinner) findViewById(R.id.spinner);
        adapter = ArrayAdapter.createFromResource(this, R.array.country_names, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        Exp_list = (ExpandableListView) findViewById(R.id.exp_list);
        Movies_category = DataProvider.getInfo();
        Movies_list = new ArrayList<String>(Movies_category.keySet());
        Myadapter = new MoviesAdapter(this, Movies_category, Movies_list);
        Exp_list.setAdapter(Myadapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onClick(View v) {
                // TODO Auto-generated method stub

            }

            @Override
            public void onItemSelected(AdapterView<?> arg0, View view, int position, long id) {

                final Intent intent;
                switch (position) {
                    case 1:
                        startActivity(new Intent(regulation.this, regulation1.class));
                        break;
                    case 2:
                        startActivity(new Intent(regulation.this, regulation2.class));
                        break;
                    case 3:
                        startActivity(new Intent(regulation.this, regulation3.class));
                        break;


                }


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }

    @Override
    public void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);


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
