package com.viinman.product.vachunt.view.hunt;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.viinman.product.vachunt.R;
import com.viinman.product.vachunt.view.hunt.process.ProcessShortlist1;

public class HuntActivity extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.hunt_tab, container, false);
        Button process = rootView.findViewById(R.id.hunt_processBtn);
        process.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toProcess = new Intent(getContext(), ProcessShortlist1.class);
                startActivity(toProcess);
            }
        });

        return  rootView;
    }
}
