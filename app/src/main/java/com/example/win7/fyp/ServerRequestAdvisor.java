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
 * Created by Win7 on 8/31/2015.
 */
public class ServerRequestAdvisor {
    ProgressDialog progressDialog;
    public static final int CONNECTION_TIMEOUT = 1000 * 15;
    public static final String SERVER_ADDRESS =  "ekinidris.site40.net";

    public ServerRequestAdvisor(Context context) {
        progressDialog = new ProgressDialog(context);
        progressDialog.setCancelable(false);
        progressDialog.setTitle("Processing..");
        progressDialog.setMessage("Please Wait....");
    }

    public void storeUserDataInBackground(userAdvisor userAdvisor, GetUserCallBackAdvisor userCallbackAdvisor) {

        progressDialog.show();
        new StoreUserDataAsyncTask(userAdvisor, userCallbackAdvisor).execute();
    }

    public void fetchUserDataInBackground(userAdvisor userAdvisor, GetUserCallBackAdvisor callbackAdvisor) {
        progressDialog.show();
        new fetchUserDataAsyncTask(userAdvisor, callbackAdvisor).execute();
    }

    public class StoreUserDataAsyncTask extends AsyncTask<Void, Void, Void> {
        userAdvisor userAdvisor;
        GetUserCallBackAdvisor userCallbackAdvisor;

        public StoreUserDataAsyncTask(userAdvisor userAdvisor, GetUserCallBackAdvisor userCallbackAdvisor) {
            this.userAdvisor = userAdvisor;
            this.userCallbackAdvisor = userCallbackAdvisor;
        }


        @Override
        protected Void doInBackground(Void... params) {
            ArrayList<NameValuePair> dataToSend = new ArrayList<>();

            dataToSend.add(new BasicNameValuePair("username", userAdvisor.username));
            dataToSend.add(new BasicNameValuePair("password", userAdvisor.password));

            HttpParams httpRequestParams = new BasicHttpParams();
            HttpConnectionParams.setConnectionTimeout(httpRequestParams, CONNECTION_TIMEOUT);
            HttpConnectionParams.setSoTimeout(httpRequestParams, CONNECTION_TIMEOUT);
            HttpClient client = new DefaultHttpClient(httpRequestParams);
            HttpPost post = new HttpPost("http://ekinidris.site40.net/registerAdvisor.php");
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
            userCallbackAdvisor.done(null);
            super.onPostExecute(aVoid);
        }
    }

    public class fetchUserDataAsyncTask extends AsyncTask<Void, Void, com.example.win7.fyp.userAdvisor> {
        userAdvisor userAdvisor;
        GetUserCallBackAdvisor userCallbackAdvisor;

        public fetchUserDataAsyncTask(userAdvisor userAdvisor, GetUserCallBackAdvisor userCallbackAdvisor) {
            this.userAdvisor = userAdvisor;
            this.userCallbackAdvisor = userCallbackAdvisor;
        }

        @Override
        protected com.example.win7.fyp.userAdvisor doInBackground(Void... params) {
            ArrayList<NameValuePair> dataToSend = new ArrayList<>();
            dataToSend.add(new BasicNameValuePair("username", userAdvisor.username));
            dataToSend.add(new BasicNameValuePair("password", userAdvisor.password));

            HttpParams httpRequestParams = new BasicHttpParams();
            HttpConnectionParams.setConnectionTimeout(httpRequestParams, CONNECTION_TIMEOUT);
            HttpConnectionParams.setSoTimeout(httpRequestParams, CONNECTION_TIMEOUT);
            HttpClient client = new DefaultHttpClient(httpRequestParams);
            HttpPost post = new HttpPost("http://ekinidris.site40.net/fetchUserDataAdvisor.php");

            userAdvisor returnedUserAdvisor = null;
            try {
                post.setEntity(new UrlEncodedFormEntity(dataToSend));
                HttpResponse httpResponse = client.execute(post);

                HttpEntity entity = httpResponse.getEntity();
                String result = EntityUtils.toString(entity);
                JSONObject jObject = new JSONObject(result);

                if(jObject.length()==0)
                {
                    returnedUserAdvisor = null;
                }
                else
                {

                    returnedUserAdvisor = new userAdvisor(userAdvisor.username, userAdvisor.password);
                }


            } catch (Exception e) {
                e.printStackTrace();
            }

            return returnedUserAdvisor;
        }

        @Override
        protected void onPostExecute(userAdvisor returnedUserAdvisor) {
            progressDialog.dismiss();
            userCallbackAdvisor.done(returnedUserAdvisor);
            super.onPostExecute(returnedUserAdvisor);
        }
    }
}


