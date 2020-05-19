package com.example.brsi2020jaipur;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class accomodation_fragment extends Fragment {


    public accomodation_fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_accomodation_fragment, container, false);
    }
    public void clicked_text(String url) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        getView().findViewById(R.id.acc_tv5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clicked_text("https://www.google.com/maps/place/Birla+Institute+Of+Scientific+Research/@26.905529,75.80538,16z/data=!4m5!3m4!1s0x0:0xa6f37935dd318ae6!8m2!3d26.9055289!4d75.8053798?hl=en");
            }
        });

    }


}
