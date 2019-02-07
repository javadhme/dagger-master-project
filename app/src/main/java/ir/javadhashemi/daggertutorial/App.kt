package ir.javadhashemi.daggertutorial

import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import ir.javadhashemi.daggertutorial.di.component.DaggerAppComponent


class App : DaggerApplication() {


    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.builder().create(this)
    }

    override fun onCreate() {
        super.onCreate()
    }

}