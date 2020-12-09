package com.sayali.cleanarchsample.presentation.di.core

import android.content.Context
import androidx.room.Room
import com.sayali.cleanarchsample.data.roomDB.ArtistDao
import com.sayali.cleanarchsample.data.roomDB.MovieDao
import com.sayali.cleanarchsample.data.roomDB.TMDBDatabase
import com.sayali.cleanarchsample.data.roomDB.TvShowDao
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DataBaseModule {
    @Singleton
    @Provides
    fun provideMovieDataBase(context: Context): TMDBDatabase {
     return Room.databaseBuilder(context,TMDBDatabase::class.java,"tmdbclient")
         .build()
    }
    @Singleton
    @Provides
    fun provideMovieDao(tmdbDatabase: TMDBDatabase): MovieDao {
        return tmdbDatabase.movieDao()
    }

    @Singleton
    @Provides
    fun provideTvDao(tmdbDatabase: TMDBDatabase): TvShowDao {
        return tmdbDatabase.tvDao()
    }

    @Singleton
    @Provides
    fun provideArtistDao(tmdbDatabase: TMDBDatabase): ArtistDao {
        return tmdbDatabase.artistDao()
    }





}