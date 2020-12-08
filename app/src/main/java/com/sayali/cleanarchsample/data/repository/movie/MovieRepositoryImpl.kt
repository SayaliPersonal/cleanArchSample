package com.sayali.cleanarchsample.data.repository.movie

import com.sayali.cleanarchsample.data.model.movie.Movie
import com.sayali.cleanarchsample.domain.repository.MovieRepository

class MovieRepositoryImpl:MovieRepository {
    override suspend fun getMovies(): List<Movie> {
        TODO("Not yet implemented")
    }

    override suspend fun updateMovies(): List<Movie> {
        TODO("Not yet implemented")
    }
}