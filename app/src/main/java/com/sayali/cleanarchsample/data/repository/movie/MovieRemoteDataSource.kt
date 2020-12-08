package com.sayali.cleanarchsample.data.repository.movie

import com.sayali.cleanarchsample.data.model.movie.Movie
import com.sayali.cleanarchsample.data.model.movie.MovieList
import retrofit2.Response

//use to fetch data from api
interface MovieRemoteDataSource {

    suspend fun getMovies(): Response<MovieList>
}