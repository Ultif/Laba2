package com.example.simplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Result : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)



        val result_value = intent.getIntExtra("Value", Int.MIN_VALUE)
        val result:TextView = findViewById(R.id.result_number)

        if (result_value == Int.MIN_VALUE) {
            result.text = "Немає відповіді!"
        return
        }
        result.text = result_value.toString()



    }
}