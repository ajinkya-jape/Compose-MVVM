package com.ajinkyajape.countermvvm.mvvm.viewmodel

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.compose.viewModel
import com.ajinkyajape.countermvvm.mvvm.model.CounterRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch

/**
 * Created by Ajinkya Jape on 14/01/25.
 */
class CounterViewModel() : ViewModel() {
    private val _counterRepo: CounterRepository = CounterRepository()

    private val _count = mutableStateOf(_counterRepo.getCounter().iCount)

    val countValue: MutableState<Int> = _count

    fun incrementCounter() {
        viewModelScope.launch {
            _counterRepo.incrementCounter()
            _count.value = _counterRepo.getCounter().iCount
        }
    }

    fun decrementCounter() {
        if (_counterRepo.getCounter().iCount == 0) return

        viewModelScope.launch {
            _counterRepo.decrementCounter()
            _count.value = _counterRepo.getCounter().iCount
        }

    }


}