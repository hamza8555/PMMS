package com.shashank.platform.loginui;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

import static com.shashank.platform.loginui.R.layout;


public class IntersectionsFragment extends Fragment {

    Button b1;

    public IntersectionsFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(layout.fragment_intersections, container, false);

         b1 = v.findViewById(R.id.Ebutton);

         b1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 startActivity(new Intent(getActivity(),Intersections.class));
             }
         });

                return v;

    }
    }


