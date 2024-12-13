package ted.gun0912.manual.di.remote.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import ted.gun0912.manual.di.data.MovieRemoteDataSource
import ted.gun0912.manual.di.remote.MovieRemoteDataSourceImpl
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
interface RemoteModule {

    @Binds
    @Singleton
    fun movieRemoteDataSource(movieRemoteDataSourceImpl: MovieRemoteDataSourceImpl): MovieRemoteDataSource
}
