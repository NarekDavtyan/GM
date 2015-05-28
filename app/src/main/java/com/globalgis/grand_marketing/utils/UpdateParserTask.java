package com.globalgis.grand_marketing.utils;

import android.content.ContentValues;
import android.os.AsyncTask;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.globalgis.grand_marketing.app.GMApplication;
import com.globalgis.grand_marketing.database.DbManager;
import com.globalgis.grand_marketing.interfaces.IParserStatusListener;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class UpdateParserTask extends AsyncTask<Void, Void, Void> {

    private String mData;
    private IParserStatusListener mParserStatusListener;
    private DbManager mDbManager;

    public UpdateParserTask(String data, IParserStatusListener parserStatusListener) {
        mData = data;
        mDbManager = GMApplication.getDbManager();
        mParserStatusListener = parserStatusListener;
    }

    @Override
    protected Void doInBackground(Void... params) {
        readData();
        return null;
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        mParserStatusListener.completed();
    }

    public boolean readData() {
        try {
            ObjectMapper mapper = new ObjectMapper();
            JsonFactory factory = mapper.getFactory();
            JsonParser parser = factory.createParser(mData);

            readTables(parser.readValueAs(JsonNode.class), mDbManager);

            parser.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return true;
    }

    private void readTables(JsonNode jsonNode, DbManager dbManager) throws IOException {
        Iterator<JsonNode> nodeKeys = jsonNode.elements();
        while (nodeKeys.hasNext()) {
            JsonNode tablesNode = nodeKeys.next();
            Iterator<JsonNode> currentTableNode = tablesNode.elements();
            if(currentTableNode.hasNext()) {
                String tableName = tablesNode.fieldNames().next();
                JsonNode tableNode = currentTableNode.next();
                readTableData(tableNode, dbManager, tableName);
            }
        }
    }

    private void readTableData(JsonNode jsonNode, DbManager dbManager, String tableName) throws IOException {
        // Iterate over object fields:
        Iterator<JsonNode> nodeKeys = jsonNode.elements();
        ArrayList<ContentValues> valuesList = new ArrayList<>();
        ContentValues values;
        while (nodeKeys.hasNext()) {
            values = new ContentValues();
            JsonNode columnNodes = nodeKeys.next();
            Iterator<JsonNode> columnValues = columnNodes.elements();
            Iterator<String> columnNames = columnNodes.fieldNames();
            while (columnValues.hasNext()) {
                JsonNode columnValue = columnValues.next();
                String name = columnNames.next();
                String value = columnValue.asText();
                values.put(name, value);
                valuesList.add(values);
            }
        }
        dbManager.insertOrUpdateQuick(tableName, valuesList);
    }
}