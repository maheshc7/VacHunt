package com.viinman.product.vachunt.view.hunt.jobs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.viinman.product.vachunt.R;

public class JobsMain extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jobs_main);

        Button add=findViewById(R.id.jobs_addreqBtn);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toJobs1 = new Intent(getApplicationContext(),JobsMain1.class);
                startActivity(toJobs1);
            }
        });
    }
}
