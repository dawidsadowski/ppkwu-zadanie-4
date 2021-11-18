package com.example.ppkwuzadanie4;

import java.util.Locale;

public class StringConverter {

    public static String convert(String from, String to, String text) {
        if (from.toLowerCase(Locale.ROOT).equals(to.toLowerCase(Locale.ROOT))) {
            return text;
        }

        switch (to) {
            case "txt": {
                text = "txt";
                break;
            }

            case "json": {
                text = "json";
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
}