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
    public static void v(Context c,String s){
        Toast.makeText(c,s,Toast.LENGTH_SHORT).show();

    }
}
