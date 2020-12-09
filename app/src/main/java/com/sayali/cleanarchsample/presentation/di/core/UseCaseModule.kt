package com.sayali.cleanarchsample.presentation.di.core
import com.sayali.cleanarchsample.domain.repository.MovieRepository
import com.sayali.cleanarchsample.domain.usecase.GetMovieUseCase
import com.sayali.cleanarchsample.domain.usecase.UpdateMovieUseCase
import dagger.Module
import dagger.Provides

@Module
class UseCaseModule {

    @Provides
    fun provideGetMovieUseCase(movieRepository: MovieRepository): GetMovieUseCase {
        return GetMovieUseCase(movieRepository)
    }
    @Provides
    fun provideUpdateMovieUseCase(movieRepository: MovieRepository):UpdateMovieUseCase{
        return UpdateMovieUseCase(movieRepository)
    }
}