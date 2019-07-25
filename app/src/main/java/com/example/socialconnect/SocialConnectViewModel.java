package com.example.socialconnect;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

public class SocialConnectViewModel implements LifecycleObserver {

    private List<SocialConnectItemViewModel> itemViewModel = new ArrayList<>();
    public SocialConnectRecyclerViewAdapter adapter = new SocialConnectRecyclerViewAdapter(itemViewModel);


    @Inject
    public SocialConnectViewModel() {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void getData() {
        getDetailList();


    }


    private void getDetailList() {

        SocialConnectItemViewModel socialConnectItemViewModel = new SocialConnectItemViewModel();
        socialConnectItemViewModel.setContactType(0);
        socialConnectItemViewModel.setName("Ram");
        socialConnectItemViewModel.setViberId("V008");
        socialConnectItemViewModel.setAvailabilityStatus("online");


        SocialConnectItemViewModel socialConnectItemViewModel1 = new SocialConnectItemViewModel();
        socialConnectItemViewModel1.setContactType(1);
        socialConnectItemViewModel1.setName("Suresh");
        socialConnectItemViewModel1.setId(123);
        socialConnectItemViewModel1.setAvailabilityStatusResId(R.drawable.ic_launcher_foreground);


        SocialConnectItemViewModel socialConnectItemViewModel2 = new SocialConnectItemViewModel();
        socialConnectItemViewModel2.setContactType(2);
        socialConnectItemViewModel2.setName("Ramesh");
        socialConnectItemViewModel2.setEmail_Id("abc@gmail.com");


        itemViewModel.add(socialConnectItemViewModel);
        itemViewModel.add(socialConnectItemViewModel1);
        itemViewModel.add(socialConnectItemViewModel2);
        adapter.notifyDataSetChanged();

    }


}
