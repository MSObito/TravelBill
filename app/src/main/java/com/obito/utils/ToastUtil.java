package com.obito.utils;

import android.content.Context;
import android.widget.Toast;

public class ToastUtil {

    private static Toast toast;

    /**
     * Android原生Toast的显示，主要解决点多少就提示多少次的问题
     */
    public static void showToast(Context context, String content){

        if (toast == null){
            toast = Toast.makeText(context, content, Toast.LENGTH_SHORT);
        } else {
            toast.setText(content);
        }
        toast.show();
    }

}
