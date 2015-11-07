package com.escmobile.okhttpsample;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by willem on 11/7/15.
 */
public interface Query {

    Query add(String key, String Value);

    URL buildURL(String url) throws MalformedURLException;

}
