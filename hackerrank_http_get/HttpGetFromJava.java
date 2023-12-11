package com.sunil.crudexample.http;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.internal.bind.JsonTreeReader;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HttpGetFromJava {

    public static void main(String[] args) {

        List<String> ansList = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            ansList.addAll(get(i));
        }
        for (String str : ansList) {
            System.out.println(str);
        }
    }

    public static List<String> get (int pageNum) {

        String str = "https://jsonmock.hackerrank.com/api/tvseries?page="+pageNum;

        StringBuilder stringBuilder = new StringBuilder();
        try {
            URL url = new URL(str);
            HttpURLConnection connection  = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.addRequestProperty("Content-Type", "application/json");

            int status = connection.getResponseCode();
//        System.out.println(status);

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String response;
            while ((response = bufferedReader.readLine()) != null) {
                stringBuilder.append(response);
            }

            bufferedReader.close();
            connection.disconnect();
        } catch (Exception e) {
            System.out.println(e);
        }

        String output = stringBuilder.toString();

        JsonObject res = new Gson().fromJson(output, JsonObject.class);
//        System.out.println(res.get("data").getClass().getName());
        JsonArray data = (JsonArray) res.get("data");
//        System.out.println(data);

        Iterator<JsonElement> elements = data.iterator();
        JsonObject element;

        int startDate = Integer.parseInt("2006");
        int endDate = Integer.parseInt("2011");

        List<String> seriesList = new ArrayList<>();

        while(elements.hasNext()) {
            element = elements.next().getAsJsonObject();
//            System.out.println(element.toString());
            String runtime_of_series = element.get("runtime_of_series").toString();

            runtime_of_series = runtime_of_series.replace("(I)", "");
            runtime_of_series = runtime_of_series.replace("(II)", "");
            String runtime_of_series_str = runtime_of_series.substring(runtime_of_series.indexOf("(")+1, runtime_of_series.indexOf(")"));
//            System.out.println(runtime_of_series_str);

            String[] dateArr = runtime_of_series_str.split("-");
            if (dateArr.length == 2) {
                if (dateArr[1].length() > 1) {
                    int start = Integer.parseInt(dateArr[0]);
                    int end = Integer.parseInt(dateArr[1]);

                    if (start >= startDate && end <= endDate) {
                        seriesList.add(element.get("name").toString());
                        System.out.println(element.toString());
                    }
                }
            } else {
                int date = Integer.parseInt(dateArr[0]);
                if (date >= startDate && date <= endDate) {
                    seriesList.add(element.get("name").toString());
                    System.out.println(element.toString());
                }
            }
        }

        return seriesList;
    }
}
