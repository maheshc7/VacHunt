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

    public void onSaveBtnClick(View view){
        Intent toInterview = new Intent(this,ProcessInterview1.class);
        startActivity(toInterview);
    }


}
