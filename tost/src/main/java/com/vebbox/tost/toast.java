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

import android.util.Log;
import android.widget.Toast;

public class toast {



    public static void in(final Context c){
        RequestQueue queue;
        JsonObjectRequest request = null;
        Map<String, String> map1 = new HashMap<String, String>();

        queue = Volley.newRequestQueue(c);
        map1.put("param1", "vd1");
        map1.put("param2", "22");
        final String sk=map1.get("param1");
        try {


        request = new JsonObjectRequest(
                Request.Method.POST, // the request method
                "https://vebbox.in/json/json.php", // the URL
                new JSONObject(map1), // the parameters for the php
                new Response.Listener<JSONObject>() { // the response listener
                    @Override
                    public void onResponse(JSONObject response) {
                        // here you parse the json response
                        Toast.makeText(c,sk,Toast.LENGTH_SHORT).show();
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
        catch (Exception e1){
            Log.e("e", String.valueOf(e1));
            Toast.makeText(c,sk,Toast.LENGTH_SHORT).show();
        }



        // executing the quere to get the json information
        queue.add(request);

    }

}
