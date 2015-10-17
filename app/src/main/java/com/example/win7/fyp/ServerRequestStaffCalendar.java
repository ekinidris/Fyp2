package com.example.win7.fyp;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.widget.Toast;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

import java.util.ArrayList;

/**
 * Created by Win7 on 10/2/2015.
 */
public class ServerRequestStaffCalendar {

    ProgressDialog progressDialog;
    public static final int CONNECTION_TIMEOUT = 1000 * 15;
    public static final String SERVER_ADDRESS =  "ekinidris.site40.net";

    public ServerRequestStaffCalendar(Context context) {

        progressDialog = new ProgressDialog(context);
        progressDialog.setCancelable(false);
        progressDialog.setTitle("Processing..");
        progressDialog.setMessage("Please Wait....");
    }

    public void storeUserDataInBackground(userStaffCalendar userStaffCalendar, GetUserCallBackStaffCalendar userCallbackStaffCalendar) {

        progressDialog.show();
        new StoreUserDataAsyncTask(userStaffCalendar, userCallbackStaffCalendar).execute();
    }

    public void fetchUserDataInBackground(userStaffCalendar userStaffCalendar, GetUserCallBackStaffCalendar callbackStaffCalendar) {
        progressDialog.show();
        new fetchUserDataAsyncTask(userStaffCalendar, callbackStaffCalendar).execute();
    }

    public class StoreUserDataAsyncTask extends AsyncTask<Void, Void, Void> {
        userStaffCalendar userStaffCalendar;
        GetUserCallBackStaffCalendar userCallbackStaffCalendar;

        public StoreUserDataAsyncTask(userStaffCalendar userStaffCalendar, GetUserCallBackStaffCalendar userCallbackStaffCalendar) {
            this.userStaffCalendar = userStaffCalendar;
            this.userCallbackStaffCalendar = userCallbackStaffCalendar;
        }


        @Override
        protected Void doInBackground(Void... params) {
            ArrayList<NameValuePair> dataToSend = new ArrayList<>();


            dataToSend.add(new BasicNameValuePair("calSession", userStaffCalendar.calSession));
            dataToSend.add(new BasicNameValuePair("kuliahStart", userStaffCalendar.kuliahStart));
            dataToSend.add(new BasicNameValuePair("kuliahEnd", userStaffCalendar.kuliahEnd));
            dataToSend.add(new BasicNameValuePair("entranceStart", userStaffCalendar.entranceStart));
            dataToSend.add(new BasicNameValuePair("entranceEnd", userStaffCalendar.entranceEnd));
            dataToSend.add(new BasicNameValuePair("cutiPertStart", userStaffCalendar.cutiPertStart));
            dataToSend.add(new BasicNameValuePair("cutiPertEnd", userStaffCalendar.cutiPertEnd));
            dataToSend.add(new BasicNameValuePair("kuliah2Start", userStaffCalendar.kuliah2Start));
            dataToSend.add(new BasicNameValuePair("kuliah2End", userStaffCalendar.kuliah2End));
            dataToSend.add(new BasicNameValuePair("sufoStart", userStaffCalendar.sufoStart));
            dataToSend.add(new BasicNameValuePair("sufoEnd", userStaffCalendar.sufoEnd));
            dataToSend.add(new BasicNameValuePair("exitStart", userStaffCalendar.exitStart));
            dataToSend.add(new BasicNameValuePair("exitEnd", userStaffCalendar.exitEnd));
            dataToSend.add(new BasicNameValuePair("studyweekStart", userStaffCalendar.studyweekStart));
            dataToSend.add(new BasicNameValuePair("studyweekEnd", userStaffCalendar.studyweekEnd));
            dataToSend.add(new BasicNameValuePair("examStart", userStaffCalendar.examStart));
            dataToSend.add(new BasicNameValuePair("examEnd", userStaffCalendar.examEnd));
            dataToSend.add(new BasicNameValuePair("resultDate", userStaffCalendar.resultDate));
            dataToSend.add(new BasicNameValuePair("examKhasStart", userStaffCalendar.examKhasStart));
            dataToSend.add(new BasicNameValuePair("examKhasEnd", userStaffCalendar.examKhasEnd));
            dataToSend.add(new BasicNameValuePair("cutisemStart", userStaffCalendar.cutisemStart));
            dataToSend.add(new BasicNameValuePair("cutisemEnd", userStaffCalendar.cutisemEnd));

            HttpParams httpRequestParams = new BasicHttpParams();
            HttpConnectionParams.setConnectionTimeout(httpRequestParams, CONNECTION_TIMEOUT);
            HttpConnectionParams.setSoTimeout(httpRequestParams, CONNECTION_TIMEOUT);
            HttpClient client = new DefaultHttpClient(httpRequestParams);
            HttpPost post = new HttpPost("http://ekinidris.site40.net/registerCalendar.php");

            try {
                post.setEntity(new UrlEncodedFormEntity(dataToSend));
                client.execute(post);
            } catch (Exception e) {
                e.printStackTrace();
            }

            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            progressDialog.dismiss();
            userCallbackStaffCalendar.done(null);
            super.onPostExecute(aVoid);
        }
    }

    public class fetchUserDataAsyncTask extends AsyncTask<Void, Void, com.example.win7.fyp.userStaffCalendar> {
        userStaffCalendar userStaffCalendar;
        GetUserCallBackStaffCalendar userCallbackStaffCalendar;

        public fetchUserDataAsyncTask(userStaffCalendar userStaffCalendar, GetUserCallBackStaffCalendar userCallbackStaffCalendar) {
            this.userStaffCalendar = userStaffCalendar;
            this.userCallbackStaffCalendar = userCallbackStaffCalendar;
        }

        @Override
        protected com.example.win7.fyp.userStaffCalendar doInBackground(Void... params) {
            ArrayList<NameValuePair> dataToSend = new ArrayList<>();
            dataToSend.add(new BasicNameValuePair("calSession", userStaffCalendar.calSession));

            HttpParams httpRequestParams = new BasicHttpParams();
            HttpConnectionParams.setConnectionTimeout(httpRequestParams, CONNECTION_TIMEOUT);
            HttpConnectionParams.setSoTimeout(httpRequestParams, CONNECTION_TIMEOUT);
            HttpClient client = new DefaultHttpClient(httpRequestParams);
            HttpPost post = new HttpPost("http://ekinidris.site40.net/fetchUserDataStaffCalendar.php");


            userStaffCalendar returnedUserStaffCalendar = null;
            try {
                post.setEntity(new UrlEncodedFormEntity(dataToSend));
                HttpResponse httpResponse = client.execute(post);

                HttpEntity entity = httpResponse.getEntity();
                String result1 = EntityUtils.toString(entity);
                JSONObject jObject = new JSONObject(result1);

                if(jObject.length()==0)
                {
                    returnedUserStaffCalendar = null;
                }
                else
                {

                    String kuliahStart = jObject.getString("kuliahStart1");
                    String kuliahEnd = jObject.getString("kuliahEnd1");
                    String entranceStart = jObject.getString("entranceStart1");
                    String entranceEnd = jObject.getString("entranceEnd1");
                    String cutiPertStart = jObject.getString("cutiPertStart1");
                    String cutiPertEnd = jObject.getString("cutiPertEnd1");
                    String kuliah2Start = jObject.getString("kuliah2Start1");
                    String kuliah2End = jObject.getString("kuliah2End1");
                    String sufoStart = jObject.getString("sufoStart1");
                    String sufoEnd = jObject.getString("sufoEnd1");
                    String exitStart = jObject.getString("exitStart");
                    String exitEnd = jObject.getString("exitEnd1");
                    String studyweekStart = jObject.getString("studyweekStart1");
                    String studyweekEnd = jObject.getString("studyweekEnd1");
                    String examStart = jObject.getString("examStart1");
                    String examEnd = jObject.getString("examEnd1");
                    String resultDate = jObject.getString("resultDate1");
                    String examKhasStart = jObject.getString("examKhasStart1");
                    String examKhasEnd = jObject.getString("examKhasEnd1");
                    String cutisemStart = jObject.getString("cutisemStart1");
                    String cutisemEnd = jObject.getString("cutisemEnd1");

                    returnedUserStaffCalendar = new userStaffCalendar(userStaffCalendar.calSession,kuliahStart,kuliahEnd ,entranceStart ,entranceEnd, cutiPertStart ,cutiPertEnd,kuliah2Start,kuliah2End ,sufoStart ,sufoEnd, exitStart ,exitEnd ,studyweekStart ,studyweekEnd, examStart ,examEnd ,resultDate,examKhasStart, examKhasEnd ,cutisemStart,cutisemEnd);


                }


            } catch (Exception e) {
                e.printStackTrace();
            }

            return returnedUserStaffCalendar;
        }

        @Override
        protected void onPostExecute(userStaffCalendar returnedUserStaffCalendar) {
            progressDialog.dismiss();
            userCallbackStaffCalendar.done(returnedUserStaffCalendar);
            super.onPostExecute(returnedUserStaffCalendar);

               ;
        }
    }
}
