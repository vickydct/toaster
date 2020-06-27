package com.vebbox.tost;

import android.content.Context;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import org.json.JSONObject;
import java.util.HashMap;
import java.util.Map;

public class vebbox {

    public static void querry(final Context c,String s1,String s2){

        RequestQueue queue;
        JsonObjectRequest request = null;
        Map<String, String> map1 = new HashMap<String, String>();

        queue = Volley.newRequestQueue(c);
        map1.put("param1", s2);

        request = new JsonObjectRequest(
                Request.Method.POST,
                s1,
                new JSONObject(map1),
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

        queue.add(request);

    }

}
