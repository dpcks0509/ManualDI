package ted.gun0912.manual.di.remote.di

import org.koin.core.module.dsl.bind
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module
import ted.gun0912.manual.di.data.MovieRemoteDataSource
import ted.gun0912.manual.di.remote.ApiService
import ted.gun0912.manual.di.remote.MovieRemoteDataSourceImpl
import ted.gun0912.manual.di.remote.createApiService

val RemoteModule = module {
//    single<ApiService> { createApiService() }
//
//    single<MovieRemoteDataSource> { MovieRemoteDataSourceImpl(get()) }

    singleOf(::createApiService) { bind<ApiService>() }

    singleOf(::MovieRemoteDataSourceImpl) { bind<MovieRemoteDataSource>() }
}