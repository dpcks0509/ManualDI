package ted.gun0912.manual.di.remote.model

import com.google.gson.annotations.SerializedName

data class MovieWrapperResponse(
    @SerializedName("page")
    val page: Int,
    @SerializedName("results")
    val summaryMovies: List<MovieResponse>,
)
