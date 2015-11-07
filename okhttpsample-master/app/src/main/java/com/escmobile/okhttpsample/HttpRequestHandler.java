package com.escmobile.okhttpsample;

import android.util.Log;

import com.squareup.okhttp.FormEncodingBuilder;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;


import org.apache.http.NameValuePair;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.message.BasicNameValuePair;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by willem on 11/7/15.
 */
public class HttpRequestHandler {
    private final OkHttpClient client = new OkHttpClient();
    private final String API_KEY = "AIzaSyAdxCWYyfAvQruy-1L5g7fWka-wUj-hJNk";
    private String address = "117 Mallette Street, NC 27516";
    private  String _URL = "https://www.googleapis.com/civicinfo/v2/voterinfo?";

    public String run() throws Exception {

        StringBuilder result = new StringBuilder();
        Query params = new AQuery();
        params.add("key", API_KEY)
                .add("address", address)
                .add("electionId", "2000");


        URL url = params.buildURL(_URL);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String line;
        while ((line = rd.readLine()) != null) {
            result.append(line);
        }
        rd.close();

        Log.i(this.getClass().getSimpleName(), result.toString());

        return result.toString();



        /*Request request = new Request.Builder()
                .url("https://www.googleapis.com/civicinfo/v2/voterinfo")

                .build();

        Response response = client.newCall(request).execute();
        if (!response.isSuccessful()) throw new IOException("Unexpected code " + response);

        return response.body().string();*/
    }




}
