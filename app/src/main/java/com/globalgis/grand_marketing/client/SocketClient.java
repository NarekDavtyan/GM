package com.globalgis.grand_marketing.client;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;

public class SocketClient {

    private static final String IP = "192.168.1.8";
    private static final int PORT = 3203;

    private Socket mSocket;

    private static SocketClient mInstance;

    public static SocketClient getInstance() {
        if(mInstance == null) {
            mInstance = new SocketClient();
        }

        return mInstance;
    }

    private SocketClient() {

    }

    public byte[] sendData(String token, String data) throws IOException {
        return sendData(token, data.getBytes());
    }

    public byte[] sendData(String token, byte[] data) throws IOException {
        byte[] resultBytes = null;
        openSocketConnection();
        if(mSocket != null) {
            if(authenticate(token)) {
                DataOutputStream writer = new DataOutputStream(mSocket.getOutputStream());
                DataInputStream reader = new DataInputStream(mSocket.getInputStream());

                resultBytes = new byte[reader.available()];
                writer.write(data);
                int count = reader.read(resultBytes);
            }
        }

        return resultBytes;
    }

    private boolean authenticate(String deviceToken) throws IOException {
        DataOutputStream writer = new DataOutputStream(mSocket.getOutputStream());
        DataInputStream reader = new DataInputStream(mSocket.getInputStream());

        writer.write(deviceToken.getBytes());
        int result = reader.read();

        return result == 1;
    }

    private void openSocketConnection() throws SocketException {
        try {
            mSocket = new Socket(IP, PORT);
            mSocket.setSoTimeout(10 * 1000);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void closeSocketConnection() throws IOException {
        mSocket.close();
    }
}
