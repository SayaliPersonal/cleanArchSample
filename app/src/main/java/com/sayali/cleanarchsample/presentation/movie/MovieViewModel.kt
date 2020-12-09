package com.sayali.cleanarchsample.presentation.movie

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.sayali.cleanarchsample.domain.usecase.GetMovieUseCase
import com.sayali.cleanarchsample.domain.usecase.UpdateMovieUseCase

class MovieViewModel(
    private val  getMovieUseCase: GetMovieUseCase,
    private val   updateMovieUseCase: UpdateMovieUseCase
):ViewModel() {

    fun getMovies() = liveData {
        val movieList = getMovieUseCase.execute()
        emit(movieList)
    }

    fun updateMovies() = liveData {
        val movieList = updateMovieUseCase.execute()
        emit(movieList)
    }

}
