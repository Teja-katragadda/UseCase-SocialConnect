package com.example.socialconnect.di;

import dagger.Component;
import dagger.android.AndroidInjection;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;

@Component(modules = {AndroidInjectionModule.class,ActivityBuildersModule.class})
public interface AppComponent extends AndroidInjector<SocialConnectApplication> {

}
