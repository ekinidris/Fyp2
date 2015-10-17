package com.example.win7.fyp;

import android.app.DatePickerDialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import android.widget.Toast;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONObject;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class calendar_staff_next extends ActionBarActivity implements View.OnClickListener {
    JsonParser jParser = new JsonParser();
    String url_update_mhs = "http:ekinidris.site40.net/update_mhs.php";
    String url_delete_mhs = "http:ekinidris.site40.net/delete_mhs.php";
    //     JSON Node names, ini harus sesuai yang di API
    public static final String TAG_SUCCESS = "success";
    public static final String TAG_calID = "calID";
    public static final String TAG_calSession = "calSession";
    public static final String TAG_kuliahStart = "kuliahStart";
    public static final String TAG_kuliahEnd = "kuliahEnd";
    public static final String TAG_entranceStart = "entranceStart";
    public static final String TAG_entranceEnd = "entranceEnd";
    public static final String TAG_cutiPertStart = "cutiPertStart";
    public static final String TAG_cutiPertEnd = "cutiPertEnd";
    public static final String TAG_NIM_MHS3 = "kuliah2Start";
    public static final String TAG_NIM_MHS4 = "kuliah2End";
    public static final String TAG_NIM_MHS5 = "sufoStart";
    public static final String TAG_NIM_MHS6 = "sufoEnd";
    public static final String TAG_NIM_MHS7 = "exitStart";
    public static final String TAG_NIM_MHS8 = "exitEnd";
    public static final String TAG_NIM_MHS9 = "studyweekStart";
    public static final String TAG_NIM_MHS10 = "studyweekEnd";
    public static final String TAG_NIM_MHS11 = "examStart";
    public static final String TAG_NIM_MHS12 = "examEnd";
    public static final String TAG_NIM_MHS13 = "resultDate";
    public static final String TAG_NIM_MHS14 = "examKhasStart";
    public static final String TAG_NIM_MHS15 = "examKhasEnd";
    public static final String TAG_NIM_MHS16 = "cutisemStart";
    public static final String TAG_NIM_MHS17 = "cutisemEnd";
    EditText EditTxtnama, EditTxtnim;
    TextView TxtViewId;
    Button UpdateBtn, DeleteBtn;
    String namaStr, nimStr, idStr;

    DateFormat format = DateFormat.getDateInstance();

    Calendar calender = Calendar.getInstance();

    TextView kuliahStart4;
    TextView calID4,
            calSession4,
            entranceStart4,
            entranceEnd4,
            kuliahEnd4,
            cutiPertStart4,
            cutiPertEnd4,
            kuliah2Start4,
            kuliah2End4,
            sufoStart4,
            sufoEnd4,
            exitStart4,
            exitEnd4,
            studyweekStart4,
            studyweekEnd4,
            examStart4,
            examEnd4,
            resultDate4,
            examKhasStart4,
            examKhasEnd4,
            cutisemStart4,
            cutisemEnd4;

    String calID6,
            calSession6,
            kuliahStart6,
            kuliahEnd6,
            entranceStart6,
            entranceEnd6,
            cutiPertStart6,
            cutiPertEnd6,
            kuliah2Start6,
            kuliah2End6,
            sufoStart6,
            sufoEnd6,
            exitStart6,
            exitEnd6,
            studyweekStart6,
            studyweekEnd6,
            examStart6,
            examEnd6,
            resultDate6,
            examKhasStart6,
            examKhasEnd6,
            cutisemStart6,
            cutisemEnd6;

    ImageButton ib, ib1, ib2, ib3, ib4, ib5, ib6, ib7, ib8, ib9, ib10, ib11, ib12, ib13, ib14, ib15, ib16, ib17, ib18, ib19, ib20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar_staff_next);

//        EditTxtnama = (EditText) findViewById(R.id.editTextNama);
//        EditTxtnim = (EditText) findViewById(R.id.editTextNim);
        calID4 = (EditText) findViewById(R.id.calID1);
        calSession4 = (EditText) findViewById(R.id.calSession1);
        kuliahStart4 = (EditText) findViewById(R.id.kuliahStart1);
        kuliahEnd4 = (EditText) findViewById(R.id.kuliahEnd1);
        entranceStart4 = (EditText) findViewById(R.id.entranceStart1);
        entranceEnd4 = (EditText) findViewById(R.id.entranceEnd1);
        cutiPertStart4 = (EditText) findViewById(R.id.cutiPertStart1);
        cutiPertEnd4 = (EditText) findViewById(R.id.cutiPertEnd1);
        kuliah2Start4 = (EditText) findViewById(R.id.kuliah2Start1);
        kuliah2End4 = (EditText) findViewById(R.id.kuliah2End1);
        sufoStart4 = (EditText) findViewById(R.id.sufoStart1);
        sufoEnd4 = (EditText) findViewById(R.id.sufoEnd1);
        exitStart4 = (EditText) findViewById(R.id.exitStart1);
        exitEnd4 = (EditText) findViewById(R.id.exitEnd1);
        studyweekStart4 = (EditText) findViewById(R.id.studyweekStart1);
        studyweekEnd4 = (EditText) findViewById(R.id.studyweekEnd1);
        examStart4 = (EditText) findViewById(R.id.examStart1);
        examEnd4 = (EditText) findViewById(R.id.examEnd1);
        resultDate4 = (EditText) findViewById(R.id.resultDate1);
        examKhasStart4 = (EditText) findViewById(R.id.examKhasStart1);
        examKhasEnd4 = (EditText) findViewById(R.id.examKhasEnd1);
        cutisemStart4 = (EditText) findViewById(R.id.cutisemStart1);
        cutisemEnd4 = (EditText) findViewById(R.id.cutisemEnd1);

        UpdateBtn = (Button) findViewById(R.id.buttonUpdate);
        DeleteBtn = (Button) findViewById(R.id.buttonDelete);

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


//        /menangkap bundle yang telah di-parsed dari MainActivity
        Bundle b = getIntent().getExtras();
//        String isi_id_mhs = b.getString("id_mhs");
//        String isi_nama_mhs= b.getString("nama_mhs");
//        String isi_nim_mhs= b.getString("nim_mhs");

        String calID5 = b.getString("calID");
        String calSession5 = b.getString("calSession");
        String kuliahStart5 = b.getString("kuliahStart");
        String kuliahEnd5 = b.getString("kuliahEnd");
        String entranceStart5 = b.getString("entranceStart");
        String entranceEnd5 = b.getString("entranceEnd");
        String cutiPertStart5 = b.getString("cutiPertStart");
        String cutiPertEnd5 = b.getString("cutiPertEnd");
        String kuliah2Start5 = b.getString("kuliah2Start");
        String kuliah2End5 = b.getString("kuliah2End");
        String sufoStart5 = b.getString("sufoStart");
        String sufoEnd5 = b.getString("sufoEnd");
        String exitStart5 = b.getString("exitStart");
        String exitEnd5 = b.getString("exitEnd");
        String studyweekStart5 = b.getString("studyweekStart");
        String studyweekEnd5 = b.getString("studyweekEnd");
        String examStart5 = b.getString("examStart");
        String examEnd5 = b.getString("examEnd");
        String resultDate5 = b.getString("resultDate");
        String examKhasStart5 = b.getString("examKhasStart");
        String examKhasEnd5 = b.getString("examKhasEnd");
        String cutisemStart5 = b.getString("cutisemStart");
        String cutisemEnd5 = b.getString("cutisemEnd");


//        meng-set bundle tersebut
//        EditTxtnama.setText(isi_nama_mhs);
//        EditTxtnim.setText(isi_nim_mhs);
//        TxtViewId.setText(isi_id_mhs);

        calID4.setText(calID5);
        calSession4.setText(calSession5);
        kuliahStart4.setText(kuliahStart5);
        kuliahEnd4.setText(kuliahEnd5);
        entranceStart4.setText(entranceStart5);
        entranceEnd4.setText(entranceEnd5);
        cutiPertStart4.setText(cutiPertStart5);
        cutiPertEnd4.setText(cutiPertEnd5);
        kuliah2Start4.setText(kuliah2Start5);
        kuliah2End4.setText(kuliah2End5);
        sufoStart4.setText(sufoStart5);
        sufoEnd4.setText(sufoEnd5);
        exitStart4.setText(exitStart5);
        exitEnd4.setText(exitEnd5);
        studyweekStart4.setText(studyweekStart5);
        studyweekEnd4.setText(studyweekEnd5);
        examStart4.setText(examStart5);
        examEnd4.setText(examEnd5);
        resultDate4.setText(resultDate5);
        examKhasStart4.setText(examKhasStart5);
        examKhasEnd4.setText(examKhasEnd5);
        cutisemStart4.setText(cutisemStart5);
        cutisemEnd4.setText(cutisemEnd5);


//        updatelabel();
//        updatelabel1();
//        updatelabel2();
//        updatelabel3();


//        updatelabel4();
//        updatelabel5();
//        updatelabel6();
//        updatelabel7();
//        updatelabel8();
//        updatelabel9();
//        updatelabel10();
//        updatelabel11();
//        updatelabel12();
//        updatelabel13();
//        updatelabel14();
//        updatelabel15();
//        updatelabel16();
//        updatelabel17();
//        updatelabel18();
//        updatelabel19();
//        updatelabel20();


//        UpdateBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                idStr = TxtViewId.getText().toString();
//                namaStr = EditTxtnama.getText().toString();
//                nimStr = EditTxtnim.getText().toString();
//                new UpdateMhsTask().execute();
//            }
//        });


        UpdateBtn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calID6 = calID4.getText().toString();
                calSession6 = calSession4.getText().toString();
                kuliahStart6 = kuliahStart4.getText().toString();
                kuliahEnd6 = kuliahEnd4.getText().toString();
                entranceStart6 = entranceStart4.getText().toString();
                entranceEnd6 = entranceEnd4.getText().toString();
                cutiPertStart6 = cutiPertStart4.getText().toString();
                cutiPertEnd6 = cutiPertEnd4.getText().toString();
                kuliah2Start6 = kuliah2Start4.getText().toString();
                kuliah2End6 = kuliah2End4.getText().toString();
                sufoStart6 = sufoStart4.getText().toString();
                sufoEnd6 = sufoEnd4.getText().toString();
                exitStart6 = exitStart4.getText().toString();
                exitEnd6 = exitEnd4.getText().toString();
                studyweekStart6 = studyweekStart4.getText().toString();
                studyweekEnd6 = studyweekEnd4.getText().toString();
                examStart6 = examStart4.getText().toString();
                examEnd6 = examEnd4.getText().toString();
                resultDate6 = resultDate4.getText().toString();
                examKhasStart6 = examKhasStart4.getText().toString();
                examKhasEnd6 = examKhasEnd4.getText().toString();
                cutisemStart6 = cutisemStart4.getText().toString();
                cutisemEnd6 = cutisemEnd4.getText().toString();

                new UpdateMhsTask().execute();
            }
        });

        DeleteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calID6 = calID4.getText().toString();

                new DeleteMhsTask().execute();
            }
        });




    }

    public void updatelabel() {


        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String dueDate = df.format(calender.getTime());


           kuliahStart4.setText(dueDate);


    }

    public void setDate() {
        new DatePickerDialog(calendar_staff_next.this, d,
                calender.get(Calendar.YEAR), calender.get(Calendar.MONTH), calender.get(Calendar.DAY_OF_MONTH)).show();
    }

    DatePickerDialog.OnDateSetListener d = new DatePickerDialog.OnDateSetListener() {

        @Override
        public void onDateSet(DatePicker arg0, int year, int month, int day) {


            calender.set(Calendar.YEAR, year);
            calender.set(Calendar.MONTH, month);
            calender.set(Calendar.DAY_OF_MONTH, day);
            updatelabel();


        }
    };


    public void updatelabel1() {


        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String dueDate = df.format(calender.getTime());


        kuliahEnd4.setText(dueDate);


    }

    public void setDate1() {
        new DatePickerDialog(calendar_staff_next.this, d1,
                calender.get(Calendar.YEAR), calender.get(Calendar.MONTH), calender.get(Calendar.DAY_OF_MONTH)).show();
    }

    DatePickerDialog.OnDateSetListener d1 = new DatePickerDialog.OnDateSetListener() {

        @Override
        public void onDateSet(DatePicker arg0, int year, int month, int day) {


            calender.set(Calendar.YEAR, year);
            calender.set(Calendar.MONTH, month);
            calender.set(Calendar.DAY_OF_MONTH, day);
            updatelabel1();


        }
    };


    public void updatelabel2() {


        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String dueDate = df.format(calender.getTime());


        entranceStart4.setText(dueDate);


    }

    public void setDate2() {
        new DatePickerDialog(calendar_staff_next.this, d2,
                calender.get(Calendar.YEAR), calender.get(Calendar.MONTH), calender.get(Calendar.DAY_OF_MONTH)).show();
    }

    DatePickerDialog.OnDateSetListener d2 = new DatePickerDialog.OnDateSetListener() {

        @Override
        public void onDateSet(DatePicker arg0, int year, int month, int day) {


            calender.set(Calendar.YEAR, year);
            calender.set(Calendar.MONTH, month);
            calender.set(Calendar.DAY_OF_MONTH, day);
            updatelabel2();


        }
    };


    public void updatelabel3() {


        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String dueDate = df.format(calender.getTime());


        entranceEnd4.setText(dueDate);


    }

    public void setDate3() {
        new DatePickerDialog(calendar_staff_next.this, d3,
                calender.get(Calendar.YEAR), calender.get(Calendar.MONTH), calender.get(Calendar.DAY_OF_MONTH)).show();
    }

    DatePickerDialog.OnDateSetListener d3 = new DatePickerDialog.OnDateSetListener() {

        @Override
        public void onDateSet(DatePicker arg0, int year, int month, int day) {


            calender.set(Calendar.YEAR, year);
            calender.set(Calendar.MONTH, month);
            calender.set(Calendar.DAY_OF_MONTH, day);
            updatelabel3();


        }
    };


    public void updatelabel4() {


        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String dueDate = df.format(calender.getTime());


        cutiPertStart4.setText(dueDate);


    }

    public void setDate4() {
        new DatePickerDialog(calendar_staff_next.this, d4,
                calender.get(Calendar.YEAR), calender.get(Calendar.MONTH), calender.get(Calendar.DAY_OF_MONTH)).show();
    }

    DatePickerDialog.OnDateSetListener d4 = new DatePickerDialog.OnDateSetListener() {

        @Override
        public void onDateSet(DatePicker arg0, int year, int month, int day) {


            calender.set(Calendar.YEAR, year);
            calender.set(Calendar.MONTH, month);
            calender.set(Calendar.DAY_OF_MONTH, day);
            updatelabel4();


        }
    };


    public void updatelabel5() {


        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String dueDate = df.format(calender.getTime());


        cutiPertEnd4.setText(dueDate);


    }

    public void setDate5() {
        new DatePickerDialog(calendar_staff_next.this, d5,
                calender.get(Calendar.YEAR), calender.get(Calendar.MONTH), calender.get(Calendar.DAY_OF_MONTH)).show();
    }

    DatePickerDialog.OnDateSetListener d5 = new DatePickerDialog.OnDateSetListener() {

        @Override
        public void onDateSet(DatePicker arg0, int year, int month, int day) {


            calender.set(Calendar.YEAR, year);
            calender.set(Calendar.MONTH, month);
            calender.set(Calendar.DAY_OF_MONTH, day);
            updatelabel5();


        }
    };


    public void updatelabel6() {


        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String dueDate = df.format(calender.getTime());


        kuliah2Start4.setText(dueDate);


    }

    public void setDate6() {
        new DatePickerDialog(calendar_staff_next.this, d6,
                calender.get(Calendar.YEAR), calender.get(Calendar.MONTH), calender.get(Calendar.DAY_OF_MONTH)).show();
    }

    DatePickerDialog.OnDateSetListener d6 = new DatePickerDialog.OnDateSetListener() {

        @Override
        public void onDateSet(DatePicker arg0, int year, int month, int day) {


            calender.set(Calendar.YEAR, year);
            calender.set(Calendar.MONTH, month);
            calender.set(Calendar.DAY_OF_MONTH, day);
            updatelabel6();


        }
    };


    public void updatelabel7() {


        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String dueDate = df.format(calender.getTime());


        kuliah2End4.setText(dueDate);


    }

    public void setDate7() {
        new DatePickerDialog(calendar_staff_next.this, d7,
                calender.get(Calendar.YEAR), calender.get(Calendar.MONTH), calender.get(Calendar.DAY_OF_MONTH)).show();
    }

    DatePickerDialog.OnDateSetListener d7 = new DatePickerDialog.OnDateSetListener() {

        @Override
        public void onDateSet(DatePicker arg0, int year, int month, int day) {


            calender.set(Calendar.YEAR, year);
            calender.set(Calendar.MONTH, month);
            calender.set(Calendar.DAY_OF_MONTH, day);
            updatelabel7();


        }
    };


    public void updatelabel8() {


        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String dueDate = df.format(calender.getTime());


        sufoStart4.setText(dueDate);


    }

    public void setDate8() {
        new DatePickerDialog(calendar_staff_next.this, d8,
                calender.get(Calendar.YEAR), calender.get(Calendar.MONTH), calender.get(Calendar.DAY_OF_MONTH)).show();
    }

    DatePickerDialog.OnDateSetListener d8 = new DatePickerDialog.OnDateSetListener() {

        @Override
        public void onDateSet(DatePicker arg0, int year, int month, int day) {


            calender.set(Calendar.YEAR, year);
            calender.set(Calendar.MONTH, month);
            calender.set(Calendar.DAY_OF_MONTH, day);
            updatelabel8();


        }
    };


    public void updatelabel9() {


        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String dueDate = df.format(calender.getTime());


        sufoEnd4.setText(dueDate);


    }

    public void setDate9() {
        new DatePickerDialog(calendar_staff_next.this, d9,
                calender.get(Calendar.YEAR), calender.get(Calendar.MONTH), calender.get(Calendar.DAY_OF_MONTH)).show();
    }

    DatePickerDialog.OnDateSetListener d9 = new DatePickerDialog.OnDateSetListener() {

        @Override
        public void onDateSet(DatePicker arg0, int year, int month, int day) {


            calender.set(Calendar.YEAR, year);
            calender.set(Calendar.MONTH, month);
            calender.set(Calendar.DAY_OF_MONTH, day);
            updatelabel9();


        }
    };


    public void updatelabel10() {


        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String dueDate = df.format(calender.getTime());


        exitStart4.setText(dueDate);


    }

    public void setDate10() {
        new DatePickerDialog(calendar_staff_next.this, d10,
                calender.get(Calendar.YEAR), calender.get(Calendar.MONTH), calender.get(Calendar.DAY_OF_MONTH)).show();
    }

    DatePickerDialog.OnDateSetListener d10 = new DatePickerDialog.OnDateSetListener() {

        @Override
        public void onDateSet(DatePicker arg0, int year, int month, int day) {


            calender.set(Calendar.YEAR, year);
            calender.set(Calendar.MONTH, month);
            calender.set(Calendar.DAY_OF_MONTH, day);
            updatelabel10();


        }
    };


    public void updatelabel11() {


        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String dueDate = df.format(calender.getTime());


        exitEnd4.setText(dueDate);


    }

    public void setDate11() {
        new DatePickerDialog(calendar_staff_next.this, d11,
                calender.get(Calendar.YEAR), calender.get(Calendar.MONTH), calender.get(Calendar.DAY_OF_MONTH)).show();
    }

    DatePickerDialog.OnDateSetListener d11 = new DatePickerDialog.OnDateSetListener() {

        @Override
        public void onDateSet(DatePicker arg0, int year, int month, int day) {


            calender.set(Calendar.YEAR, year);
            calender.set(Calendar.MONTH, month);
            calender.set(Calendar.DAY_OF_MONTH, day);
            updatelabel11();


        }
    };


    public void updatelabel12() {


        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String dueDate = df.format(calender.getTime());


        studyweekStart4.setText(dueDate);


    }

    public void setDate12() {
        new DatePickerDialog(calendar_staff_next.this, d12,
                calender.get(Calendar.YEAR), calender.get(Calendar.MONTH), calender.get(Calendar.DAY_OF_MONTH)).show();
    }

    DatePickerDialog.OnDateSetListener d12 = new DatePickerDialog.OnDateSetListener() {

        @Override
        public void onDateSet(DatePicker arg0, int year, int month, int day) {


            calender.set(Calendar.YEAR, year);
            calender.set(Calendar.MONTH, month);
            calender.set(Calendar.DAY_OF_MONTH, day);
            updatelabel12();


        }
    };


    public void updatelabel13() {


        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String dueDate = df.format(calender.getTime());


        studyweekEnd4.setText(dueDate);


    }

    public void setDate13() {
        new DatePickerDialog(calendar_staff_next.this, d13,
                calender.get(Calendar.YEAR), calender.get(Calendar.MONTH), calender.get(Calendar.DAY_OF_MONTH)).show();
    }

    DatePickerDialog.OnDateSetListener d13 = new DatePickerDialog.OnDateSetListener() {

        @Override
        public void onDateSet(DatePicker arg0, int year, int month, int day) {


            calender.set(Calendar.YEAR, year);
            calender.set(Calendar.MONTH, month);
            calender.set(Calendar.DAY_OF_MONTH, day);
            updatelabel13();


        }
    };


    public void updatelabel14() {


        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String dueDate = df.format(calender.getTime());


        examStart4.setText(dueDate);


    }

    public void setDate14() {
        new DatePickerDialog(calendar_staff_next.this, d14,
                calender.get(Calendar.YEAR), calender.get(Calendar.MONTH), calender.get(Calendar.DAY_OF_MONTH)).show();
    }

    DatePickerDialog.OnDateSetListener d14 = new DatePickerDialog.OnDateSetListener() {

        @Override
        public void onDateSet(DatePicker arg0, int year, int month, int day) {


            calender.set(Calendar.YEAR, year);
            calender.set(Calendar.MONTH, month);
            calender.set(Calendar.DAY_OF_MONTH, day);
            updatelabel14();


        }
    };


    public void updatelabel15() {


        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String dueDate = df.format(calender.getTime());


        examEnd4.setText(dueDate);


    }

    public void setDate15() {
        new DatePickerDialog(calendar_staff_next.this, d15,
                calender.get(Calendar.YEAR), calender.get(Calendar.MONTH), calender.get(Calendar.DAY_OF_MONTH)).show();
    }

    DatePickerDialog.OnDateSetListener d15 = new DatePickerDialog.OnDateSetListener() {

        @Override
        public void onDateSet(DatePicker arg0, int year, int month, int day) {


            calender.set(Calendar.YEAR, year);
            calender.set(Calendar.MONTH, month);
            calender.set(Calendar.DAY_OF_MONTH, day);
            updatelabel15();


        }
    };


    public void updatelabel16() {


        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String dueDate = df.format(calender.getTime());


        resultDate4.setText(dueDate);


    }

    public void setDate16() {
        new DatePickerDialog(calendar_staff_next.this, d16,
                calender.get(Calendar.YEAR), calender.get(Calendar.MONTH), calender.get(Calendar.DAY_OF_MONTH)).show();
    }

    DatePickerDialog.OnDateSetListener d16 = new DatePickerDialog.OnDateSetListener() {

        @Override
        public void onDateSet(DatePicker arg0, int year, int month, int day) {


            calender.set(Calendar.YEAR, year);
            calender.set(Calendar.MONTH, month);
            calender.set(Calendar.DAY_OF_MONTH, day);
            updatelabel16();


        }
    };


    public void updatelabel17() {


        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String dueDate = df.format(calender.getTime());


        examKhasStart4.setText(dueDate);


    }

    public void setDate17() {
        new DatePickerDialog(calendar_staff_next.this, d17,
                calender.get(Calendar.YEAR), calender.get(Calendar.MONTH), calender.get(Calendar.DAY_OF_MONTH)).show();
    }

    DatePickerDialog.OnDateSetListener d17 = new DatePickerDialog.OnDateSetListener() {

        @Override
        public void onDateSet(DatePicker arg0, int year, int month, int day) {


            calender.set(Calendar.YEAR, year);
            calender.set(Calendar.MONTH, month);
            calender.set(Calendar.DAY_OF_MONTH, day);
            updatelabel17();


        }
    };


    public void updatelabel18() {


        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String dueDate = df.format(calender.getTime());


        examKhasEnd4.setText(dueDate);


    }

    public void setDate18() {
        new DatePickerDialog(calendar_staff_next.this, d18,
                calender.get(Calendar.YEAR), calender.get(Calendar.MONTH), calender.get(Calendar.DAY_OF_MONTH)).show();
    }

    DatePickerDialog.OnDateSetListener d18 = new DatePickerDialog.OnDateSetListener() {

        @Override
        public void onDateSet(DatePicker arg0, int year, int month, int day) {


            calender.set(Calendar.YEAR, year);
            calender.set(Calendar.MONTH, month);
            calender.set(Calendar.DAY_OF_MONTH, day);
            updatelabel18();


        }
    };


    public void updatelabel19() {


        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String dueDate = df.format(calender.getTime());


        cutisemStart4.setText(dueDate);


    }

    public void setDate19() {
        new DatePickerDialog(calendar_staff_next.this, d19,
                calender.get(Calendar.YEAR), calender.get(Calendar.MONTH), calender.get(Calendar.DAY_OF_MONTH)).show();
    }

    DatePickerDialog.OnDateSetListener d19 = new DatePickerDialog.OnDateSetListener() {

        @Override
        public void onDateSet(DatePicker arg0, int year, int month, int day) {


            calender.set(Calendar.YEAR, year);
            calender.set(Calendar.MONTH, month);
            calender.set(Calendar.DAY_OF_MONTH, day);
            updatelabel19();


        }
    };


    public void updatelabel20() {


        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String dueDate = df.format(calender.getTime());


        cutisemEnd4.setText(dueDate);


    }

    public void setDate20() {
        new DatePickerDialog(calendar_staff_next.this, d20,
                calender.get(Calendar.YEAR), calender.get(Calendar.MONTH), calender.get(Calendar.DAY_OF_MONTH)).show();
    }

    DatePickerDialog.OnDateSetListener d20 = new DatePickerDialog.OnDateSetListener() {

        @Override
        public void onDateSet(DatePicker arg0, int year, int month, int day) {


            calender.set(Calendar.YEAR, year);
            calender.set(Calendar.MONTH, month);
            calender.set(Calendar.DAY_OF_MONTH, day);
            updatelabel20();


        }
    };


    @Override
    public void onClick(View v) {
        switch (v.getId()) {


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
//                Toast.makeText(calendar_staff_next.this, kuliahStart1.getText().toString(), Toast.LENGTH_LONG)
//                        .show();
//                break;

        }

    }

    class UpdateMhsTask extends AsyncTask<String, Void, String> {
        ProgressDialog pDialog;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            pDialog = new ProgressDialog(calendar_staff_next.this);
            pDialog.setMessage("Mohon Tunggu.." + kuliahStart6 );
            pDialog.setIndeterminate(true);
            pDialog.setCancelable(true);
            pDialog.show();
        }

        @Override
        protected String doInBackground(String... sText) {

            List<NameValuePair> parameter = new ArrayList<NameValuePair>();


            parameter.add(new BasicNameValuePair(TAG_calID, calID6));
            parameter.add(new BasicNameValuePair(TAG_calSession, calSession6));
            parameter.add(new BasicNameValuePair(TAG_kuliahStart, kuliahStart6));
            parameter.add(new BasicNameValuePair(TAG_kuliahEnd, kuliahEnd6));
            parameter.add(new BasicNameValuePair(TAG_entranceStart, entranceStart6));
            parameter.add(new BasicNameValuePair(TAG_entranceEnd, entranceEnd6));
            parameter.add(new BasicNameValuePair(TAG_cutiPertStart, cutiPertStart6));
            parameter.add(new BasicNameValuePair(TAG_cutiPertEnd, cutiPertEnd6));
            parameter.add(new BasicNameValuePair(TAG_NIM_MHS3, kuliah2Start6));
            parameter.add(new BasicNameValuePair(TAG_NIM_MHS4, kuliah2End6));
            parameter.add(new BasicNameValuePair(TAG_NIM_MHS5, sufoStart6));
            parameter.add(new BasicNameValuePair(TAG_NIM_MHS6, sufoEnd6));
            parameter.add(new BasicNameValuePair(TAG_NIM_MHS7, exitStart6));
            parameter.add(new BasicNameValuePair(TAG_NIM_MHS8, exitEnd6));
            parameter.add(new BasicNameValuePair(TAG_NIM_MHS9, studyweekStart6));
            parameter.add(new BasicNameValuePair(TAG_NIM_MHS10, studyweekEnd6));
            parameter.add(new BasicNameValuePair(TAG_NIM_MHS11, examStart6));
            parameter.add(new BasicNameValuePair(TAG_NIM_MHS12, examEnd6));
            parameter.add(new BasicNameValuePair(TAG_NIM_MHS13, resultDate6));
            parameter.add(new BasicNameValuePair(TAG_NIM_MHS14, examKhasStart6));
            parameter.add(new BasicNameValuePair(TAG_NIM_MHS15, examKhasEnd6));
            parameter.add(new BasicNameValuePair(TAG_NIM_MHS16, cutisemStart6));
            parameter.add(new BasicNameValuePair(TAG_NIM_MHS17, cutisemEnd6));


            try {
                JSONObject json = jParser.makeHttpRequest("http://ekinidris.site40.net//update_mhs.php", "POST", parameter);

                int success = json.getInt(TAG_SUCCESS);
                if (success == 1) {

                    return "OK";
                } else {

                    return "FAIL";

                }

            } catch (Exception e) {
                e.printStackTrace();
                return "Exception Caught";
            }

        }

        @Override
        protected void onPostExecute(String result) {

            super.onPostExecute(result);
            pDialog.dismiss();

            if (result.equalsIgnoreCase("Exception Caught")) {

                Toast.makeText(calendar_staff_next.this, "Unable to connect to server,please check your internet connection!", Toast.LENGTH_LONG).show();
            }

            if (result.equalsIgnoreCase("FAIL")) {
                Toast.makeText(calendar_staff_next.this, "Fail.. Try Again", Toast.LENGTH_LONG).show();
            } else {
                Intent i = null;
                i = new Intent(calendar_staff_next.this, calendar_staff_update.class);
                startActivity(i);
            }

        }
    }


    class DeleteMhsTask extends AsyncTask<String, Void, String> {
        ProgressDialog pDialog;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            pDialog = new ProgressDialog(calendar_staff_next.this);
            pDialog.setMessage("Mohon Tunggu..");
            pDialog.setIndeterminate(true);
            pDialog.setCancelable(true);
            pDialog.show();
        }

        @Override
        protected String doInBackground(String... sText) {

            List<NameValuePair> parameter = new ArrayList<NameValuePair>();
            parameter.add(new BasicNameValuePair(TAG_calID, calID6));

            try {
                JSONObject json = jParser.makeHttpRequest("http://ekinidris.site40.net//delete_mhs.php", "POST", parameter);

                int success = json.getInt(TAG_SUCCESS);
                if (success == 1) {

                    return "OK";
                } else {

                    return "FAIL";

                }

            } catch (Exception e) {
                e.printStackTrace();
                return "Exception Caught";
            }

        }

        @Override
        protected void onPostExecute(String result) {

            super.onPostExecute(result);
            pDialog.dismiss();

            if (result.equalsIgnoreCase("Exception Caught")) {

                Toast.makeText(calendar_staff_next.this, "Unable to connect to server,please check your internet connection!", Toast.LENGTH_LONG).show();
            }

            if (result.equalsIgnoreCase("FAIL")) {
                Toast.makeText(calendar_staff_next.this, "Fail.. Try Again", Toast.LENGTH_LONG).show();
            } else {
                Intent i = null;
                i = new Intent(calendar_staff_next.this, calendar_staff_update.class);
                startActivity(i);
            }

        }
    }


}
