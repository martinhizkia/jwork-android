package com.example.jwork_android.request;

import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class FetchJobRequest extends StringRequest {
    private static final String URL = "http://192.168.1.5:8080/invoice/jobseeker/";
    private Map<String,String> params;

    public FetchJobRequest(String jobseekerId, Response.Listener<String> listener) {
        super(Method.GET, URL+jobseekerId, listener, null);
        params = new HashMap<>();
    }

    @Override
    protected Map<String,String> getParams() throws AuthFailureError {
        return params;
    }
}
