package com.example.win7.fyp;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class regulation2 extends AppCompatActivity {

    Spinner spinner;
    EditText textIn;
    Button buttonAdd;
    LinearLayout container;
    Button buttonShowAll;

    ArrayAdapter<CharSequence> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setLogo(R.drawable.uitmlogo);
        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);
        setContentView(R.layout.activity_regulation2);
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
                switch(position){
                    case 1:
                        startActivity(new Intent(regulation2.this, regulation1.class));
                        break;
                    case 2:
                        startActivity(new Intent(regulation2.this, regulation2.class));
                        break;
                    case 3:
                        startActivity(new Intent(regulation2.this, regulation3.class));
                        break;



                }


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        textIn = (EditText)findViewById(R.id.textin);
        buttonAdd = (Button)findViewById(R.id.add);
        container = (LinearLayout)findViewById(R.id.container);

        buttonAdd.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View arg0) {
                LayoutInflater layoutInflater =
                        (LayoutInflater) getBaseContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                final View addView = layoutInflater.inflate(R.layout.row, null);
                final TextView textOut = (TextView)addView.findViewById(R.id.textout);
                textOut.setText(textIn.getText().toString());
                Button buttonRemove = (Button)addView.findViewById(R.id.remove);
                buttonRemove.setOnClickListener(new View.OnClickListener(){

                    @Override
                    public void onClick(View v) {
                        ((LinearLayout)addView.getParent()).removeView(addView);
                    }});

                Button buttonInsert = (Button)addView.findViewById(R.id.insert);
                buttonInsert.setOnClickListener(new View.OnClickListener(){

                    @Override
                    public void onClick(View v) {
                        String text = textOut.getText().toString();
                        String newText = textIn.getText().toString() + text;
                        textIn.setText(newText);
                    }});

                container.addView(addView, 0);
            }});

        LayoutTransition transition = new LayoutTransition();
        container.setLayoutTransition(transition);

        buttonShowAll = (Button)findViewById(R.id.showall);
        buttonShowAll.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View arg0) {

                String showallPrompt = "";

                int childCount = container.getChildCount();
                showallPrompt += "childCount: " + childCount + "\n\n" ;
                double total=0.0;
                double cgpa=0.0;

                for(int c=0; c<childCount; c++){
                    View childView = container.getChildAt(c);
                    TextView childTextView = (TextView)(childView.findViewById(R.id.textout));
                    String childTextViewText = (String)(childTextView.getText());

                    double num;
                    num = Double.parseDouble(childTextView.getText().toString());


                    total = total+num;
                    cgpa = total/childCount;


                    showallPrompt += c + ": " + childTextViewText + "\n" + cgpa;


                }

                Toast.makeText(regulation2.this,
                        showallPrompt,
                        Toast.LENGTH_LONG).show();
            }});

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



}
