package com.ajinkyajape.jetpackcomposemvvm.networking

import com.ajinkyajape.jetpackcomposemvvm.interfaces.ICreditCardServices
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiServiceUtils {
    private const val BASE_URL = "https://random-data-api.com/api/v2/"

    private val retrofit : Retrofit by lazy {
        Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build()
    }


    val iCreditCardServices : ICreditCardServices by lazy {
        retrofit.create(ICreditCardServices::class.java)
    }
}