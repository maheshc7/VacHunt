package com.viinman.product.vachunt.view.hunt.jobs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.viinman.product.vachunt.R;
public class JobsMain1 extends AppCompatActivity {

public void seek(View view){

    Intent toSector = new Intent(getApplicationContext(),JobsSector.class);
    startActivity(toSector);
}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jobs_main1);
    }
}
