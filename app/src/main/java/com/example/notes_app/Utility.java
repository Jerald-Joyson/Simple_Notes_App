package com.example.notes_app;

import android.content.Context;
import android.widget.Toast;

public class Utility {
    public static void showToast(Context context,String Msg){
        Toast.makeText(context,Msg,Toast.LENGTH_SHORT).show();
    }
}
