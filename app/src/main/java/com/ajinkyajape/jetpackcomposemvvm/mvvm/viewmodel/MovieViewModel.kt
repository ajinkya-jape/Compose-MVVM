package com.ajinkyajape.jetpackcomposemvvm.mvvm.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ajinkyajape.jetpackcomposemvvm.di.repository.MovieRepository
import com.ajinkyajape.jetpackcomposemvvm.mvvm.model.MovieModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import java.lang.Exception
import javax.inject.Inject

@HiltViewModel
class MovieViewModel

@Inject constructor(private val dataRepository : MovieRepository) : ViewModel() {
    private val dataList = MutableStateFlow<List<MovieModel>>(emptyList())
    val dataStateFlowList: StateFlow<List<MovieModel>> = dataList

    fun getRecords(){
        viewModelScope.launch {
            try{
                val listRecords =  dataRepository.getRecords()
                dataList.value = listRecords
            }catch (ex: Exception){
                // Handle error
                Log.e("getData", ex.message.toString());
            }
        }
    }
}