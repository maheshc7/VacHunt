package com.viinman.product.vachunt.view.hunt.process;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.viinman.product.vachunt.R;

public class ProcessShortlist1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_process_shortlist1);
    }

    public void onBtnClick(View view){
        Intent toShortlist2 = new Intent(this,ProcessShortlist2.class);
        startActivity(toShortlist2);
    }
}
