package fredericosabino.android.sample.data.di

import dagger.Module
import dagger.Provides
import fredericosabino.android.sample.data.remote.ApiKeyInterceptor
import fredericosabino.android.sample.data.remote.TheMovieDatabaseService
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

@Module
object NetworkModule {
    @Provides
    @JvmStatic
    fun providesTheMovieDatabaseService(retrofit: Retrofit): TheMovieDatabaseService =
        retrofit.create(TheMovieDatabaseService::class.java)

    @Provides
    @JvmStatic
    fun providesRetrofit(okHttpClient: OkHttpClient): Retrofit =
        Retrofit.Builder()
            .client(okHttpClient)
            .addConverterFactory(MoshiConverterFactory.create())
            .baseUrl(TheMovieDatabaseService.BASE_URL)
            .build()


    @Provides
    @JvmStatic
    fun providesOkHttpClient(apiKeyInterceptor: ApiKeyInterceptor): OkHttpClient =
        OkHttpClient.Builder()
            .addNetworkInterceptor(apiKeyInterceptor)
            .build()
}
