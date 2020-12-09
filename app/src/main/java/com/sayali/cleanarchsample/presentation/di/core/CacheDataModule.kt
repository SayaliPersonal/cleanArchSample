package com.sayali.cleanarchsample.presentation.di.core

import com.sayali.cleanarchsample.data.repository.movie.dataSourceClasses.MovieCacheDataSourceImpl
import com.sayali.cleanarchsample.data.repository.movie.dataSourceInterfecase.MovieCacheDataSource
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class CacheDataModule {
    @Singleton
    @Provides
    fun provideMovieCacheDataSource(): MovieCacheDataSource {
        return MovieCacheDataSourceImpl()
    }

}