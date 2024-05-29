package com.ajinkyajape.jetpackcomposemvvm.mvvm.repository

import com.ajinkyajape.jetpackcomposemvvm.mvvm.model.EmployessResponse
import com.ajinkyajape.jetpackcomposemvvm.networking.ApiServiceUtils

class CreditCardDataRepository {
    private val iCreditCardServices = ApiServiceUtils.iCreditCardServices

    suspend fun getEmployeeDetails() : EmployessResponse {
        return iCreditCardServices.getEmployeeDetails()
    }
}