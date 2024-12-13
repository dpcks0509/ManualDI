package ted.gun0912.manual.di.domain

import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetMovieUseCaseImpl @Inject constructor(
    private val movieRepository: MovieRepository,
) : GetMovieUseCase {
    override operator fun invoke(movieId: Int): Flow<DataResource<Movie>> =
        movieRepository.getMovie(movieId)
}
