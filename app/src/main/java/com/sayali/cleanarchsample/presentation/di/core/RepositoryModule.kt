package com.sayali.cleanarchsample.presentation.di.core
import com.sayali.cleanarchsample.data.repository.movie.MovieRepositoryImpl
import com.sayali.cleanarchsample.data.repository.movie.dataSourceInterfecase.MovieCacheDataSource
import com.sayali.cleanarchsample.data.repository.movie.dataSourceInterfecase.MovieLocalDataSource
import com.sayali.cleanarchsample.data.repository.movie.dataSourceInterfecase.MovieRemoteDataSource
import com.sayali.cleanarchsample.domain.repository.MovieRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepositoryModule {

    @Provides
    @Singleton
    fun provideMovieRepository(
        movieRemoteDatasource: MovieRemoteDataSource,
        movieLocalDataSource: MovieLocalDataSource,
        movieCacheDataSource: MovieCacheDataSource
    ): MovieRepository {

        return MovieRepositoryImpl(
            movieRemoteDatasource,
            movieLocalDataSource,
            movieCacheDataSource
        )

    }
}