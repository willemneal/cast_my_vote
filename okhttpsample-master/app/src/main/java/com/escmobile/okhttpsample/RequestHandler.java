package com.escmobile.okhttpsample;

/**
 * Created by willem on 11/7/15.
 */
public interface RequestHandler {
    final String API_KEY = "AIzaSyAdxCWYyfAvQruy-1L5g7fWka-wUj-hJNk";
    final String address = "117 Mallette Street, NC 27516";
    final String electionId = "2000";

    RequestHandler addParam(String key, String value);
}
