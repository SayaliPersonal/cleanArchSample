package com.sayali.cleanarchsample.presentation.di.core

import com.sayali.cleanarchsample.data.repository.movie.dataSourceClasses.MovieLocalDataSourceImpl
import com.sayali.cleanarchsample.data.repository.movie.dataSourceInterfecase.MovieLocalDataSource
import com.sayali.cleanarchsample.data.roomDB.ArtistDao
import com.sayali.cleanarchsample.data.roomDB.MovieDao
import com.sayali.cleanarchsample.data.roomDB.TvShowDao
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class LocalDataModule {

    @Singleton
    @Provides
    fun provideMovieLocalDataSource(movieDao: MovieDao): MovieLocalDataSource {
        return MovieLocalDataSourceImpl(movieDao)
    }



}