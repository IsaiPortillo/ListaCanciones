package com.example.appclon;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class toolBarFragment extends Fragment {

    public View vista;


    public toolBarFragment() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static toolBarFragment newInstance() {
        toolBarFragment fragment = new toolBarFragment();
        Bundle args = new Bundle();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        vista = inflater.inflate(R.layout.fragment_tool_bar, container, false);

        return vista;
    }
}