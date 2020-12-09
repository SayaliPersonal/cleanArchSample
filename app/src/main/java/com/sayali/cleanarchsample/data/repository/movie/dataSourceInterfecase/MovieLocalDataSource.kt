package com.sayali.cleanarchsample.data.repository.movie.dataSourceInterfecase
import com.sayali.cleanarchsample.data.model.movie.Movie

//use to fetch data from Room
interface MovieLocalDataSource {
  suspend fun getMoviesFromDB():List<Movie>
  suspend fun saveMoviesToDB(movies:List<Movie>)
  suspend fun clearAll()
}