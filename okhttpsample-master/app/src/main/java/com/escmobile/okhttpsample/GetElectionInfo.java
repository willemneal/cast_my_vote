package com.escmobile.okhttpsample;

import android.os.AsyncTask;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;

/**
 * Created by genctasbasi on 11/04/15.
 */
public class GetElectionInfo extends AsyncTask<Void, Void, String> {

    // TODO: replace with your own image url
    private final String IMAGE_URL = "http://bit.ly/1DU2Zka";

    OkHttpClient httpClient = new OkHttpClient();

    @Override
    protected String doInBackground(Void... params) {

        HttpRequestHandler handler = new HttpRequestHandler();



        try {
            return handler.run();

        } catch (Exception e) {
        }

        return null;
    }
}
