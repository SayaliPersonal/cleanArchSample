package com.sayali.cleanarchsample.data.repository.movie.dataSourceClasses

import com.sayali.cleanarchsample.data.model.movie.Movie
import com.sayali.cleanarchsample.data.repository.movie.dataSourceInterfecase.MovieCacheDataSource

//use to store & fetch data  from array
class MovieCacheDataSourceImpl :
    MovieCacheDataSource {
    private var movieList = ArrayList<Movie>()

    override suspend fun getMoviesFromCache(): List<Movie> {
        return movieList
    }

    override suspend fun saveMoviesToCache(movies: List<Movie>) {
       movieList.clear()
       movieList = ArrayList(movies)
    }
}