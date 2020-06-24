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




    public static void insert(Context c){

       RequestQueue queue;
        JsonObjectRequest request;
        Map<String, String> map = new HashMap<String, String>();

        // the request queue
        queue = Volley.newRequestQueue(c);

        // the parameters for the php
        // map.put(KEY, VALUE);
        map.put("param1", " dssfdsfdsfds");
        map.put("param2", "109");

        // the JSON request
        // JsonObjectRequest(METHOD, URL, JSONOBJECT(PARAMETERS), OK_LISTENER, ERROR_LISTENER);
        request = new JsonObjectRequest(
                Request.Method.POST, // the request method
                "https://vebbox.in/json/json.php", // the URL
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

        // executing the quere to get the json information
        queue.add(request);
    }
}
