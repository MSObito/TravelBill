package com.example.atravelbill.utils;

import android.content.Context;
import android.content.SharedPreferences;

import com.example.atravelbill.model.Settings;


public class SettingUtil {

    /**
     * get setting value
     * @param context
     * @param key
     */
    public static Object readSharedPreferences(Context context, Settings key){
        SharedPreferences sharedPreferences = context.getSharedPreferences("settings", Context.MODE_PRIVATE);
        return sharedPreferences.getString(key.toString(),"");
    }

    /**
     * insert or update setting value
     * @param context
     * @param key
     * @param value
     */
    public static void writeSharedPreferences(Context context, Settings key, String value){
        SharedPreferences sharedPreferences = context.getSharedPreferences("settings",0);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(key.toString(), value);
        editor.commit();
    }
}
