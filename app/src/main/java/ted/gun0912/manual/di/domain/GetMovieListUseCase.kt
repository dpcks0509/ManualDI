package ted.gun0912.manual.di.domain

import kotlinx.coroutines.flow.Flow

interface GetMovieListUseCase {

    operator fun invoke(): Flow<DataResource<List<Movie>>>
}
