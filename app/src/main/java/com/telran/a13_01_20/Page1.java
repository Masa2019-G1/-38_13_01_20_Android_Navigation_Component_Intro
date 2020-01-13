package com.telran.a13_01_20;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class Page1 extends Fragment {


    public Page1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_page1, container, false);
        NavController controller = NavHostFragment.findNavController(this);
        view.findViewById(R.id.backBtn)
                .setOnClickListener(v -> {
//                    MainActivity activity = (MainActivity) getActivity();
//                    activity.callback.onPage1Back();
                    controller.popBackStack();
                });

        view.findViewById(R.id.nextBtn)
                .setOnClickListener(v -> {
//                    MainActivity activity = (MainActivity) getActivity();
//                    activity.callback.onPage1Next();
//                    Bundle bundle = new Bundle();
//                    bundle.putString("TITLE","My Title");
//                    controller.navigate(R.id.page2,bundle);
                    controller.navigate(R.id.page2);
                });
        return view;
    }

}
