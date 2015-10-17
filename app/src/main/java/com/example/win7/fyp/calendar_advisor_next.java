package com.example.win7.fyp;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
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
import android.widget.TextView;

import android.widget.Toast;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class calendar_advisor_next extends ActionBarActivity implements View.OnClickListener {
    JsonParser jParser = new JsonParser();
    String url_update_mhs = "http:ekinidris.site40.net/update_mhs.php";
    String url_delete_mhs = "http:ekinidris.site40.net/delete_mhs.php";


//     JSON Node names, ini harus sesuai yang di API
    public static final String TAG_SUCCESS = "success";
    public static final String calSession = "calSession";
    public static final String TAG_calID = "calID";
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

    TextView  kuliahStart4;
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

    String  calID6,
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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar_advisor_next);
        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setLogo(R.drawable.uitmlogo);
        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);

//        EditTxtnama = (EditText) findViewById(R.id.editTextNama);
//        EditTxtnim = (EditText) findViewById(R.id.editTextNim);
        calID4 = (TextView) findViewById(R.id.calID1);

        calSession4 = (TextView) findViewById(R.id.calSession1);
       kuliahStart4 = (TextView) findViewById(R.id.kuliahStart1);
        kuliahEnd4 = (TextView) findViewById(R.id.kuliahEnd1);
        entranceStart4 = (TextView) findViewById(R.id.entranceStart1);
        entranceEnd4 = (TextView) findViewById(R.id.entranceEnd1);
        cutiPertStart4 = (TextView) findViewById(R.id.cutiPertStart1);
        cutiPertEnd4 = (TextView) findViewById(R.id.cutiPertEnd1);
        kuliah2Start4 = (TextView) findViewById(R.id.kuliah2Start1);
        kuliah2End4 = (TextView) findViewById(R.id.kuliah2End1);
        sufoStart4 = (TextView) findViewById(R.id.sufoStart1);
        sufoEnd4 = (TextView) findViewById(R.id.sufoEnd1);
        exitStart4 = (TextView) findViewById(R.id.exitStart1);
        exitEnd4 = (TextView) findViewById(R.id.exitEnd1);
        studyweekStart4 = (TextView) findViewById(R.id.studyweekStart1);
        studyweekEnd4 = (TextView) findViewById(R.id.studyweekEnd1);
        examStart4 = (TextView) findViewById(R.id.examStart1);
        examEnd4 = (TextView) findViewById(R.id.examEnd1);
        resultDate4 = (TextView) findViewById(R.id.resultDate1);
        examKhasStart4 = (TextView) findViewById(R.id.examKhasStart1);
        examKhasEnd4 = (TextView) findViewById(R.id.examKhasEnd1);
        cutisemStart4 = (TextView) findViewById(R.id.cutisemStart1);
        cutisemEnd4 = (TextView) findViewById(R.id.cutisemEnd1);

        UpdateBtn = (Button) findViewById(R.id.buttonUpdate);
        DeleteBtn = (Button) findViewById(R.id.buttonDelete);

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



       UpdateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //idStr = TxtViewId.getText().toString();
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

        class UpdateMhsTask extends AsyncTask<String, Void, String> {
            ProgressDialog pDialog;

            @Override
            protected void onPreExecute() {
                super.onPreExecute();
                pDialog = new ProgressDialog(calendar_advisor_next.this);
                pDialog.setMessage("Mohon Tunggu..");
                pDialog.setIndeterminate(true);
                pDialog.setCancelable(true);
                pDialog.show();
            }

            @Override
            protected String doInBackground(String... sText) {

                List<NameValuePair> parameter = new ArrayList<NameValuePair>();

                parameter.add(new BasicNameValuePair(TAG_calID, calID6));
                parameter.add(new BasicNameValuePair(calSession, calSession6));
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
                    JSONObject json = jParser.makeHttpRequest(url_update_mhs, "POST", parameter);

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

                    Toast.makeText(calendar_advisor_next.this, "Unable to connect to server,please check your internet connection!", Toast.LENGTH_LONG).show();
                }

                if (result.equalsIgnoreCase("FAIL")) {
                    Toast.makeText(calendar_advisor_next.this, "Fail.. Try Again", Toast.LENGTH_LONG).show();
                } else {
                    Intent i = null;
                    i = new Intent(calendar_advisor_next.this, calendar_advisor.class);
                    startActivity(i);
                }

            }
        }


    class DeleteMhsTask extends AsyncTask<String, Void, String>
    {
        ProgressDialog pDialog;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            pDialog = new ProgressDialog(calendar_advisor_next.this);
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
                JSONObject json = jParser.makeHttpRequest("http://ekinidris.site40.net/delete_mhs.php","POST", parameter);

                int success = json.getInt(TAG_SUCCESS);
                if (success == 1) {

                    return "OK";
                }
                else {

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

            if(result.equalsIgnoreCase("Exception Caught"))
            {

                Toast.makeText(calendar_advisor_next.this, "Unable to connect to server,please check your internet connection!", Toast.LENGTH_LONG).show();
            }

            if(result.equalsIgnoreCase("FAIL"))
            {
                Toast.makeText(calendar_advisor_next.this, "Fail.. Try Again", Toast.LENGTH_LONG).show();
            }

            else {
                Intent i = null;
                i = new Intent(calendar_advisor_next.this, calendar_advisor.class);
                startActivity(i);
            }

        }
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.bACalendar:


                startActivity(new Intent(this, calendar_advisor.class));

                break;



            case R.id.tvLogout:


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

