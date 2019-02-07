package ir.javadhashemi.daggertutorial.di.builder

import android.arch.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module
import ir.javadhashemi.daggertutorial.ui.ViewModelFactory

/**
 * Like activity and fragment, all the viewModels must be declared in a builder class
 * Also, all of the ViewModel dependencies must be provided here.
 * like repositories, usecases, ...
 */
@Module(
    includes = [
        //ViewModelBuilder
        ViewModelBuilder::class

        // all module dependencies in viewModel constructor
    ]
)
abstract class ViewModelFactoryBuilder {

    @Binds
    abstract fun bindViewModelFactory(viewModelFactory: ViewModelFactory): ViewModelProvider.Factory
}