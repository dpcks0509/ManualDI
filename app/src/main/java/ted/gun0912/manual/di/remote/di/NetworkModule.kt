package ted.gun0912.manual.di.remote.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import ted.gun0912.manual.di.remote.ApiService
import ted.gun0912.manual.di.remote.createApiService
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Provides
    @Singleton
    fun apiService(): ApiService = createApiService()
}