package com.example.ppkwuzadanie4;

import org.apache.commons.text.CaseUtils;
import org.json.*;

import java.util.Locale;

public class StringConverter {

    public static String convert(String from, String to, String text) {
        if(from.toLowerCase(Locale.ROOT).equals(to.toLowerCase(Locale.ROOT))) {
            return text;
        }

        text = convertToJson(from, text);

        switch (to) {
            case "txt": {
                text = "txt";
                break;
            }

            case "xml": {
                text = "xml";
                break;
            }

            case "csv": {
                text = "csv";
                break;
            }
        }

        return text;
    }

    private static String convertToJson(String from, String text) {
        String json = text;

        switch (from) {
            case "txt": {
                String[] lines = text.split("\n");
                JSONObject jsonObject = new JSONObject();

                for(String line : lines) {
                    String[] lineParts = line.split(":", 2);

                    String key = CaseUtils.toCamelCase(lineParts[0].toLowerCase(Locale.ROOT), false, ' ');
                    String value = lineParts[1].strip();

                    if(key.equals("text")) {
                        jsonObject.put(key, value);
                    } else {
                        jsonObject.put(key, Integer.parseInt(value));
                    }
                }

                json = jsonObject.toString();
                break;
            }

            case "xml": {
                JSONObject jsonObject = XML.toJSONObject(text);
                json = jsonObject.getJSONObject("stringData").toString();
                break;
            }

            case "csv": {
                JSONArray jsonArray = CDL.toJSONArray(text);
                json = jsonArray.get(0).toString();
                break;
            }
        }

        return json;
    }
}
