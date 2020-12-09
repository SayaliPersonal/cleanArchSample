package com.sayali.cleanarchsample.presentation.di.core

import com.sayali.cleanarchsample.presentation.di.core.DataBaseModule
import com.sayali.cleanarchsample.presentation.di.core.LocalDataModule
import com.sayali.cleanarchsample.presentation.di.core.NetModule
import com.sayali.cleanarchsample.presentation.di.core.CacheDataModule
import com.sayali.cleanarchsample.presentation.di.movie.MovieSubComponent
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [
AppModule::class,
NetModule::class,
DataBaseModule::class,
UseCaseModule::class,
RepositoryModule::class,
RemoteDataModule::class,
LocalDataModule::class,
CacheDataModule::class
])
interface AppComponent {

fun movieSubComponent(): MovieSubComponent.Factory

}