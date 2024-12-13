package ted.gun0912.manual.di.data

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import ted.gun0912.manual.di.domain.DataResource
import ted.gun0912.manual.di.domain.Movie
import ted.gun0912.manual.di.domain.MovieRepository

class MovieRepositoryImpl(
    private val movieRemoteDataSource: MovieRemoteDataSource,
) : MovieRepository {
    override fun getMovies(): Flow<DataResource<List<Movie>>> =
        flow {
            emit(DataResource.loading())
            try {
                val movies = movieRemoteDataSource.getMovies().map { it.toDomain() }
                emit(DataResource.success(movies))
            } catch (e: Exception) {
                emit(DataResource.error(e))
            }
        }

    override fun getMovie(movieId: Int): Flow<DataResource<Movie>> =
        flow {
            emit(DataResource.loading())
            try {
                val movies = movieRemoteDataSource.getMovie(movieId).toDomain()
                emit(DataResource.success(movies))
            } catch (e: Exception) {
                emit(DataResource.error(e))
            }
        }
}
