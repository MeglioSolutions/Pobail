package com.megliosolutions.tagspots.Fragments;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.megliosolutions.tagspots.R;

/**
 * Created by Meglio on 7/11/16.
 */
public class FriendsActivity extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_friends, container,false);
        UpdateTitle();


        return view;
    }

    private void UpdateTitle() {

        //Set Title to Description
        getActivity().setTitle("Friends");

    }
}
