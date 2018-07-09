package com.viinman.product.vachunt.view.hunt.process;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.viinman.product.vachunt.R;

public class ProcessDocumentation1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_process_documentation1);
    }
    public void onSaveClicked(View view){
        Intent toDocumentation2 = new Intent(this,ProcessDocumentation2.class);
        startActivity(toDocumentation2);
    }

}
