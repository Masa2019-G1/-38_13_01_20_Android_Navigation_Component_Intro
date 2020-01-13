package com.telran.a13_01_20;

import androidx.databinding.ObservableField;

public class FragmentViewModel {
    public ObservableField<String> title = new ObservableField<>();

    public FragmentViewModel() {
        title.set("Hello");
    }

    public void changeTitle(){
        String str = String.valueOf(System.currentTimeMillis());
        title.set(str);
    }

}
