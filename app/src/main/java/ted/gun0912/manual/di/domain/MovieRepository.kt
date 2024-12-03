package ted.gun0912.manual.di.domain

import kotlinx.coroutines.flow.Flow

interface MovieRepository {

    fun getMovies(): Flow<DataResource<List<Movie>>>
}
