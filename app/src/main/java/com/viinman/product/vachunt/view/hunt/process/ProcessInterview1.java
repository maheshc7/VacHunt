package com.viinman.product.vachunt.view.hunt.process;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.viinman.product.vachunt.R;

public class ProcessInterview1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_process_interview1);
    }
    public void onSaveClicked(View view){
        Intent toInterview2 = new Intent(this,ProcessInterview2.class);
        startActivity(toInterview2);
    }
}
