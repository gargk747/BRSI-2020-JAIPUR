package com.example.brsi2020jaipur;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class contacts_fragment extends Fragment {


    public contacts_fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_contacts_fragment, container, false);

        TextView textView=(TextView)v.findViewById(R.id.con_tv1);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clicked_text("http://mnit.ac.in/dept_cree/preprofile.php");
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
