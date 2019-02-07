package ir.javadhashemi.daggertutorial.di.module

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import ir.javadhashemi.daggertutorial.di.builder.ViewModelFactoryBuilder
import javax.inject.Singleton

/**
 * All necessary modules which are needed in whole app must be included here.
 */
@Module(
    includes = [
        ViewModelFactoryBuilder::class
    ]
)
class AppModule {

    @Singleton
    @Provides
    fun provideContext(app: Application): Context = app.applicationContext

}