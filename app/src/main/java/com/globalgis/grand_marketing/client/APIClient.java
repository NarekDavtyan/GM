package com.globalgis.grand_marketing.client;

import android.content.Context;
import android.util.Log;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public class APIClient {

    private static final String SERVER_URL = "http://mob.globalgis.am/MarketingData.ashx";
    private static final String COMMIT = "/commit";

    private static final String TAG = APIClient.class.getSimpleName();

    public static void logIn (Context context, String username, String password, APIRequestListener listener) {

        final HttpPost post = new HttpPost("");

        try {
            final List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>();
            nameValuePairs.add(new BasicNameValuePair("username", username));
            nameValuePairs.add(new BasicNameValuePair("password", password));
            post.setEntity(new UrlEncodedFormEntity(nameValuePairs));
        } catch (UnsupportedEncodingException e){
            e.printStackTrace();
        }

        new RequestAsyncTask(context, post, listener).execute();
    }
    public static void update(Context context, APIRequestListener listener) {

        final HttpPost post = new HttpPost(SERVER_URL);

        try{
            final List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>();
            //nameValuePairs.add(new BasicNameValuePair("token", "");
            JSONObject tablesJSON = new JSONObject();
            JSONArray tablesArray = new JSONArray();
            JSONObject vkTable = new JSONObject();
            vkTable.put("table_name", "Vks");
            vkTable.put("version", "1");
            tablesArray.put(vkTable);
            tablesJSON.put("tables", tablesArray);

            nameValuePairs.add(new BasicNameValuePair("tables", "{tables:[{table_name:\"RouteVks\", version:\"1\"}, {table_name:\"Vks\", version:\"1\"}]}"));
            post.setEntity(new UrlEncodedFormEntity(nameValuePairs));
        }catch (UnsupportedEncodingException | JSONException e){
            e.printStackTrace();
        }

        new RequestAsyncTask(context, post, listener).execute();
    }

    public static void sendData(Context context, String insertData, APIRequestListener listener) {
        final HttpPost post = new HttpPost(SERVER_URL);

        Log.v(TAG, "insert data " + insertData);
        try{
            final List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>();
            nameValuePairs.add(new BasicNameValuePair("insert", insertData));

            post.setEntity(new UrlEncodedFormEntity(nameValuePairs));
        } catch (UnsupportedEncodingException e){
            e.printStackTrace();
        }

        new RequestAsyncTask(context, post, listener).execute();
    }
}
