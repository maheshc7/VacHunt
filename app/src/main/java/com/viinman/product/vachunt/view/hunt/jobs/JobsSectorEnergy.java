package com.viinman.product.vachunt.view.hunt.jobs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.viinman.product.vachunt.R;

public class JobsSectorEnergy extends AppCompatActivity {

    public void oil(View view){

        Intent toOil = new Intent(getApplicationContext(),JobsSectorEnergyOil.class);
        startActivity(toOil);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jobs_sector_energy);
    }
}
