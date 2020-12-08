package com.sayali.cleanarchsample.domain.repository

import com.sayali.cleanarchsample.data.model.movie.Movie

interface MovieRepository {
    suspend fun getMovies():List<Movie>
    suspend fun updateMovies():List<Movie>
}