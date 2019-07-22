package com.example.socialconnect;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;

import java.util.ArrayList;
import java.util.List;

public class SocialConnectViewModel implements LifecycleObserver {

    private List<SocialConnectItemViewModel> itemViewModel = new ArrayList<>();
    public SocialConnectRecyclerViewAdapter adapter;


    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void getData() {
        getDetailList();
        adapter = new SocialConnectRecyclerViewAdapter(itemViewModel);

    }


    private void getDetailList() {

        SocialConnectItemViewModel socialConnectItemViewModel = new SocialConnectItemViewModel();
        socialConnectItemViewModel.setName("Ram");
        socialConnectItemViewModel.setContactType("Viber");


        SocialConnectItemViewModel socialConnectItemViewModel1 = new SocialConnectItemViewModel();
        socialConnectItemViewModel.setName("Ramesh");
        socialConnectItemViewModel.setContactType("Email");
        socialConnectItemViewModel.setContactType("Google_Duo");
        socialConnectItemViewModel.setEmail_Id("ramesh@gmail.com");
        socialConnectItemViewModel.setAvailabilityStatus("online");

        SocialConnectItemViewModel socialConnectItemViewModel2 = new SocialConnectItemViewModel();
        socialConnectItemViewModel.setName("Suresh");
        socialConnectItemViewModel.setContactType("Whatsapp");
        socialConnectItemViewModel.setAvailabilityStatus("onLine");


        itemViewModel.add(socialConnectItemViewModel);
        itemViewModel.add(socialConnectItemViewModel1);
        itemViewModel.add(socialConnectItemViewModel2);
        adapter.notifyDataSetChanged();

    }

    public SocialConnectRecyclerViewAdapter getAdapter() {
        return adapter;
    }
}
