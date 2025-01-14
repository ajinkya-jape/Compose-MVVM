package com.ajinkyajape.jetpackcomposemvvm.mvvm.viewmodel

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.ajinkyajape.jetpackcomposemvvm.mvvm.model.CounterRepository

/**
 * Created by Ajinkya Jape on 14/01/25.
 */
class CounterViewModel():ViewModel() {
    private val _counterRepo : CounterRepository = CounterRepository()

    private val _count = mutableStateOf(_counterRepo.getCounter().iCount)

    val countValue: MutableState<Int> = _count

    fun incrementCounter(){
        _counterRepo.incrementCounter()
        _count.value = _counterRepo.getCounter().iCount
    }

    fun decrementCounter(){
        _counterRepo.decrementCounter()
        _count.value = _counterRepo.getCounter().iCount
    }


}