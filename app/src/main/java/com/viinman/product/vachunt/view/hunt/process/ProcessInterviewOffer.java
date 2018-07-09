package com.viinman.product.vachunt.view.hunt.process;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.viinman.product.vachunt.R;

public class ProcessInterviewOffer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_process_interview_offer);
    }
    public void onSaveClicked(View view){
        Intent toDocumentation = new Intent(this,ProcessDocumentation1.class);
        startActivity(toDocumentation);
    }

}
