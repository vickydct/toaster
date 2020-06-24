package com.vebbox.tost;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;
import android.widget.Toast;

public class toast {
    public  static RequestQueue queue;
    public static JsonObjectRequest request;
    public  static Map<String, String> map = new HashMap<String, String>();
    public static String s2= new String();
    public  String s3;
    public static void insert(Context c,String s,String s1,String s2){

        map.put("param1", s1);
        map.put("param2", s2);
        queue =Volley.newRequestQueue(c);
        request = new JsonObjectRequest(
                Request.Method.POST, // the request method
                s, // the URL
                new JSONObject(map), // the parameters for the php
                new Response.Listener<JSONObject>() { // the response listener
                    @Override
                    public void onResponse(JSONObject response) {
                        // here you parse the json response
                    }
                },
                new Response.ErrorListener() { // the error listener
                    @Override
                    public void onErrorResponse(VolleyError error) {

                      /* here you can warn the user that there
                      was an error while trying to get the json
                      information from the php  */
                    }
                });
    }
}
