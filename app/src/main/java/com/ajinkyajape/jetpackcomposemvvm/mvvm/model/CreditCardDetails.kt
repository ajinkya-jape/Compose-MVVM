package com.ajinkyajape.jetpackcomposemvvm.mvvm.model

data class CreditCardDetails(
    val id: String,
    val bank: String,
    val number: String,
    val cvv: String,
    val type: String
)