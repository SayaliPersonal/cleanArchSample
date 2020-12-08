package com.anushka.tmdbclient.domain.usecase

import TvShowRepository
import com.sayali.cleanarchsample.data.model.shows.TvShow


class UpdateTvShowsUseCase(private val tvShowRepository: TvShowRepository) {
    suspend fun execute():List<TvShow>?=tvShowRepository.updateTvShows()
}