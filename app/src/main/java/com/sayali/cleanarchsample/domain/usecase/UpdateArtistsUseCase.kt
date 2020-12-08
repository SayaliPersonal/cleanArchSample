package com.anushka.tmdbclient.domain.usecase

import ArtistRepository
import com.sayali.cleanarchsample.data.model.artist.Artist


class UpdateArtistsUseCase(private val artistRepository: ArtistRepository) {
    suspend fun execute():List<Artist>? = artistRepository.updateArtists()
}