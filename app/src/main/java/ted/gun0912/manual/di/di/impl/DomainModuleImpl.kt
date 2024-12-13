package ted.gun0912.manual.di.di.impl

import ted.gun0912.manual.di.ManualDiApplication.Companion.appModule
import ted.gun0912.manual.di.di.DomainModule
import ted.gun0912.manual.di.domain.GetMovieListUseCase
import ted.gun0912.manual.di.domain.GetMovieListUseCaseImpl
import ted.gun0912.manual.di.domain.GetMovieUseCase
import ted.gun0912.manual.di.domain.GetMovieUseCaseImpl

class DomainModuleImpl : DomainModule {
    override val getMovieListUseCase: GetMovieListUseCase by lazy {
        with(appModule) { GetMovieListUseCaseImpl(movieRepository) }
    }

    override val getMovieUseCase: GetMovieUseCase by lazy {
        with(appModule) { GetMovieUseCaseImpl(movieRepository) }
    }
}
