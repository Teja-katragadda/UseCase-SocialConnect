package com.example.socialconnect;

import android.arch.lifecycle.LifecycleOwner;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.socialconnect.databinding.ActivityMainBinding;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity implements LifecycleOwner {

    @Inject
    SocialConnectViewModel socialConnectViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        this.getLifecycle().addObserver(socialConnectViewModel);
        binding.setViewModel(socialConnectViewModel);
    }
}
