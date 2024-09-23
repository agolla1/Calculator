package com.cs407.calculator

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val result = intent.getStringExtra("result_key")

        val tvResult = findViewById<TextView>(R.id.tvResult)
        tvResult.text = "Result: $result"
    }
}
