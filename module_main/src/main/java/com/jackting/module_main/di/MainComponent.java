package com.jackting.module_main.di;

import com.jackting.common.di.component.AppComponent;
import com.jackting.common.di.scope.PerActivity;
import com.jackting.module_main.ui.main.MainActivity;

import dagger.Component;

@PerActivity
@Component(dependencies = AppComponent.class,modules = MainModule.class)
public interface MainComponent {
    void inject(MainActivity loginActivity);
}