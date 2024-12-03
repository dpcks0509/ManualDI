package ted.gun0912.manual.di.domain

import java.util.Date

data class Movie(
    val id: Int,
    val name: String,
    val description: String,
    val posterImageUrl: String,
    val rating: Float,
    val rateCount: Int,
    val releasedAt: Date,
)
