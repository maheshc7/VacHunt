package com.viinman.product.vachunt.view.profile;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.viinman.product.vachunt.R;

public class ProfileActivity extends Fragment {

    Button leaderBtn, contactBtn, eventBtn, bgBtn, locBtn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.profile_tab, container, false);

        leaderBtn =rootView.findViewById(R.id.profile_leadershipBtn);
        bgBtn =rootView.findViewById(R.id.profile_backgroundBtn);
        eventBtn =rootView.findViewById(R.id.profile_eventsBtn);
        contactBtn =rootView.findViewById(R.id.profile_contactsBtn);
        locBtn =rootView.findViewById(R.id.profile_locationBtn);


        return  rootView;
    }
    public void onLeadershipClick(View view){

    }
}
