package com.example.brsi2020jaipur;


import android.content.Intent;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class abstract_fragment extends Fragment {


    public abstract_fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment






        return inflater.inflate(R.layout.fragment_abstract_fragment, container, false);
    }

    public void clicked_text(String url){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        getView().findViewById(R.id.abs_tv2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clicked_text("http://brsi2020jaipur.in/downloads/Abstract%20Template.docx");
            }
        });

    }
}
