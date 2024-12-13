package ted.gun0912.manual.di.data.di

import org.koin.core.module.dsl.bind
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module
import ted.gun0912.manual.di.data.MovieRepositoryImpl
import ted.gun0912.manual.di.domain.MovieRepository

val DataModule = module {
//    single<MovieRepository> { MovieRepositoryImpl(get()) }

    singleOf(::MovieRepositoryImpl) { bind<MovieRepository>() }
}