package com.example.mykotweatherapp

import android.util.Log

object DataBase {
    fun getTest():String{
        return "DataBase_test"
    }

    fun getTestCycle() {
        val list = listOf(1,2,3,4,5)
        for (one in list){
            Log.d("mylogs", "$one getTestCycle")
        }
    }
}