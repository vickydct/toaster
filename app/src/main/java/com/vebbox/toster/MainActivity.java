package com.vebbox.toster;

import android.os.Bundle;
import android.widget.Toast;

import java.util.HashMap;
import java.util.Map;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       toast.in(MainActivity.this);

//        Map<String, String> map1 = new HashMap<String, String>();
//
//
//        map1.put("param1", "vd");
//        map1.put("param2", "22");
//
//        String sq=map1.get("param1");
//        Toast.makeText(this,sq,Toast.LENGTH_SHORT).show();
    }
}