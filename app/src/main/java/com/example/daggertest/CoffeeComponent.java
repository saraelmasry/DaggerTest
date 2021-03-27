package com.example.daggertest;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.Subcomponent;

@ActivityScope
@Subcomponent()
public interface CoffeeComponent {
    Coffee getCoffee();


    void inject(MainActivity mainActivity);

    @Subcomponent.Builder
    interface Builder{

        @BindsInstance
        Builder sugar(@Sugar int sugar);

        @BindsInstance
        Builder milk(@Milk int milk);

        /*@BindsInstance
        Builder sugar(@Named("sugar") int sugar);

        @BindsInstance
        Builder milk(@Named("milk") int milk);

         */
        CoffeeComponent build();

    }
}
