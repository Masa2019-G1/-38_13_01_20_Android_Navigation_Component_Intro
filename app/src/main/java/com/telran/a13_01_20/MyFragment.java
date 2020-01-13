package com.telran.a13_01_20;


import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.telran.a13_01_20.databinding.FragmentMyBinding;


/**
 * A simple {@link Fragment} subclass.
 */
public class MyFragment extends Fragment {


    public MyFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        FragmentViewModel viewModel = new FragmentViewModel();
        FragmentMyBinding binding = DataBindingUtil.inflate(inflater,R.layout.fragment_my,container,false);
        binding.setViewModel(viewModel);
        return binding.getRoot();
    }

}
