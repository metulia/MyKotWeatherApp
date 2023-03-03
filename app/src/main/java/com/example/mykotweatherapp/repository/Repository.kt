package com.example.mykotweatherapp.repository

interface Repository {

    fun getWeatherFromServer(): Weather
    fun getWeatherFromLocalStorage(): Weather
}