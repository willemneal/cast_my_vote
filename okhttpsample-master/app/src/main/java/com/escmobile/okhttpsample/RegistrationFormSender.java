package com.escmobile.okhttpsample;

import java.util.concurrent.ExecutionException;

/**
 * Created by willem on 11/7/15.
 */
public class RegistrationFormSender {

    private static String _URL = "https://rtvstaging-web1.osuosl.org/api/v3/registrations.json";

    public static String sendForm(RegistrationForm form){
        PostRequestHandler post = new PostRequestHandler(_URL, form.toJson());

        try {
            return post.execute().get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        return null;
    }

}
