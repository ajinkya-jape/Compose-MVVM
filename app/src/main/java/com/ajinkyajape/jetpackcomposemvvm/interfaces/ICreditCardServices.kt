package com.ajinkyajape.jetpackcomposemvvm.interfaces

import com.ajinkyajape.jetpackcomposemvvm.mvvm.model.CreditCardResponse
import retrofit2.http.GET

interface ICreditCardServices {

    @GET("credit_cards")
    suspend fun getCreditCardDetails() : CreditCardResponse

}