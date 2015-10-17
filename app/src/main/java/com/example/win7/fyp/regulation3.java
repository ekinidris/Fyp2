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

public class regulation3 extends AppCompatActivity {
    Spinner spinner;
    EditText  textNum1;
    EditText  textNum2;
    EditText textSubject;
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
        setContentView(R.layout.activity_regulation3);
        spinner = (Spinner) findViewById(R.id.spinner);
        adapter = ArrayAdapter.createFromResource(this, R.array.country_names, android.R.layout.simple_spinner_item);
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
                        startActivity(new Intent(regulation3.this, regulation1.class));
                        break;
                    case 2:
                        startActivity(new Intent(regulation3.this, regulation2.class));
                        break;
                    case 3:
                        startActivity(new Intent(regulation3.this, regulation3.class));
                        break;


                }


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        textNum1 = (EditText)findViewById(R.id.textNum1);
        textNum2 = (EditText)findViewById(R.id.textNum2);
        textSubject = (EditText)findViewById(R.id.textSubject);
        buttonAdd = (Button)findViewById(R.id.add);
        container = (LinearLayout)findViewById(R.id.container);

        buttonAdd.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View arg0) {
                LayoutInflater layoutInflater =
                        (LayoutInflater) getBaseContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                final View addView = layoutInflater.inflate(R.layout.row, null);
                final TextView textOut = (TextView)addView.findViewById(R.id.textout);
                final TextView textOut2 = (TextView)addView.findViewById(R.id.textout2);
                final TextView textOut3 = (TextView)addView.findViewById(R.id.textout3);
                textOut.setText(textNum1.getText().toString());
                textOut2.setText(textNum2.getText().toString());
                textOut3.setText(textSubject.getText().toString());
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
                        String text2 = textOut2.getText().toString();
                        String text3 = textOut3.getText().toString();
                        String newText = textNum1.getText().toString() + text;
                        String newText2 = textNum2.getText().toString() + text2;
                        String newText3 = textSubject.getText().toString() + text3;
                        textNum1.setText(newText);
                        textNum2.setText(newText2);
                        textSubject.setText(newText3);
                    }});

                container.addView(addView, 0);
            }});

        LayoutTransition transition = new LayoutTransition();
        container.setLayoutTransition(transition);

        buttonShowAll = (Button)findViewById(R.id.showall);
        buttonShowAll.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                String showallPrompt = "";

                int childCount = container.getChildCount();
                showallPrompt += "childCount: " + childCount + "\n\n";
                double total = 0.0;


                double jjk = 0.0;
                double jm = 0.0;
                double jjm=0.0;
                double gradeA=0.0;


                for (int c = 0; c < childCount; c++) {
                    View childView = container.getChildAt(c);
                    View childView2 = container.getChildAt(c);
                    View childView3 = container.getChildAt(c);

                    TextView childTextView = (TextView) (childView.findViewById(R.id.textout));
                    TextView childTextView2 = (TextView) (childView2.findViewById(R.id.textout2));
                    TextView childTextView3 = (TextView) (childView3.findViewById(R.id.textout3));
                    String childTextViewText = (String) (childTextView.getText());
                    String childTextViewText2 = (String) (childTextView2.getText());
                    String childTextViewText3 = (String) (childTextView3.getText());


                    double num1,num2;
                    num1 = Double.parseDouble(childTextView.getText().toString());
                    num2 = Double.parseDouble(childTextView2.getText().toString());



                    if( num2 >= 90 && num2 <= 100)
                    {
                        gradeA=4.0;
                    }

                    else if( num2 >= 80 && num2 <= 89)
                    {
                        gradeA=4.0;
                    }


                    else if( num2 >= 75 && num2 <= 79)
                    {
                        gradeA=3.7;
                    }

                    else if( num2 >= 70 && num2 <= 74)
                    {
                        gradeA=3.3;
                    }

                    else if( num2 >= 65 && num2 <= 69)
                    {
                        gradeA=3.0;
                    }

                    else if( num2 >= 60 && num2 <= 64)
                    {
                        gradeA=2.7;
                    }

                    else if( num2 >= 55 && num2 <= 59)
                    {
                        gradeA=2.3;
                    }

                    else if( num2 >= 50 && num2 <= 54)
                    {
                        gradeA=2.0;
                    }

                    else if( num2 >= 47 && num2 <= 49)
                    {
                        gradeA=1.7;
                    }

                    else if( num2 >= 40 && num2 <= 49)
                    {
                        gradeA=1.3;
                    }

                    else if( num2 >= 30 && num2 <= 39)
                    {
                        gradeA=1.0;
                    }

                    else if( num2 >= 0 && num2 <= 29)
                    {
                        gradeA=0.7;
                    }





                    jjk = jjk + num1;
                    jm = num1 * gradeA;
                    jjm = jjm+jm;


                    total = jjm/jjk;

                    showallPrompt += c + ": " + childTextViewText + "\n" + childTextViewText + childTextViewText + total;


                }
                total = jm / jjk;
                Toast.makeText(regulation3.this,
                        showallPrompt,
                        Toast.LENGTH_LONG).show();
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

}
