package com.example.mykotweatherapp.repository

class RepositoryImpl : Repository {
    override fun getWeatherFromServer(): Weather {
        Thread.sleep(2000L)         // эмуляция сетевого запроса
        return Weather()                  // эмуляция ответа
    }

    override fun getWeatherFromLocalStorage(): Weather {
        Thread.sleep(200L)      // эмуляция запроса локального
        return Weather()             // эмуляция ответа
    }
}