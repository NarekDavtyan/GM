package com.globalgis.grand_marketing.interfaces;

import org.json.JSONException;
import org.json.JSONObject;

public interface DataCollectible {
    JSONObject collect() throws JSONException;
}
