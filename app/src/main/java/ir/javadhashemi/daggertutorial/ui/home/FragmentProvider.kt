package ir.javadhashemi.daggertutorial.ui.home

import dagger.Module
import dagger.android.ContributesAndroidInjector
import ir.javadhashemi.daggertutorial.ui.home.HomeFragment

/**
 * We Put All Fragments related to MainActivity here, to dagger knows them in compile time.
 */
@Module
abstract class FragmentProvider {


    @ContributesAndroidInjector
    abstract fun bindHomeFragment(): HomeFragment


}