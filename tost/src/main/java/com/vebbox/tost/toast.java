package com.vebbox.tost;

import android.content.Context;
import android.widget.Toast;

public class toast {
    public static void v(Context c,String s){
        Toast.makeText(c,s,Toast.LENGTH_SHORT).show();
    }
}
