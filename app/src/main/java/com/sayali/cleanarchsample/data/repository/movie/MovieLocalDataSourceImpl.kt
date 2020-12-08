package com.sayali.cleanarchsample.data.repository.movie

import com.sayali.cleanarchsample.data.api.TMDBService
import com.sayali.cleanarchsample.data.model.movie.Movie
import com.sayali.cleanarchsample.data.model.movie.MovieList
import com.sayali.cleanarchsample.data.roomDB.MovieDao
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch
import retrofit2.Response

//use to fetch data from Room
class MovieLocalDataSourceImpl(private val movieDao: MovieDao):MovieLocalDataSource {
    override suspend fun getMoviesFromDB(): List<Movie> {
       return movieDao.getMovies()
    }

    override suspend fun saveMoviesToDB(movies: List<Movie>) {
       CoroutineScope(Dispatchers.IO).launch{
           movieDao.saveMovies(movies)
       }
    }

    override suspend fun clearAll() {
        CoroutineScope(Dispatchers.IO).launch{
            movieDao.deleteAllmovies()
        }
    }
}
