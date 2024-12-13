package ted.gun0912.manual.di.remote

import retrofit2.http.GET
import ted.gun0912.manual.di.remote.model.MovieResponse
import ted.gun0912.manual.di.remote.model.MovieWrapperResponse

interface ApiService {
    @GET("discover/movie?&sort_by=popularity.desc&language=KO&region=KR")
    suspend fun getMovies(): MovieWrapperResponse

    @GET("movie/{movie_id}")
    suspend fun getMovie(movieId: Int): MovieResponse
}
