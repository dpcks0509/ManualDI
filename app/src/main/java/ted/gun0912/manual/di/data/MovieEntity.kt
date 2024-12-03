package ted.gun0912.manual.di.data

import ted.gun0912.manual.di.domain.Movie
import java.util.Date

data class MovieEntity(
    val id: Int,
    val name: String,
    val description: String,
    val posterImageUrl: String,
    val rating: Float,
    val rateCount: Int,
    val releasedAt: Date,
) {
    fun toDomain(): Movie =
        Movie(id, name, description, posterImageUrl, rating, rateCount, releasedAt)
}
