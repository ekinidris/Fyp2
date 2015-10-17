package com.example.win7.fyp;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class calendar_staff extends AppCompatActivity implements View.OnClickListener{


    EditText calSession1,
            kuliahStart1,
            kuliahEnd1,
            entranceStart1 ,
            entranceEnd1,
            cutiPertStart1 ,
            cutiPertEnd1 ,
            kuliah2Start1 ,
            kuliah2End1 ,
            sufoStart1 ,
            sufoEnd1 ,
             exitStart1 ,
            exitEnd1 ,
            studyweekStart1 ,
            studyweekEnd1 ,
            examStart1 ,
            examEnd1 ,
            resultDate1 ,
            examKhasStart1 ,
            examKhasEnd1 ,
            cutisemStart1 ,
            cutisemEnd1 ;

    EditText etUsername;
    Button bSubmit,toast;

ImageButton ib,ib1,ib2,ib3,ib4,ib5,ib6,ib7,ib8,ib9,ib10,ib11,ib12,ib13,ib14,ib15,ib16,ib17,ib18,ib19,ib20;
//    public Calendar cal;
//    public int day;
//    public int month;
//    public int year;
         EditText et,et2;


    DateFormat format=DateFormat.getDateInstance();

    Calendar calender=Calendar.getInstance();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setLogo(R.drawable.uitmlogo);
        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);

        setContentView(R.layout.activity_calendar_staff);

                calSession1 = (EditText) findViewById(R.id.calSession1);
                kuliahStart1 = (EditText) findViewById(R.id.kuliahStart1);
                kuliahEnd1=(EditText) findViewById(R.id.kuliahEnd1);
                entranceStart1=(EditText) findViewById(R.id.entranceStart1);
                entranceEnd1=(EditText) findViewById(R.id.entranceEnd1);
                cutiPertStart1=(EditText) findViewById(R.id.cutiPertStart1);
                cutiPertEnd1=(EditText) findViewById(R.id.cutiPertEnd1);
                kuliah2Start1=(EditText) findViewById(R.id.kuliah2Start1);
                kuliah2End1=(EditText) findViewById(R.id. kuliah2End1);
                sufoStart1=(EditText) findViewById(R.id.sufoStart1);
                sufoEnd1=(EditText) findViewById(R.id.sufoEnd1);
                exitStart1=(EditText) findViewById(R.id.exitStart1);
                exitEnd1=(EditText) findViewById(R.id.exitEnd1);
                studyweekStart1=(EditText) findViewById(R.id.studyweekStart1);
                studyweekEnd1=(EditText) findViewById(R.id.studyweekEnd1);
                examStart1=(EditText) findViewById(R.id.examStart1);
                examEnd1=(EditText) findViewById(R.id.examEnd1);
                resultDate1=(EditText) findViewById(R.id.resultDate1);
                examKhasStart1=(EditText) findViewById(R.id.examKhasStart1);
                examKhasEnd1=(EditText) findViewById(R.id.examKhasEnd1);
                cutisemStart1=(EditText) findViewById(R.id.cutisemStart1);
                cutisemEnd1=(EditText) findViewById(R.id.cutisemEnd1);


                bSubmit = (Button)  findViewById(R.id.bSubmit);
//        toast = (Button)  findViewById(R.id.toast);


                bSubmit.setOnClickListener(this);
//        toast.setOnClickListener(this);

        // mDateButton = (Button) findViewById(R.id.date_button);
 ib = (ImageButton) findViewById(R.id.imageButton1);
  ib.setOnClickListener(this);

        ib1 = (ImageButton) findViewById(R.id.imageButton2);
        ib1.setOnClickListener(this);


        ib2 = (ImageButton) findViewById(R.id.imageButton3);
        ib2.setOnClickListener(this);


        ib3 = (ImageButton) findViewById(R.id.imageButton4);
        ib3.setOnClickListener(this);


        ib4 = (ImageButton) findViewById(R.id.imageButton5);
        ib4.setOnClickListener(this);


        ib5 = (ImageButton) findViewById(R.id.imageButton6);
        ib5.setOnClickListener(this);


        ib6 = (ImageButton) findViewById(R.id.imageButton7);
        ib6.setOnClickListener(this);


        ib7 = (ImageButton) findViewById(R.id.imageButton8);
        ib7.setOnClickListener(this);


        ib8 = (ImageButton) findViewById(R.id.imageButton9);
        ib8.setOnClickListener(this);


        ib9 = (ImageButton) findViewById(R.id.imageButton10);
        ib9.setOnClickListener(this);


        ib10 = (ImageButton) findViewById(R.id.imageButton11);
        ib10.setOnClickListener(this);


        ib11 = (ImageButton) findViewById(R.id.imageButton12);
        ib11.setOnClickListener(this);


        ib12 = (ImageButton) findViewById(R.id.imageButton13);
        ib12.setOnClickListener(this);


        ib13 = (ImageButton) findViewById(R.id.imageButton14);
        ib13.setOnClickListener(this);


        ib14 = (ImageButton) findViewById(R.id.imageButton15);
        ib14.setOnClickListener(this);


        ib15 = (ImageButton) findViewById(R.id.imageButton16);
        ib15.setOnClickListener(this);


        ib16 = (ImageButton) findViewById(R.id.imageButton17);
        ib16.setOnClickListener(this);


        ib17 = (ImageButton) findViewById(R.id.imageButton18);
        ib17.setOnClickListener(this);


        ib18 = (ImageButton) findViewById(R.id.imageButton19);
        ib18.setOnClickListener(this);


        ib19 = (ImageButton) findViewById(R.id.imageButton20);
        ib19.setOnClickListener(this);


        ib20 = (ImageButton) findViewById(R.id.imageButton21);
        ib20.setOnClickListener(this);





    }





    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_main_activity, menu);


        return super.onCreateOptionsMenu(menu);

    }

    public void updatelabel()
    {


        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String dueDate = df.format(calender.getTime());


        kuliahStart1.setText(dueDate);



    }
    public void setDate()
    {
        new DatePickerDialog(calendar_staff.this,d,
                calender.get(Calendar.YEAR),calender.get(Calendar.MONTH),calender.get(Calendar.DAY_OF_MONTH)).show();
    }
    DatePickerDialog.OnDateSetListener d=new DatePickerDialog.OnDateSetListener() {

        @Override
        public void onDateSet(DatePicker arg0, int year, int month, int day) {


            calender.set(Calendar.YEAR,year);
            calender.set(Calendar.MONTH,month);
            calender.set(Calendar.DAY_OF_MONTH,day);
            updatelabel();


        }
    };


    public void updatelabel1()
    {


        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String dueDate = df.format(calender.getTime());


        kuliahEnd1.setText(dueDate);



    }
    public void setDate1()
    {
        new DatePickerDialog(calendar_staff.this,d1,
                calender.get(Calendar.YEAR),calender.get(Calendar.MONTH),calender.get(Calendar.DAY_OF_MONTH)).show();
    }
    DatePickerDialog.OnDateSetListener d1=new DatePickerDialog.OnDateSetListener() {

        @Override
        public void onDateSet(DatePicker arg0, int year, int month, int day) {


            calender.set(Calendar.YEAR,year);
            calender.set(Calendar.MONTH,month);
            calender.set(Calendar.DAY_OF_MONTH,day);
            updatelabel1();


        }
    };


    public void updatelabel2()
    {


        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String dueDate = df.format(calender.getTime());


        entranceStart1.setText(dueDate);



    }
    public void setDate2()
    {
        new DatePickerDialog(calendar_staff.this,d2,
                calender.get(Calendar.YEAR),calender.get(Calendar.MONTH),calender.get(Calendar.DAY_OF_MONTH)).show();
    }
    DatePickerDialog.OnDateSetListener d2=new DatePickerDialog.OnDateSetListener() {

        @Override
        public void onDateSet(DatePicker arg0, int year, int month, int day) {


            calender.set(Calendar.YEAR,year);
            calender.set(Calendar.MONTH,month);
            calender.set(Calendar.DAY_OF_MONTH,day);
            updatelabel2();


        }
    };


    public void updatelabel3()
    {


        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String dueDate = df.format(calender.getTime());


        entranceEnd1.setText(dueDate);



    }
    public void setDate3()
    {
        new DatePickerDialog(calendar_staff.this,d3,
                calender.get(Calendar.YEAR),calender.get(Calendar.MONTH),calender.get(Calendar.DAY_OF_MONTH)).show();
    }
    DatePickerDialog.OnDateSetListener d3=new DatePickerDialog.OnDateSetListener() {

        @Override
        public void onDateSet(DatePicker arg0, int year, int month, int day) {


            calender.set(Calendar.YEAR,year);
            calender.set(Calendar.MONTH,month);
            calender.set(Calendar.DAY_OF_MONTH,day);
            updatelabel3();


        }
    };


    public void updatelabel4()
    {


        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String dueDate = df.format(calender.getTime());


        cutiPertStart1.setText(dueDate);



    }
    public void setDate4()
    {
        new DatePickerDialog(calendar_staff.this,d4,
                calender.get(Calendar.YEAR),calender.get(Calendar.MONTH),calender.get(Calendar.DAY_OF_MONTH)).show();
    }
    DatePickerDialog.OnDateSetListener d4=new DatePickerDialog.OnDateSetListener() {

        @Override
        public void onDateSet(DatePicker arg0, int year, int month, int day) {


            calender.set(Calendar.YEAR,year);
            calender.set(Calendar.MONTH,month);
            calender.set(Calendar.DAY_OF_MONTH,day);
            updatelabel4();


        }
    };


    public void updatelabel5()
    {


        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String dueDate = df.format(calender.getTime());


        cutiPertEnd1.setText(dueDate);



    }
    public void setDate5()
    {
        new DatePickerDialog(calendar_staff.this,d5,
                calender.get(Calendar.YEAR),calender.get(Calendar.MONTH),calender.get(Calendar.DAY_OF_MONTH)).show();
    }
    DatePickerDialog.OnDateSetListener d5=new DatePickerDialog.OnDateSetListener() {

        @Override
        public void onDateSet(DatePicker arg0, int year, int month, int day) {


            calender.set(Calendar.YEAR,year);
            calender.set(Calendar.MONTH,month);
            calender.set(Calendar.DAY_OF_MONTH,day);
            updatelabel5();


        }
    };


    public void updatelabel6()
    {


        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String dueDate = df.format(calender.getTime());


        kuliah2Start1.setText(dueDate);



    }
    public void setDate6()
    {
        new DatePickerDialog(calendar_staff.this,d6,
                calender.get(Calendar.YEAR),calender.get(Calendar.MONTH),calender.get(Calendar.DAY_OF_MONTH)).show();
    }
    DatePickerDialog.OnDateSetListener d6=new DatePickerDialog.OnDateSetListener() {

        @Override
        public void onDateSet(DatePicker arg0, int year, int month, int day) {


            calender.set(Calendar.YEAR,year);
            calender.set(Calendar.MONTH,month);
            calender.set(Calendar.DAY_OF_MONTH,day);
            updatelabel6();


        }
    };


    public void updatelabel7()
    {


        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String dueDate = df.format(calender.getTime());


        kuliah2End1.setText(dueDate);



    }
    public void setDate7()
    {
        new DatePickerDialog(calendar_staff.this,d7,
                calender.get(Calendar.YEAR),calender.get(Calendar.MONTH),calender.get(Calendar.DAY_OF_MONTH)).show();
    }
    DatePickerDialog.OnDateSetListener d7=new DatePickerDialog.OnDateSetListener() {

        @Override
        public void onDateSet(DatePicker arg0, int year, int month, int day) {


            calender.set(Calendar.YEAR,year);
            calender.set(Calendar.MONTH,month);
            calender.set(Calendar.DAY_OF_MONTH,day);
            updatelabel7();


        }
    };


    public void updatelabel8()
    {


        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String dueDate = df.format(calender.getTime());


        sufoStart1.setText(dueDate);



    }
    public void setDate8()
    {
        new DatePickerDialog(calendar_staff.this,d8,
                calender.get(Calendar.YEAR),calender.get(Calendar.MONTH),calender.get(Calendar.DAY_OF_MONTH)).show();
    }
    DatePickerDialog.OnDateSetListener d8=new DatePickerDialog.OnDateSetListener() {

        @Override
        public void onDateSet(DatePicker arg0, int year, int month, int day) {


            calender.set(Calendar.YEAR,year);
            calender.set(Calendar.MONTH,month);
            calender.set(Calendar.DAY_OF_MONTH,day);
            updatelabel8();


        }
    };


    public void updatelabel9()
    {


        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String dueDate = df.format(calender.getTime());


        sufoEnd1.setText(dueDate);



    }
    public void setDate9()
    {
        new DatePickerDialog(calendar_staff.this,d9,
                calender.get(Calendar.YEAR),calender.get(Calendar.MONTH),calender.get(Calendar.DAY_OF_MONTH)).show();
    }
    DatePickerDialog.OnDateSetListener d9=new DatePickerDialog.OnDateSetListener() {

        @Override
        public void onDateSet(DatePicker arg0, int year, int month, int day) {


            calender.set(Calendar.YEAR,year);
            calender.set(Calendar.MONTH,month);
            calender.set(Calendar.DAY_OF_MONTH,day);
            updatelabel9();


        }
    };


    public void updatelabel10()
    {


        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String dueDate = df.format(calender.getTime());


        exitStart1.setText(dueDate);



    }
    public void setDate10()
    {
        new DatePickerDialog(calendar_staff.this,d10,
                calender.get(Calendar.YEAR),calender.get(Calendar.MONTH),calender.get(Calendar.DAY_OF_MONTH)).show();
    }
    DatePickerDialog.OnDateSetListener d10=new DatePickerDialog.OnDateSetListener() {

        @Override
        public void onDateSet(DatePicker arg0, int year, int month, int day) {


            calender.set(Calendar.YEAR,year);
            calender.set(Calendar.MONTH,month);
            calender.set(Calendar.DAY_OF_MONTH,day);
            updatelabel10();


        }
    };


    public void updatelabel11()
    {


        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String dueDate = df.format(calender.getTime());


        exitEnd1.setText(dueDate);



    }
    public void setDate11()
    {
        new DatePickerDialog(calendar_staff.this,d11,
                calender.get(Calendar.YEAR),calender.get(Calendar.MONTH),calender.get(Calendar.DAY_OF_MONTH)).show();
    }
    DatePickerDialog.OnDateSetListener d11=new DatePickerDialog.OnDateSetListener() {

        @Override
        public void onDateSet(DatePicker arg0, int year, int month, int day) {


            calender.set(Calendar.YEAR,year);
            calender.set(Calendar.MONTH,month);
            calender.set(Calendar.DAY_OF_MONTH,day);
            updatelabel11();


        }
    };


    public void updatelabel12()
    {


        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String dueDate = df.format(calender.getTime());


        studyweekStart1.setText(dueDate);



    }
    public void setDate12()
    {
        new DatePickerDialog(calendar_staff.this,d12,
                calender.get(Calendar.YEAR),calender.get(Calendar.MONTH),calender.get(Calendar.DAY_OF_MONTH)).show();
    }
    DatePickerDialog.OnDateSetListener d12=new DatePickerDialog.OnDateSetListener() {

        @Override
        public void onDateSet(DatePicker arg0, int year, int month, int day) {


            calender.set(Calendar.YEAR,year);
            calender.set(Calendar.MONTH,month);
            calender.set(Calendar.DAY_OF_MONTH,day);
            updatelabel12();


        }
    };


    public void updatelabel13()
    {


        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String dueDate = df.format(calender.getTime());


        studyweekEnd1.setText(dueDate);



    }
    public void setDate13()
    {
        new DatePickerDialog(calendar_staff.this,d13,
                calender.get(Calendar.YEAR),calender.get(Calendar.MONTH),calender.get(Calendar.DAY_OF_MONTH)).show();
    }
    DatePickerDialog.OnDateSetListener d13=new DatePickerDialog.OnDateSetListener() {

        @Override
        public void onDateSet(DatePicker arg0, int year, int month, int day) {


            calender.set(Calendar.YEAR,year);
            calender.set(Calendar.MONTH,month);
            calender.set(Calendar.DAY_OF_MONTH,day);
            updatelabel13();


        }
    };


    public void updatelabel14()
    {


        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String dueDate = df.format(calender.getTime());


        examStart1.setText(dueDate);



    }
    public void setDate14()
    {
        new DatePickerDialog(calendar_staff.this,d14,
                calender.get(Calendar.YEAR),calender.get(Calendar.MONTH),calender.get(Calendar.DAY_OF_MONTH)).show();
    }
    DatePickerDialog.OnDateSetListener d14=new DatePickerDialog.OnDateSetListener() {

        @Override
        public void onDateSet(DatePicker arg0, int year, int month, int day) {


            calender.set(Calendar.YEAR,year);
            calender.set(Calendar.MONTH,month);
            calender.set(Calendar.DAY_OF_MONTH,day);
            updatelabel14();


        }
    };


    public void updatelabel15()
    {


        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String dueDate = df.format(calender.getTime());


        examEnd1.setText(dueDate);



    }
    public void setDate15()
    {
        new DatePickerDialog(calendar_staff.this,d15,
                calender.get(Calendar.YEAR),calender.get(Calendar.MONTH),calender.get(Calendar.DAY_OF_MONTH)).show();
    }
    DatePickerDialog.OnDateSetListener d15=new DatePickerDialog.OnDateSetListener() {

        @Override
        public void onDateSet(DatePicker arg0, int year, int month, int day) {


            calender.set(Calendar.YEAR,year);
            calender.set(Calendar.MONTH,month);
            calender.set(Calendar.DAY_OF_MONTH,day);
            updatelabel15();


        }
    };


    public void updatelabel16()
    {


        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String dueDate = df.format(calender.getTime());


        resultDate1.setText(dueDate);



    }
    public void setDate16()
    {
        new DatePickerDialog(calendar_staff.this,d16,
                calender.get(Calendar.YEAR),calender.get(Calendar.MONTH),calender.get(Calendar.DAY_OF_MONTH)).show();
    }
    DatePickerDialog.OnDateSetListener d16=new DatePickerDialog.OnDateSetListener() {

        @Override
        public void onDateSet(DatePicker arg0, int year, int month, int day) {


            calender.set(Calendar.YEAR,year);
            calender.set(Calendar.MONTH,month);
            calender.set(Calendar.DAY_OF_MONTH,day);
            updatelabel16();


        }
    };


    public void updatelabel17()
    {


        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String dueDate = df.format(calender.getTime());


        examKhasStart1.setText(dueDate);



    }
    public void setDate17()
    {
        new DatePickerDialog(calendar_staff.this,d17,
                calender.get(Calendar.YEAR),calender.get(Calendar.MONTH),calender.get(Calendar.DAY_OF_MONTH)).show();
    }
    DatePickerDialog.OnDateSetListener d17=new DatePickerDialog.OnDateSetListener() {

        @Override
        public void onDateSet(DatePicker arg0, int year, int month, int day) {


            calender.set(Calendar.YEAR,year);
            calender.set(Calendar.MONTH,month);
            calender.set(Calendar.DAY_OF_MONTH,day);
            updatelabel17();


        }
    };


    public void updatelabel18()
    {


        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String dueDate = df.format(calender.getTime());


        examKhasEnd1.setText(dueDate);



    }
    public void setDate18()
    {
        new DatePickerDialog(calendar_staff.this,d18,
                calender.get(Calendar.YEAR),calender.get(Calendar.MONTH),calender.get(Calendar.DAY_OF_MONTH)).show();
    }
    DatePickerDialog.OnDateSetListener d18=new DatePickerDialog.OnDateSetListener() {

        @Override
        public void onDateSet(DatePicker arg0, int year, int month, int day) {


            calender.set(Calendar.YEAR,year);
            calender.set(Calendar.MONTH,month);
            calender.set(Calendar.DAY_OF_MONTH,day);
            updatelabel18();


        }
    };


    public void updatelabel19()
    {


        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String dueDate = df.format(calender.getTime());


        cutisemStart1.setText(dueDate);



    }
    public void setDate19()
    {
        new DatePickerDialog(calendar_staff.this,d19,
                calender.get(Calendar.YEAR),calender.get(Calendar.MONTH),calender.get(Calendar.DAY_OF_MONTH)).show();
    }
    DatePickerDialog.OnDateSetListener d19=new DatePickerDialog.OnDateSetListener() {

        @Override
        public void onDateSet(DatePicker arg0, int year, int month, int day) {


            calender.set(Calendar.YEAR,year);
            calender.set(Calendar.MONTH,month);
            calender.set(Calendar.DAY_OF_MONTH,day);
            updatelabel19();


        }
    };


    public void updatelabel20()
    {


        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String dueDate = df.format(calender.getTime());


        cutisemEnd1.setText(dueDate);



    }
    public void setDate20()
    {
        new DatePickerDialog(calendar_staff.this,d20,
                calender.get(Calendar.YEAR),calender.get(Calendar.MONTH),calender.get(Calendar.DAY_OF_MONTH)).show();
    }
    DatePickerDialog.OnDateSetListener d20=new DatePickerDialog.OnDateSetListener() {

        @Override
        public void onDateSet(DatePicker arg0, int year, int month, int day) {


            calender.set(Calendar.YEAR,year);
            calender.set(Calendar.MONTH,month);
            calender.set(Calendar.DAY_OF_MONTH,day);
            updatelabel20();


        }
    };




    @Override
    public void onClick(View v) {
        switch (v.getId()){




            case R.id.imageButton1:
                setDate();
                break;

            case R.id.imageButton2:
                setDate1();
                break;

            case R.id.imageButton3:
                setDate2();
                break;

            case R.id.imageButton4:
                setDate3();
                break;

            case R.id.imageButton5:
                setDate4();
                break;

            case R.id.imageButton6:
                setDate5();
                break;

            case R.id.imageButton7:
                setDate6();
                break;

            case R.id.imageButton8:
                setDate7();
                break;

            case R.id.imageButton9:
                setDate8();
                break;

            case R.id.imageButton10:
                setDate9();
                break;

            case R.id.imageButton11:
                setDate10();
                break;

            case R.id.imageButton12:
                setDate11();
                break;

            case R.id.imageButton13:
                setDate12();
                break;

            case R.id.imageButton14:
                setDate13();
                break;

            case R.id.imageButton15:
                setDate14();
                break;

            case R.id.imageButton16:
                setDate15();
                break;

            case R.id.imageButton17:
                setDate16();
                break;

            case R.id.imageButton18:
                setDate17();
                break;

            case R.id.imageButton19:
                setDate18();
                break;

            case R.id.imageButton20:
                setDate19();
                break;

            case R.id.imageButton21:
                setDate20();
                break;

//            case R.id.toast:
//                Toast.makeText(calendar_staff.this, kuliahStart1.getText().toString(), Toast.LENGTH_LONG)
//                        .show();
//                break;
            case R.id.bSubmit:



                String calSession = calSession1.getText().toString();
                String kuliahStart = kuliahStart1.getText().toString();
                String kuliahEnd = kuliahEnd1.getText().toString();
                String entranceStart = entranceStart1.getText().toString();
                String entranceEnd = entranceEnd1.getText().toString();
                String cutiPertStart = cutiPertStart1.getText().toString();
                String cutiPertEnd = cutiPertEnd1.getText().toString();
                String kuliah2Start = kuliah2Start1.getText().toString();
                String kuliah2End = kuliah2End1.getText().toString();
                String sufoStart = sufoStart1.getText().toString();
                String sufoEnd = sufoEnd1.getText().toString();
                String exitStart = exitStart1.getText().toString();
                String exitEnd = exitEnd1.getText().toString();
                String studyweekStart = studyweekStart1.getText().toString();
                String studyweekEnd = studyweekEnd1.getText().toString();
                String examStart = examStart1.getText().toString();
                String examEnd = examEnd1.getText().toString();
                String resultDate = resultDate1.getText().toString();
                String examKhasStart = examKhasStart1.getText().toString();
                String examKhasEnd = examKhasEnd1.getText().toString();
                String cutisemStart = cutisemStart1.getText().toString();
                String cutisemEnd = cutisemEnd1.getText().toString();

                userStaffCalendar userStaffCalendar = new userStaffCalendar(calSession,kuliahStart,kuliahEnd,entranceStart,entranceEnd,cutiPertStart,cutiPertEnd,kuliah2Start,kuliah2End,sufoStart,sufoEnd,exitStart,exitEnd,studyweekStart,studyweekEnd,examStart,examEnd,resultDate,examKhasStart,examKhasEnd,cutisemStart,cutisemEnd);
                registerUserCalendar(userStaffCalendar);
                break;


            case R.id.bCalendarStaff:
                startActivity(new Intent(this,calendar_staff_update.class));
                break;
            case R.id.tvLogoutStaff:


                startActivity(new Intent(this, loginStaff.class));

        }

    }


    private void registerUserCalendar(userStaffCalendar userStaffCalendar){
        ServerRequestStaffCalendar serverRequestsStaffCalendar = new ServerRequestStaffCalendar(this);
        serverRequestsStaffCalendar.storeUserDataInBackground(userStaffCalendar, new GetUserCallBackStaffCalendar() {
            @Override
            public void done(userStaffCalendar returnedUserStaffCalendar) {
                startActivity(new Intent(calendar_staff.this, calendar_staff_update.class));
            }
        });
    }





}
