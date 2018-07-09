package com.viinman.product.vachunt.view.hunt.jobs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.viinman.product.vachunt.R;

public class JobsSector extends AppCompatActivity {

    public void energy(View v){

        Intent toEnergy = new Intent(getApplicationContext(),JobsSectorEnergy.class);
        startActivity(toEnergy);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jobs_sector);
    }
}
