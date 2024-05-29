package com.ajinkyajape.jetpackcomposemvvm.mvvm.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ajinkyajape.jetpackcomposemvvm.mvvm.repository.CreditCardDataRepository
import com.ajinkyajape.jetpackcomposemvvm.mvvm.model.EmployessResponse
import kotlinx.coroutines.launch
import java.lang.Exception

class CreditCardsViewModel : ViewModel() {
    private val creditCardDataRepository = CreditCardDataRepository()

    val creditCardDataList = MutableLiveData<EmployessResponse>()

    fun getCreditCards(){
        viewModelScope.launch {

            try{
                val cards = creditCardDataRepository.getEmployeeDetails()
                creditCardDataList.value = cards
            }catch (ex: Exception){
                // Handle error
                Log.e("getCreditCards", ex.message.toString());
            }
        }
    }
}