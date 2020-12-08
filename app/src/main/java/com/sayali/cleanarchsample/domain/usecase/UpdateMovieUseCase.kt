package com.sayali.cleanarchsample.domain.usecase

import com.sayali.cleanarchsample.data.model.movie.Movie
import com.sayali.cleanarchsample.domain.repository.MovieRepository

class UpdateMovieUseCase (private val movieRepository: MovieRepository) {
    suspend fun execute():List<Movie>?=movieRepository.updateMovies()
}