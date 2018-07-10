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
    public void toOffer(View view){
        Intent toOffer = new Intent(this,ProcessInterviewOffer.class);
        startActivity(toOffer);
    }
    public void toSchedule(View view){
        Intent toSchedule = new Intent(this,ProcessInterviewSchedule.class);
        startActivity(toSchedule);
    }




    public void toShortlist1(View view){
        Intent toShortlist1 = new Intent(this,ProcessShortlist1.class);
        startActivity(toShortlist1);
    }

    public void toInterview2(View view){
        Intent toInterview2 = new Intent(this,ProcessInterview2.class);
        startActivity(toInterview2);
    }
    public void toDoc1(View view){
        Intent toDoc1 = new Intent(this,ProcessDocumentation1.class);
        startActivity(toDoc1);
    }
    public void toDeploy1(View view){
        Intent toDeploy1 = new Intent(this,ProcessDeployment1.class);
        startActivity(toDeploy1);
    }
}
