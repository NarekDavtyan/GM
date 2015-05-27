package com.globalgis.grand_marketing.interfaces;

import org.json.JSONObject;

public interface IRequestListener {
    void success(JSONObject data);
    void failed(JSONObject data);
}
