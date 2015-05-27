package com.globalgis.grand_marketing.client;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

class RequestAsyncTask extends AsyncTask<Void,Void,String> {

    private static String TAG = RequestAsyncTask.class.getName();
    private final HttpClient mClient;
    private final HttpRequestBase mRequest;
    private final APIRequestListener mListener;
    private final Context mContext;

    public RequestAsyncTask(Context context , HttpRequestBase request , APIRequestListener listener){
        mContext = context;
        mRequest = request;
        mListener = listener;
        mClient = new DefaultHttpClient();
    }

    @Override
    protected String doInBackground(Void... voids) {
        //if (Utils.isNetworkAvailable(mContext)){
            try {
                final HttpResponse response = mClient.execute(mRequest);
                final StatusLine statusLine = response.getStatusLine();
                final int statusCode = statusLine.getStatusCode();

                if (statusCode != 200) {
                    return null;
                }

                final InputStream jsonStream = response.getEntity().getContent();
                final BufferedReader reader = new BufferedReader(new InputStreamReader(jsonStream));
                final StringBuilder builder = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    builder.append(line);
                }

                final String jsonString = builder.toString();
                Log.d(TAG, jsonString);
                return jsonString;

            }catch (IOException e) {
                e.printStackTrace();
            }
        return null;
    }

    @Override
    protected void onPostExecute(String jsonString) {
        if (jsonString == null){
            mListener.onFailed("nok");
        } else {
            mListener.onSuccess(jsonString);
        }
    }
}
