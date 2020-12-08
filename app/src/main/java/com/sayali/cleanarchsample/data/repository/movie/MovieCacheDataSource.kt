package com.sayali.cleanarchsample.data.repository.movie
import com.sayali.cleanarchsample.data.model.movie.Movie

//use to store & fetch data  from array
interface MovieCacheDataSource {
    suspend fun getMoviesFromCache():List<Movie>
    suspend fun saveMoviesToCache(movies:List<Movie>)

}