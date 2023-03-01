package com.example.mykotweatherapp

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonStart: View = findViewById(R.id.start_button)
        buttonStart.setOnClickListener {
            Toast.makeText(
                this,
                "Начинаем работу приложения",
                Toast.LENGTH_LONG
            ).show();
        }

        val person1: Person = Person("Василий", 25)
        val person2 = Person("Иван", 30)

        val person3 = person2.copy(age = 35)

        Log.d("mylogs", "$person1")
        Log.d("mylogs", "$person2")
        Log.d("mylogs", "$person3")
        Log.d("mylogs", "${DataBase.getTest()}")

        DataBase.getTestCycle()
        repeat(10) {
            Log.d("mylogs", "$it getTestCycle2")
        }
    }
}