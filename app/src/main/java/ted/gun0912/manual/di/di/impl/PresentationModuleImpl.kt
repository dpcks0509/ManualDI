package ted.gun0912.manual.di.di.impl

import ted.gun0912.manual.di.ManualDiApplication.Companion.appModule
import ted.gun0912.manual.di.di.PresentationModule
import ted.gun0912.manual.di.presentation.MovieViewModel

class PresentationModuleImpl : PresentationModule {
    override val movieViewModel: MovieViewModel by lazy {
        with(appModule) { MovieViewModel(getMovieListUseCase, getMovieUseCase) }
    }
}
