package com.CN.rough.dataStructure;

import org.apache.commons.io.FileUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;

public class HandlingDynamicArrayJson {
    public static void parseObject(JSONObject json, String key) {
        System.out.println(json.get(key));
    }
    public static void getKey(JSONObject json, String key) throws IOException {
        boolean exists = json.has(key);
        String nextKeys;
        Iterator<?> keys;
        if (!exists) {
            keys = json.keys();
            while (keys.hasNext()) {
                nextKeys = (String) keys.next();
                try {
                    if (json.get(nextKeys) instanceof JSONObject) {
                        if (exists == false) {
                            getKey(json.getJSONObject(nextKeys), key);
                        }
                    } else if (json.get(nextKeys) instanceof JSONArray) {
                        {
                            JSONArray jsonArray = json.getJSONArray(nextKeys);
                            for (int i = 0; i < jsonArray.length(); i++) {
                                String jsonarrayString = jsonArray.get(i).toString();
                                JSONObject innerJSON = new JSONObject(jsonarrayString);
                                if (exists == false) {
                                    getKey(innerJSON, key);
                                }
                            }
                        }
                    }

                } catch (Exception e) {
                }
            }
        } else {
            parseObject(json, key);
        }

    }

    public static void main(String[] args) throws IOException {

        String filepath = "/src/test/java/com/CN/rough/dataStructure/Dynamic.json";

        String jsonContent = FileUtils.readFileToString(new File(System.getProperty("user.dir") + filepath),
                StandardCharsets.UTF_8);

        JSONObject jsonObject = new JSONObject(jsonContent);
        getKey(jsonObject, "product");


    }


}
