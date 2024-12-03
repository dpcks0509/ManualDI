package ted.gun0912.manual.di.presentation

import ted.gun0912.manual.di.ui.model.MovieModel

data class MovieUiState(
    val isLoading: Boolean,
    val movies: List<MovieModel>,
    val error: Throwable?,
) {
    companion object {
        val DEFAULT = MovieUiState(
            isLoading = false,
            movies = emptyList(),
            error = null
        )
    }
}
