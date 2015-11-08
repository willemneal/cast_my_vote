package com.escmobile.okhttpsample;

import android.os.AsyncTask;
import android.util.Log;

import com.squareup.okhttp.OkHttpClient;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by willem on 11/7/15.
 */
public class PostRequestHandler extends AsyncTask<Void, Void,String> implements RequestHandler {
    private final OkHttpClient client = new OkHttpClient();
    private static final String GOOGLE_API_KEY = "AIzaSyAdxCWYyfAvQruy-1L5g7fWka-wUj-hJNk";
    private  String url;
    private  Query query = null;
    private String data;

    public PostRequestHandler(String url){
        this.url = url;
    }

    public PostRequestHandler(String url, String data){
        this(url);
        setData(data);

    }

    public void setData(String data){
        this.data = data;
    }








    @Override
    protected String doInBackground(Void... voids) {
        StringBuilder result = new StringBuilder();


        try {
            URL url = new URL(this.url);


            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setDoOutput(true);
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json");
            OutputStream os = conn.getOutputStream();
            os.write(data.getBytes());
            os.flush();

            BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            while ((line = rd.readLine()) != null) {
                result.append(line);
            }
            rd.close();
        }catch (Exception e){
            System.out.println(e.toString());
        }

        Log.i(this.getClass().getSimpleName(), result.toString());
        return result.toString();
    }

    @Override
    public RequestHandler addParam(String key, String value) {
        if (this.query==null)
        {
            this.query = new AQuery();
        }
        this.query.add(key,value);

        return this;
    }
}
