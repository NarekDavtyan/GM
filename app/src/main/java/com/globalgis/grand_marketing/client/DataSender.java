package com.globalgis.grand_marketing.client;

import com.globalgis.grand_marketing.interfaces.IRequestListener;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

public class DataSender {

    public static void login(String username, String password, IRequestListener requestListener) {
    }

    private static void sendData(final String deviceToken, final byte[] data, final IRequestListener requestListener) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                JSONObject responseData = null;
                try {
                    byte[] result = SocketClient.getInstance().sendData(deviceToken, data);
                    if(result != null) {
                        String resultString = new String(result);
                        responseData = new JSONObject(resultString);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (JSONException e) {
                    e.printStackTrace();
                } finally {
                    if(responseData != null) {
                        requestListener.success(responseData);
                    } else {
                        requestListener.failed(null);
                    }
                }
            }
        }).start();
    }
}
