package com.example.win7.fyp;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;

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
 * Created by Win7 on 9/1/2015.
 */
public class ServerRequestStaff {

    ProgressDialog progressDialog;
    public static final int CONNECTION_TIMEOUT = 1000 * 15;
    public static final String SERVER_ADDRESS =  "ekinidris.site40.net";

    public ServerRequestStaff(Context context) {
        progressDialog = new ProgressDialog(context);
        progressDialog.setCancelable(false);
        progressDialog.setTitle("Processing..");
        progressDialog.setMessage("Please Wait....");
    }

    public void storeUserDataInBackground(userStaff userStaff, GetUserCallBackStaff userCallbackStaff) {

        progressDialog.show();
        new StoreUserDataAsyncTask(userStaff, userCallbackStaff).execute();
    }

    public void fetchUserDataInBackground(userStaff userStaff, GetUserCallBackStaff callbackStaff) {
        progressDialog.show();
        new fetchUserDataAsyncTask(userStaff, callbackStaff).execute();
    }

    public class StoreUserDataAsyncTask extends AsyncTask<Void, Void, Void> {
        userStaff userStaff;
        GetUserCallBackStaff userCallbackStaff;

        public StoreUserDataAsyncTask(userStaff userStaff, GetUserCallBackStaff userCallbackStaff) {
            this.userStaff = userStaff;
            this.userCallbackStaff = userCallbackStaff;
        }


        @Override
        protected Void doInBackground(Void... params) {
            ArrayList<NameValuePair> dataToSend = new ArrayList<>();

            dataToSend.add(new BasicNameValuePair("username", userStaff.username));
            dataToSend.add(new BasicNameValuePair("password", userStaff.password));

            HttpParams httpRequestParams = new BasicHttpParams();
            HttpConnectionParams.setConnectionTimeout(httpRequestParams, CONNECTION_TIMEOUT);
            HttpConnectionParams.setSoTimeout(httpRequestParams, CONNECTION_TIMEOUT);
            HttpClient client = new DefaultHttpClient(httpRequestParams);
            HttpPost post = new HttpPost("http://ekinidris.site40.net/registerStaff.php");
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
            userCallbackStaff.done(null);
            super.onPostExecute(aVoid);
        }
    }

    public class fetchUserDataAsyncTask extends AsyncTask<Void, Void, com.example.win7.fyp.userStaff> {
        userStaff userStaff;
        GetUserCallBackStaff userCallbackStaff;

        public fetchUserDataAsyncTask(userStaff userStaff, GetUserCallBackStaff userCallbackStaff) {
            this.userStaff = userStaff;
            this.userCallbackStaff = userCallbackStaff;
        }

        @Override
        protected com.example.win7.fyp.userStaff doInBackground(Void... params) {
            ArrayList<NameValuePair> dataToSend = new ArrayList<>();
            dataToSend.add(new BasicNameValuePair("username", userStaff.username));
            dataToSend.add(new BasicNameValuePair("password", userStaff.password));

            HttpParams httpRequestParams = new BasicHttpParams();
            HttpConnectionParams.setConnectionTimeout(httpRequestParams, CONNECTION_TIMEOUT);
            HttpConnectionParams.setSoTimeout(httpRequestParams, CONNECTION_TIMEOUT);
            HttpClient client = new DefaultHttpClient(httpRequestParams);
            HttpPost post = new HttpPost("http://ekinidris.site40.net/fetchUserDataStaff.php");

            userStaff returnedUserStaff = null;
            try {
                post.setEntity(new UrlEncodedFormEntity(dataToSend));
                HttpResponse httpResponse = client.execute(post);

                HttpEntity entity = httpResponse.getEntity();
                String result = EntityUtils.toString(entity);
                JSONObject jObject = new JSONObject(result);

                if(jObject.length()==0)
                {
                    returnedUserStaff = null;
                }
                else
                {

                    returnedUserStaff = new userStaff(userStaff.username, userStaff.password);
                }


            } catch (Exception e) {
                e.printStackTrace();
            }

            return returnedUserStaff;
        }

        @Override
        protected void onPostExecute(userStaff returnedUserStaff) {
            progressDialog.dismiss();
            userCallbackStaff.done(returnedUserStaff);
            super.onPostExecute(returnedUserStaff);
        }
    }
}




