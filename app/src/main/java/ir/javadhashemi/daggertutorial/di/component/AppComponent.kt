package ir.javadhashemi.daggertutorial.di.component

import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import ir.javadhashemi.daggertutorial.App
import ir.javadhashemi.daggertutorial.di.builder.ActivityBuilder
import ir.javadhashemi.daggertutorial.di.module.AppModule

@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        ActivityBuilder::class,
        AppModule::class
    // DatabaseModule
    // ApiModule
    ]
)
interface AppComponent : AndroidInjector<App> {

    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<App>()
}