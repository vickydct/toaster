package com.vebbox.tost;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

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


public class insert {
   public static RequestQueue queue;
    public static JsonObjectRequest request;
    public static Map<String, String> map1 = new HashMap<String, String>();

    public static void in(Context c){


        queue = Volley.newRequestQueue(c);
        map1.put("param1", "vd");
        map1.put("param2", "22");
        request = new JsonObjectRequest(
                Request.Method.POST, // the request method
                "https://vebbox.in/json/json.php", // the URL
                new JSONObject(map1), // the parameters for the php
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
