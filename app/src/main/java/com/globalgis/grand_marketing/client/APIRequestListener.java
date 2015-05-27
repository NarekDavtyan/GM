package com.globalgis.grand_marketing.client;

public interface APIRequestListener {
    public void onSuccess(String data);
    public void onFailed(String error);
}
