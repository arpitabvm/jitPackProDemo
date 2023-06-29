package com.example.jitpackpro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.dinkar.email_validator.EmailValidate;
import com.example.toastprolive.ToastLive;

public class MainActivity extends AppCompatActivity {

    ToastLive toastLive;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toastLive = new ToastLive();
        toastLive.toastShow(this, "demo test");


    }
}