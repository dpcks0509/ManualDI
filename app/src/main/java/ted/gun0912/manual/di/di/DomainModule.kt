package ted.gun0912.manual.di.di

import ted.gun0912.manual.di.domain.GetMovieListUseCase
import ted.gun0912.manual.di.domain.GetMovieUseCase

interface DomainModule {
    val getMovieListUseCase: GetMovieListUseCase

    val getMovieUseCase: GetMovieUseCase
}
