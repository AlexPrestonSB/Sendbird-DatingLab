package com.sendbird.datinglab.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.sendbird.datinglab.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AccountFragment extends Fragment {


    View rootLayout;
    private ImageView profileImage;
    private TextView userName, userInfo;

    public AccountFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootLayout = inflater.inflate(R.layout.fragment_account, container, false);
        profileImage = (ImageView) rootLayout.findViewById(R.id.profile_image);
        userName = (TextView) rootLayout.findViewById(R.id.profile_name);
        userInfo = (TextView) rootLayout.findViewById(R.id.profile_info);


        //TODO SENDBIRD

        // END
        return rootLayout;
    }

}
