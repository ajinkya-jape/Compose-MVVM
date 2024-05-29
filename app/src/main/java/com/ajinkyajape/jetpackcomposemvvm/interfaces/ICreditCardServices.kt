package com.ajinkyajape.jetpackcomposemvvm.interfaces

import com.ajinkyajape.jetpackcomposemvvm.mvvm.model.EmployessResponse
import retrofit2.http.GET

interface ICreditCardServices {

    @GET("employees")
    suspend fun getEmployeeDetails() : EmployessResponse

}