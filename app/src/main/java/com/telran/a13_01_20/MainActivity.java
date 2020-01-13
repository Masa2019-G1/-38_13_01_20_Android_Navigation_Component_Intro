package com.telran.a13_01_20;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    NavController controller;

    Callback callback = new Callback() {
        @Override
        public void onMainNext() {
            controller.navigate(R.id.page1);
        }

        @Override
        public void onPage1Next() {
            controller.navigate(R.id.page2);
        }

        @Override
        public void onPage1Back() {
            controller.popBackStack();
        }

        @Override
        public void onPage2Back() {
            controller.popBackStack();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        controller = Navigation.findNavController(this,R.id.fragment);
//        getSupportFragmentManager()
//                .beginTransaction()
//                .add(R.id.container,new MyFragment())
//                .commit();

    }

    @Override
    public void onBackPressed() {
        if(controller.getCurrentDestination().getId() == R.id.page1){
            finish();
        }else {
            super.onBackPressed();
        }
    }

    interface Callback{
        void onMainNext();
        void onPage1Next();
        void onPage1Back();
        void onPage2Back();
    }
}
