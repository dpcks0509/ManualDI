package ted.gun0912.manual.di.presentation.di

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.core.module.dsl.bind
import org.koin.dsl.module
import ted.gun0912.manual.di.presentation.MovieViewModel

val PresentationModule = module {
//    viewModel<MovieViewModel> { MovieViewModel(get(), get()) }

    viewModelOf(::MovieViewModel) { bind<MovieViewModel>() }
}