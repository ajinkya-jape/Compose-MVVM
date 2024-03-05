package com.ajinkyajape.jetpackcomposemvvm.mvvm.repository

import com.ajinkyajape.jetpackcomposemvvm.mvvm.model.CreditCardResponse
import com.ajinkyajape.jetpackcomposemvvm.networking.ApiServiceUtils

class CreditCardDataRepository {
    private val iCreditCardServices = ApiServiceUtils.iCreditCardServices

    suspend fun getCreditCardDetails() : CreditCardResponse {
        return iCreditCardServices.getCreditCardDetails()
    }
}