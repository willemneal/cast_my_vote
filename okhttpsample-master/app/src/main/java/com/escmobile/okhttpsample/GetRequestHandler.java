package com.escmobile.okhttpsample;

import android.os.AsyncTask;
import android.util.Log;

import com.squareup.okhttp.OkHttpClient;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by willem on 11/7/15.
 */
public class GetRequestHandler extends AsyncTask<Void, Void,String> implements RequestHandler {
    private final OkHttpClient client = new OkHttpClient();
    private static final String GOOGLE_API_KEY = "AIzaSyAdxCWYyfAvQruy-1L5g7fWka-wUj-hJNk";
    private  String url = "https://www.googleapis.com/civicinfo/v2/voterinfo?";;
    private  Query query = null;

    public GetRequestHandler(String url){
        this.url = url;
    }
    public GetRequestHandler(String url, Query q){
        this(url);
        this.query = q;
    }
    public GetRequestHandler(){}







    @Override
    protected String doInBackground(Void... voids) {
        StringBuilder result = new StringBuilder();


        try {
            URL url = query.buildURL(this.url);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
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
