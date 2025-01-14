package com.ajinkyajape.countermvvm.mvvm.model

/**
 * Created by Ajinkya Jape on 14/01/25.
 */

data class CounterModel(var iCount: Int)

class CounterRepository(){
    private var _counterModel = CounterModel(0)

    fun incrementCounter(){
        _counterModel.iCount++
    }

    fun decrementCounter(){
        _counterModel.iCount--
    }

    fun getCounter() = _counterModel

}