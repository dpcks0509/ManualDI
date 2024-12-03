package ted.gun0912.manual.di.di.impl

import ted.gun0912.manual.di.ManualDiApplication.Companion.appModule
import ted.gun0912.manual.di.data.MovieRepositoryImpl
import ted.gun0912.manual.di.di.DataModule
import ted.gun0912.manual.di.domain.MovieRepository

class DataModuleImpl : DataModule {
    override val movieRepository: MovieRepository by lazy {
        with(appModule) { MovieRepositoryImpl(movieRemoteDataSource) }
    }
}
