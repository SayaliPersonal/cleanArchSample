package com.sayali.cleanarchsample.presentation.di.core
import com.sayali.cleanarchsample.data.api.TMDBService
import com.sayali.cleanarchsample.data.repository.movie.dataSourceClasses.MovieRemoteDataSourceImpl
import com.sayali.cleanarchsample.data.repository.movie.dataSourceInterfecase.MovieRemoteDataSource
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RemoteDataModule(private val apiKey: String) {
    @Singleton
    @Provides
    fun provideMovieRemoteDataSource(tmdbService: TMDBService): MovieRemoteDataSource {
        return MovieRemoteDataSourceImpl(
            tmdbService, apiKey
        )
    }



}