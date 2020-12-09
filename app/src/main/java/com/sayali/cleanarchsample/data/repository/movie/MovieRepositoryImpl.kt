package com.sayali.cleanarchsample.data.repository.movie

import android.util.Log
import com.sayali.cleanarchsample.data.model.movie.Movie
import com.sayali.cleanarchsample.data.repository.movie.dataSourceInterfecase.MovieCacheDataSource
import com.sayali.cleanarchsample.data.repository.movie.dataSourceInterfecase.MovieLocalDataSource
import com.sayali.cleanarchsample.data.repository.movie.dataSourceInterfecase.MovieRemoteDataSource
import com.sayali.cleanarchsample.domain.repository.MovieRepository
import java.lang.Exception

class MovieRepositoryImpl(private val movieRemoteDatasource: MovieRemoteDataSource,
                          private val movieLocalDataSource: MovieLocalDataSource,
                          private val movieCacheDataSource: MovieCacheDataSource
):MovieRepository {

    override suspend fun getMovies(): List<Movie> {
        lateinit var movieList: List<Movie>
        movieList = getMoviesFromCache()
       return movieList
    }

    override suspend fun updateMovies(): List<Movie> {
        lateinit var movieList: List<Movie>
        lateinit var updatedList: List<Movie>
        updatedList=getMoviesFromAPI()
        movieLocalDataSource.clearAll()
        movieLocalDataSource.saveMoviesToDB(updatedList)
        movieList=movieCacheDataSource.getMoviesFromCache()

        return movieList
    }

    suspend fun getMoviesFromAPI(): List<Movie> {
        lateinit var movieList: List<Movie>
        try {
            val response = movieRemoteDatasource.getMovies()
            val body = response.body()
            if(body!=null){
                movieList = body.movies
            }
        } catch (exception: Exception) {
            Log.i("MyTag", exception.message.toString())
        }
        return movieList
    }

    suspend fun getMoviesFromDB():List<Movie>{
        lateinit var movieList: List<Movie>
        try {
            movieList = movieLocalDataSource.getMoviesFromDB()
        } catch (exception: Exception) {
        }
        if(movieList.size>0){
            return movieList
        }else{
            movieList=getMoviesFromAPI()
            movieLocalDataSource.saveMoviesToDB(movieList)
        }

        return movieList
    }

    suspend fun getMoviesFromCache():List<Movie>{
        lateinit var movieList: List<Movie>
        try {
            movieList = movieCacheDataSource.getMoviesFromCache()
        } catch (exception: Exception) {
        }
        if(movieList.size>0){
            return movieList
        }else{
            movieList=getMoviesFromDB()
            movieCacheDataSource.saveMoviesToCache(movieList)
        }
        return movieList
    }
}