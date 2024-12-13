package ted.gun0912.manual.di.domain

import kotlinx.coroutines.flow.Flow

interface GetMovieUseCase {
    operator fun invoke(movieId: Int): Flow<DataResource<Movie>>
}
