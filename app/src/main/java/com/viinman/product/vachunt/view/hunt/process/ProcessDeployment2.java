package com.viinman.product.vachunt.view.hunt.process;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.viinman.product.vachunt.R;

import com.viinman.product.vachunt.R;

public class ProcessDeployment2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_process_deployment2);
    }
    public void onSaveClicked(View view){
        Intent toDeployement2 = new Intent(this,ProcessDeployment2.class);
        startActivity(toDeployement2);
    }

}
