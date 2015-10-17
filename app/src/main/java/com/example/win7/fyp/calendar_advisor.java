package com.example.win7.fyp;

import android.app.ActionBar;
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
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.apache.http.NameValuePair;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class calendar_advisor extends ActionBarActivity implements View.OnClickListener  {

    ListView list;

    JsonParser jParser = new JsonParser();
    ArrayList<mahasiswa> daftar_mhs = new ArrayList<mahasiswa>();
    JSONArray daftarMhs = null;
    String url_read_mhs = "http://ekinidris.site40.net/read_mhs.php";
    // JSON Node names, ini harus sesuai yang di API
    public static final String TAG_SUCCESS = "success";
    public static final String TAG_MHS = "mahasiswa";
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

    Button action_add;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setLogo(R.drawable.uitmlogo);
        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);
        setContentView(R.layout.activity_calendar_advisor);

        list = (ListView) findViewById(R.id.listview_mhs);

        //jalankan ReadMhsTask




        ReadMhsTask m = (ReadMhsTask) new ReadMhsTask().execute();

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String calID = ((TextView) view.findViewById(R.id.calID1)).getText().toString();
                String calSession = ((TextView) view.findViewById(R.id.calSession1)).getText().toString();
                String kuliahStart = ((TextView) view.findViewById(R.id.kuliahStart1)).getText().toString();
                String kuliahEnd = ((TextView) view.findViewById(R.id.kuliahEnd1)).getText().toString();
                String entranceStart = ((TextView) view.findViewById(R.id.entranceStart1)).getText().toString();
                String entranceEnd = ((TextView) view.findViewById(R.id.entranceEnd1)).getText().toString();
                String cutiPertStart = ((TextView) view.findViewById(R.id.cutiPertStart1)).getText().toString();
                String cutiPertEnd = ((TextView) view.findViewById(R.id.cutiPertEnd1)).getText().toString();
                String kuliah2Start = ((TextView) view.findViewById(R.id.kuliah2Start1)).getText().toString();
                String kuliah2End = ((TextView) view.findViewById(R.id.kuliah2End1)).getText().toString();
                String sufoStart = ((TextView) view.findViewById(R.id.sufoStart1)).getText().toString();
                String sufoEnd = ((TextView) view.findViewById(R.id.sufoEnd1)).getText().toString();
                String exitStart = ((TextView) view.findViewById(R.id.exitStart1)).getText().toString();
                String exitEnd = ((TextView) view.findViewById(R.id.exitEnd1)).getText().toString();
                String studyweekStart = ((TextView) view.findViewById(R.id.studyweekStart1)).getText().toString();
                String studyweekEnd = ((TextView) view.findViewById(R.id.studyweekEnd1)).getText().toString();
                String examStart = ((TextView) view.findViewById(R.id.examStart1)).getText().toString();
                String examEnd = ((TextView) view.findViewById(R.id.examEnd1)).getText().toString();
                String resultDate = ((TextView) view.findViewById(R.id.resultDate1)).getText().toString();
                String examKhasStart = ((TextView) view.findViewById(R.id.examKhasStart1)).getText().toString();
                String examKhasEnd = ((TextView) view.findViewById(R.id.examKhasEnd1)).getText().toString();
                String cutisemStart = ((TextView) view.findViewById(R.id.cutisemStart1)).getText().toString();
                String cutisemEnd = ((TextView) view.findViewById(R.id.cutisemEnd1)).getText().toString();

//
//
//
//
//                //varible string tadi kita simpan dalam suatu Bundle, dan kita parse bundle tersebut bersama intent menuju kelas UpdateDeleteActivity
                Intent i = null;
                i = new Intent(calendar_advisor.this, calendar_advisor_next.class);
                Bundle b = new Bundle();
                // b.putString("id_mhs", idmhs);
                b.putString("calID", calID);
                b.putString("calSession", calSession);
                b.putString("kuliahStart", kuliahStart);
                b.putString("kuliahEnd", kuliahEnd);
                b.putString("entranceStart", entranceStart);
                b.putString("entranceEnd", entranceEnd);
                b.putString("cutiPertStart", cutiPertStart);
                b.putString("cutiPertEnd", cutiPertEnd);
                b.putString("kuliah2Start", kuliah2Start);
                b.putString("kuliah2End", kuliah2End);
                b.putString("sufoStart", sufoStart);
                b.putString("sufoEnd", sufoEnd);
                b.putString("exitStart", exitStart);
                b.putString("exitEnd", exitEnd);
                b.putString("studyweekStart", studyweekStart);
                b.putString("studyweekEnd", studyweekEnd);
                b.putString("examStart", examStart);
                b.putString("examEnd", examEnd);
                b.putString("resultDate", resultDate);
                b.putString("examKhasStart", examKhasStart);
                b.putString("examKhasEnd", examKhasEnd);
                b.putString("cutisemStart", cutisemStart);
                b.putString("cutisemEnd", cutisemEnd);
                i.putExtras(b);
                startActivity(i);


            }
        });

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


    class ReadMhsTask extends AsyncTask<String, Void, String> {
        ProgressDialog pDialog;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            pDialog = new ProgressDialog(calendar_advisor.this);
            pDialog.setMessage("Mohon Tunggu..");
            pDialog.setIndeterminate(true);
            pDialog.setCancelable(true);
            pDialog.show();
        }

        @Override
        protected String doInBackground(String... sText) {
            String returnResult = getMhsList(); //memanggil method getMhsList()
            return returnResult;

        }

        @Override
        protected void onPostExecute(String result) {
            super.onPostExecute(result);
            pDialog.dismiss();
            if (result.equalsIgnoreCase("Exception Caught")) {
                Toast.makeText(calendar_advisor.this, "Unable to connect to server,please check your internet connection!", Toast.LENGTH_LONG).show();
            }

            if (result.equalsIgnoreCase("no results")) {
                Toast.makeText(calendar_advisor.this, "Data empty", Toast.LENGTH_LONG).show();
            } else {
                list.setAdapter(new mahasiswaAdapter(calendar_advisor.this, daftar_mhs)); //Adapter menampilkan data mahasiswa ke dalam listView
            }
        }


        //method untuk memperoleh daftar mahasiswa dari JSON
        public String getMhsList() {
            mahasiswa tempMhs = new mahasiswa();
            List<NameValuePair> parameter = new ArrayList<NameValuePair>();
            try {
                JSONObject json = jParser.makeHttpRequest(url_read_mhs, "POST", parameter);

                int success = json.getInt(TAG_SUCCESS);
                if (success == 1) { //Ada record Data (SUCCESS = 1)
                    //Getting Array of daftar_mhs
                    daftarMhs = json.getJSONArray(TAG_MHS);
                    // looping through All daftar_mhs
                    for (int i = 0; i < daftarMhs.length(); i++) {
                        JSONObject c = daftarMhs.getJSONObject(i);
                        tempMhs = new mahasiswa();
                        tempMhs.setCalID(c.getString(TAG_calID));
                        tempMhs.setCalSession(c.getString(TAG_calSession));
                        tempMhs.setKuliahStart(c.getString(TAG_kuliahStart));
                        tempMhs.setKuliahEnd(c.getString(TAG_kuliahEnd));
                        tempMhs.setEntranceStart(c.getString(TAG_entranceStart));
                        tempMhs.setEntranceEnd(c.getString(TAG_entranceEnd));
                        tempMhs.setCutiPertStart(c.getString(TAG_cutiPertStart));
                        tempMhs.setCutiPertEnd(c.getString(TAG_cutiPertEnd));
                        tempMhs.setKuliah2Start(c.getString(TAG_NIM_MHS3));
                        tempMhs.setKuliah2End(c.getString(TAG_NIM_MHS4));
                        tempMhs.setSufoStart(c.getString(TAG_NIM_MHS5));
                        tempMhs.setSufoEnd(c.getString(TAG_NIM_MHS6));
                        tempMhs.setExitStart(c.getString(TAG_NIM_MHS7));
                        tempMhs.setExitEnd(c.getString(TAG_NIM_MHS8));
                        tempMhs.setStudyweekStart(c.getString(TAG_NIM_MHS9));
                        tempMhs.setStudyweekEnd(c.getString(TAG_NIM_MHS10));
                        tempMhs.setExamStart(c.getString(TAG_NIM_MHS11));
                        tempMhs.setExamEnd(c.getString(TAG_NIM_MHS12));
                        tempMhs.setResultDate(c.getString(TAG_NIM_MHS13));
                        tempMhs.setExamKhasStart(c.getString(TAG_NIM_MHS14));
                        tempMhs.setExamKhasEnd(c.getString(TAG_NIM_MHS15));
                        tempMhs.setCutisemStart(c.getString(TAG_NIM_MHS16));
                        tempMhs.setCutisemEnd(c.getString(TAG_NIM_MHS17));


                        daftar_mhs.add(tempMhs);
                    }
                    return "OK";
                } else {
                    //Tidak Ada Record Data (SUCCESS = 0)
                    return "no results";
                }

            } catch (Exception e) {
                e.printStackTrace();
                return "Exception Caught";
            }
        }

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_advisor, menu);
        return true;
    }


    public boolean onOptionsItemSelected(MenuItem item) {

        RelativeLayout main_view = (RelativeLayout) findViewById(R.id.main_view);
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





