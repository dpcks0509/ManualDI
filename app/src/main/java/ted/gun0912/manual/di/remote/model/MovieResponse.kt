package ted.gun0912.manual.di.remote.model

import com.google.gson.annotations.SerializedName
import ted.gun0912.manual.di.data.MovieEntity
import java.util.Date

data class MovieResponse(
    @SerializedName("id")
    val id: Int,
    @SerializedName("title")
    val name: String,
    @SerializedName("overview")
    val description: String,
    @SerializedName("poster_path")
    val posterImagePath: String,
    @SerializedName("vote_average")
    val rating: Float,
    @SerializedName("vote_count")
    val rateCount: Int,
    @SerializedName("release_date")
    val releasedAt: Date,
) {

    private val posterImageUrl: String
        get() = POSTER_IMAGE_PREFIX_URL + posterImagePath

    fun toData(): MovieEntity =
        MovieEntity(id, name, description, posterImageUrl, rating, rateCount, releasedAt)

    companion object {
        private const val IMAGE_PREFIX_URL = "https://image.tmdb.org/t/p"
        const val POSTER_IMAGE_PREFIX_URL = "$IMAGE_PREFIX_URL/w185"
    }
}
