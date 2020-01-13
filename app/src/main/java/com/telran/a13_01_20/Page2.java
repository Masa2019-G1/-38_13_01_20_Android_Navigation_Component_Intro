package com.telran.a13_01_20;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Page2 extends Fragment {


    public Page2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_page2, container, false);
        String title = getArguments().getString("TITLE");
        TextView titleTxt = view.findViewById(R.id.titleTxt);
        titleTxt.setText(title);
        NavController controller = NavHostFragment.findNavController(this);
        view.findViewById(R.id.backBtn)
                .setOnClickListener(v -> {
//                    MainActivity activity = (MainActivity) getActivity();
//                    activity.callback.onPage2Back();
                    controller.popBackStack();
                });
        return view;
    }

}
