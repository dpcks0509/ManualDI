package ted.gun0912.manual.di.di.impl

import ted.gun0912.manual.di.ManualDiApplication.Companion.appModule
import ted.gun0912.manual.di.data.MovieRemoteDataSource
import ted.gun0912.manual.di.di.RemoteModule
import ted.gun0912.manual.di.remote.ApiService
import ted.gun0912.manual.di.remote.MovieRemoteDataSourceImpl
import ted.gun0912.manual.di.remote.createApiService

class RemoteModuleImpl : RemoteModule {

    override val movieRemoteDataSource: MovieRemoteDataSource by lazy {
        with(appModule) { MovieRemoteDataSourceImpl(apiService) }
    }

    override val apiService: ApiService
        get() = createApiService()
}
