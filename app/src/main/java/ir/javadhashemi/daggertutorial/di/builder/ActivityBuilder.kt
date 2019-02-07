package ir.javadhashemi.daggertutorial.di.builder

import dagger.Module
import dagger.android.ContributesAndroidInjector
import ir.javadhashemi.daggertutorial.di.module.MainActivityModule
import ir.javadhashemi.daggertutorial.ui.MainActivity
import ir.javadhashemi.daggertutorial.ui.home.FragmentProvider


/**
 * Put All Activity classes here, to dagger know our activities in compile time.
 * Each Activity has some fragments which must be declared in `modules` array.
 * in addition, Each Activity has needs some object which is provided by module class.
 * These modules also must be declared in the `modules` array
 */
@Module
abstract class ActivityBuilder {

    @ContributesAndroidInjector(
        modules = [
            MainActivityModule::class,
            FragmentProvider::class
        ]
    )
    abstract fun bindMainActivity(): MainActivity

}