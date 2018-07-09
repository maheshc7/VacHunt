package com.viinman.product.vachunt.view.hunt.process;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.viinman.product.vachunt.R;

public class ProcessInterview3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_process_interview3);
    }
    public void onSaveClicked(View view){
        Intent toOffer = new Intent(this,ProcessInterviewOffer.class);
        startActivity(toOffer);
    }
}
