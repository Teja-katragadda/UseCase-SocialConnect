package com.example.socialconnect.di;

import dagger.Component;
import dagger.android.AndroidInjectionModule;

@Component(modules = {AndroidInjectionModule.class,SocialConnectApplication.class})
public interface AppComponent {
    void inject(SocialConnectApplication socialConnectApplication);
}
