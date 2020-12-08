
import com.sayali.cleanarchsample.data.model.artist.Artist


interface ArtistRepository {
    suspend fun getArtists():List<Artist>?
    suspend fun updateArtists():List<Artist>?
}