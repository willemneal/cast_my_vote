package com.escmobile.okhttpsample;

import org.apache.http.NameValuePair;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.message.BasicNameValuePair;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by willem on 11/7/15.
 */
public class AQuery implements Query {
    private List<NameValuePair> params;
    public AQuery() {
        params = new LinkedList<NameValuePair>();
    }

    @Override
    public Query add(String key, String value) {
        params.add(new BasicNameValuePair(key,value));
        return this;
    }

    @Override
    public URL buildURL(String url) throws MalformedURLException {
        String _url = url.endsWith("?")? url : url + "?";
        String paramString = URLEncodedUtils.format(params, "utf-8");
        return new URL(_url + paramString);
    }
}
