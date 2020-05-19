package com.example.brsi2020jaipur;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class organising_committee extends Fragment {


    public organising_committee() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_organising_committe, container, false);

        Button button1=(Button)v.findViewById(R.id.org_img1);
        Button button2=(Button)v.findViewById(R.id.org_btn1);
        Button button3=(Button)v.findViewById(R.id.org_btn2);
        Button button4=(Button)v.findViewById(R.id.org_btn3);
        Button button5=(Button)v.findViewById(R.id.org_btn4);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clicked_text("http://brsi2020jaipur.in");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clicked_text("http://brsi2020jaipur.in/ocommittee");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clicked_text("http://brsi2020jaipur.in/nscommittee");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clicked_text("http://brsi2020jaipur.in/icommittee");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clicked_text("http://brsi2020jaipur.in/ncommittee");
            }
        });


        return v;
    }
    public void clicked_text(String url) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }


























}
