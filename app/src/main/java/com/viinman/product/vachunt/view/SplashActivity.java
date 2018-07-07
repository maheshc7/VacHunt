package com.viinman.product.vachunt.view;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

import com.viinman.product.vachunt.R;

public class SplashActivity extends AppCompatActivity {

    private static int timer=2000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent toTabs =new Intent(getApplicationContext(),TabsActivity.class);
                startActivity(toTabs);
                finish();
            }
        },timer);
    }
}
