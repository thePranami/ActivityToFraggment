package com.example.thepranami.actionbyradioaf;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Actionradio extends Fragment {
    TextView textView;


    public Actionradio() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_actionradio, container, false);
        textView = (TextView)view.findViewById(R.id.tv1);
        Bundle bundle1 = new Bundle();
        float value = bundle1.getFloat("num");
        //textView.setText(String.valueOf(value));
        textView.setText(Float.toString(value));

        return view;
    }

}
