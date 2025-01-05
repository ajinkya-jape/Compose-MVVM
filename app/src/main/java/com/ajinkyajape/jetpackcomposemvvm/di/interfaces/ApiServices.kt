package com.ajinkyajape.jetpackcomposemvvm.di.interfaces

import com.ajinkyajape.jetpackcomposemvvm.mvvm.model.MovieModel
import retrofit2.http.GET

interface ApiServices {
    @GET("movies")
    suspend fun getMovieRecords() : List<MovieModel>
}