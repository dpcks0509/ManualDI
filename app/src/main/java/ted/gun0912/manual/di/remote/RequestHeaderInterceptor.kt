package ted.gun0912.manual.di.remote

import okhttp3.Interceptor
import okhttp3.Response
import ted.gun0912.manual.di.BuildConfig
import java.io.IOException

internal class RequestHeaderInterceptor : Interceptor {

    @Throws(IOException::class)
    override fun intercept(chain: Interceptor.Chain): Response {
        val newRequest = try {
            chain.request().newBuilder()
                .apply {
                    addHeader("Authorization", "Bearer ${BuildConfig.API_KEY}")
                }
                .build()
        } catch (exception: Exception) {
            chain.request()
        }

        return chain.proceed(newRequest)
    }

}
