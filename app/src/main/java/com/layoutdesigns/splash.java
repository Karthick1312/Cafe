package com.layoutdesigns;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;

import java.util.Objects;

public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        );
        Objects.requireNonNull(getSupportActionBar()).hide();

        Thread thread=new Thread(){

            public void run(){

                try {
                    sleep(3000);

                }
                catch (Exception e){
                    e.printStackTrace();

                }
                finally {
                    Intent intent = new Intent(splash.this , sign.class);
                    startActivity(intent);

                }
            }
        }; thread.start();
    }
}