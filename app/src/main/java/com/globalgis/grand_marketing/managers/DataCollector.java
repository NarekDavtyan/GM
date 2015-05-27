package com.globalgis.grand_marketing.managers;

import com.globalgis.grand_marketing.interfaces.DataCollectible;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;

public class DataCollector {

    private HashMap<String, ArrayList<DataCollectible>> mInsertData;

    public DataCollector() {
        mInsertData = new HashMap<String, ArrayList<DataCollectible>>();
    }

    public void addInsertData(String table, DataCollectible data) {
        ArrayList<DataCollectible> insertedList;
        if(!mInsertData.containsKey(table)) {
            insertedList = new ArrayList<DataCollectible>();
            mInsertData.put(table, insertedList);
        } else {
            insertedList = mInsertData.get(table);

        }
        insertedList.add(data);
    }

    public void addAllInsertData(String table, ArrayList<? extends DataCollectible> data) {
        ArrayList<DataCollectible> insertedList;
        if(!mInsertData.containsKey(table)) {
            insertedList = new ArrayList<DataCollectible>();
            mInsertData.put(table, insertedList);
        } else {
            insertedList = mInsertData.get(table);

        }
        insertedList.addAll(data);
    }

    public String collectInsertData() {
        JSONObject data = new JSONObject();
        for (String root : mInsertData.keySet()) {
            JSONArray currentValues = new JSONArray();
            try {
                for (DataCollectible collectible : mInsertData.get(root)) {
                    currentValues.put(collectible.collect());
                }

                data.put(root, currentValues);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        return data.toString();
    }

    public String collect() {
        JSONObject data = new JSONObject();
        try {
            data.put("insert", collectInsertData());
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return data.toString();
    }
}
