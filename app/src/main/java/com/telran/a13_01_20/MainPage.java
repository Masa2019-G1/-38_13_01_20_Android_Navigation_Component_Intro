package com.telran.a13_01_20;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainPage extends Fragment {

    public MainPage() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view  = inflater.inflate(R.layout.fragment_main_page, container, false);
        NavController controller = Navigation.findNavController(container);
        if(Math.random() > 0.5){
            controller.navigate(R.id.page1);
        }
        Log.d("MY_TAG", "onCreateView: " + controller);
        view.findViewById(R.id.nextBtn)
                .setOnClickListener(v -> {
//                    MainActivity activity = (MainActivity) getActivity();
//                    activity.callback.onMainNext();
                    controller.navigate(R.id.page1);
                });
        return view;
    }

}
