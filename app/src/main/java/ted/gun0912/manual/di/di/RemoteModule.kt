package ted.gun0912.manual.di.di

import ted.gun0912.manual.di.data.MovieRemoteDataSource
import ted.gun0912.manual.di.remote.ApiService

interface RemoteModule {

    val apiService: ApiService

    val movieRemoteDataSource: MovieRemoteDataSource
}
