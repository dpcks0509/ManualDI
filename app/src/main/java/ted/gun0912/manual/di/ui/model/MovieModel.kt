package ted.gun0912.manual.di.ui.model

import ted.gun0912.manual.di.domain.Movie
import java.util.Date

data class MovieModel(
    val id: Int,
    val name: String,
    val description: String,
    val posterImageUrl: String,
    val rating: Float,
    val rateCount: Int,
    val releasedAt: Date,
)

fun Movie.toPresentation(): MovieModel =
    MovieModel(id, name, description, posterImageUrl, rating, rateCount, releasedAt)
