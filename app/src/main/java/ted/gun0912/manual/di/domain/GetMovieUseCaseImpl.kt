package ted.gun0912.manual.di.domain

import kotlinx.coroutines.flow.Flow

class GetMovieUseCaseImpl(
    private val movieRepository: MovieRepository,
) : GetMovieUseCase {
    override operator fun invoke(movieId: Int): Flow<DataResource<Movie>> = movieRepository.getMovie(movieId)
}
