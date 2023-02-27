package com.example.mykotweatherapp

import android.os.Bundle
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
    }
}