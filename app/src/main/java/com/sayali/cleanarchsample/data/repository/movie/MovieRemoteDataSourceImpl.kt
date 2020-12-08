package com.sayali.cleanarchsample.data.repository.movie

import com.sayali.cleanarchsample.data.api.TMDBService
import com.sayali.cleanarchsample.data.model.movie.MovieList
import retrofit2.Response

//use to fetch data from api
class MovieRemoteDataSourceImpl(
    private val tmdbService: TMDBService,
    private val apiKey:String
): MovieRemoteDataSource {
    override suspend fun getMovies(): Response<MovieList> = tmdbService.getPopularMovies(apiKey)

}

