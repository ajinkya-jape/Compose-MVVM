package com.ajinkyajape.jetpackcomposemvvm.di.domain

import com.ajinkyajape.jetpackcomposemvvm.di.interfaces.ApiServices
import com.ajinkyajape.jetpackcomposemvvm.di.repository.MovieRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    private const val BASE_URL = "https://dummyapi.online/api/"

    @Provides
    fun invokeApiServices(): ApiServices {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiServices::class.java)
    }

    fun invokeMoviesRepo(apiServices: ApiServices): MovieRepository {
        return  MovieRepository(apiServices)
    }

}