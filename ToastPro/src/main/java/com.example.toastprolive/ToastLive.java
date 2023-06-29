package com.example.toastprolive;

import android.app.Activity;
import android.widget.Toast;

public class ToastLive {
    public ToastLive() {
    }

    public void toastShow(Activity activity, String toastname) {
        Toast.makeText(activity, "demo---" + toastname, Toast.LENGTH_SHORT).show();
    }
}
