package ted.gun0912.manual.di.domain.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import ted.gun0912.manual.di.domain.GetMovieListUseCase
import ted.gun0912.manual.di.domain.GetMovieListUseCaseImpl
import ted.gun0912.manual.di.domain.GetMovieUseCase
import ted.gun0912.manual.di.domain.GetMovieUseCaseImpl
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
interface DomainModule {
    @Binds
    @Singleton
    fun getMovieListUseCase(getMovieListUseCaseImpl: GetMovieListUseCaseImpl): GetMovieListUseCase

    @Binds
    @Singleton
    fun getMovieUseCase(getMovieUseCaseImpl: GetMovieUseCaseImpl): GetMovieUseCase
}
