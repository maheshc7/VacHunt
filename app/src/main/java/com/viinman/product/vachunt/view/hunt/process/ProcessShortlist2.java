package com.viinman.product.vachunt.view.hunt.process;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.viinman.product.vachunt.R;

public class ProcessShortlist2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_process_shortlist_2);
    }

    public void toProfile(View view){
        Intent toProfile = new Intent(this,ProcessProfileActivity.class);
        startActivity(toProfile);
    }

    /*public void toShortlist1(View view){
        Intent toShortlist1 = new Intent(this,ProcessShortlist1.class);
        startActivity(toShortlist1);
    }*/

    public void toInterview1(View view){
        Intent toInterview1 = new Intent(this,ProcessInterview1.class);
        startActivity(toInterview1);
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
