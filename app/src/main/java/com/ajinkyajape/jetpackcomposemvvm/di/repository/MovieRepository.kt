package com.ajinkyajape.jetpackcomposemvvm.di.repository

import com.ajinkyajape.jetpackcomposemvvm.mvvm.model.MovieModel
import com.ajinkyajape.jetpackcomposemvvm.di.interfaces.ApiServices
import javax.inject.Inject

class MovieRepository
@Inject constructor(private val apiServices: ApiServices) {

    suspend fun getRecords() : List<MovieModel> {
        return apiServices.getMovieRecords()
    }
}