package com.example.socialconnect;

import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class SocialConnectBindingAdapter {

    @BindingAdapter("loadImage")
    public static void loadImage(ImageView imageView,int resourceId){
        Picasso.get()
                .load(R.drawable.ic_call)
                .into(imageView);

    }
}
