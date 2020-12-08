package com.sayali.cleanarchsample.data.roomDB

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.sayali.cleanarchsample.data.model.movie.Movie

@Dao
interface MovieDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
   suspend fun saveMovies(movie: List<Movie>)

    @Query("DELETE FROM popular_movies")
    suspend fun deleteAllmovies()

    @Query("SELECT * FROM popular_movies")
    suspend fun getMovies():List<Movie>
}