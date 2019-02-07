package ir.javadhashemi.daggertutorial.di.builder

import android.arch.lifecycle.ViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import ir.javadhashemi.daggertutorial.di.qualifier.ViewModelKey
import ir.javadhashemi.daggertutorial.ui.home.HomeViewModel


@Module
abstract class ViewModelBuilder {

    @Binds
    @IntoMap
    @ViewModelKey(HomeViewModel::class)
    abstract fun bindHomeViewModel(homeViewModel: HomeViewModel) : ViewModel


}