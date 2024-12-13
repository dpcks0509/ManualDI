package ted.gun0912.manual.di.data

interface MovieRemoteDataSource {
    suspend fun getMovies(): List<MovieEntity>

    suspend fun getMovie(movieId: Int): MovieEntity
}
