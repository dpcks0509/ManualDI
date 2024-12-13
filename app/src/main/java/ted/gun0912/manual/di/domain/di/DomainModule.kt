package ted.gun0912.manual.di.domain.di

import org.koin.core.module.dsl.bind
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module
import ted.gun0912.manual.di.domain.GetMovieListUseCase
import ted.gun0912.manual.di.domain.GetMovieListUseCaseImpl
import ted.gun0912.manual.di.domain.GetMovieUseCase
import ted.gun0912.manual.di.domain.GetMovieUseCaseImpl

val DomainModule = module {
//    single<GetMovieListUseCase> {
//        GetMovieListUseCaseImpl(get())
//    }
//
//    single<GetMovieUseCase> {
//        GetMovieUseCaseImpl(get())
//    }

    singleOf(::GetMovieListUseCaseImpl) { bind<GetMovieListUseCase>() }

    singleOf(::GetMovieUseCaseImpl) { bind<GetMovieUseCase>() }
}
