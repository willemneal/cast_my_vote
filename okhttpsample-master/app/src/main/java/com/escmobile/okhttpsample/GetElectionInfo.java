package com.escmobile.okhttpsample;

import android.os.AsyncTask;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

/**
 * Created by genctasbasi on 11/04/15.
 */
public class GetElectionInfo {

    // TODO: replace with your own image url
    private final String IMAGE_URL = "http://bit.ly/1DU2Zka";

    OkHttpClient httpClient = new OkHttpClient();

    public String run() throws ExecutionException, InterruptedException {
        GetRequestHandler getRequest = new GetRequestHandler();

        getRequest.addParam("address", RequestHandler.address)
                .addParam("key", RequestHandler.API_KEY)
                .addParam("electionId", RequestHandler.electionId);
        return getRequest.execute().get();

    }
}
