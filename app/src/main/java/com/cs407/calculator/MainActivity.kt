package com.cs407.calculator

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etFirstNumber = findViewById<EditText>(R.id.etFirstNumber)
        val etSecondNumber = findViewById<EditText>(R.id.etSecondNumber)

        val btnAdd = findViewById<Button>(R.id.btnAdd)
        val btnSubtract = findViewById<Button>(R.id.btnSubtract)
        val btnMultiply = findViewById<Button>(R.id.btnMultiply)
        val btnDivide = findViewById<Button>(R.id.btnDivide)

        fun sendResultToNewPage(result: String) {
            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("result_key", result)
            startActivity(intent)
        }

        // Button for Addition
        btnAdd.setOnClickListener {
            val num1 = etFirstNumber.text.toString().toIntOrNull()
            val num2 = etSecondNumber.text.toString().toIntOrNull()
            if (num1 != null && num2 != null) {
                val result = num1 + num2
                sendResultToNewPage(result.toString())
            } else {
                showToast("Please enter valid numbers")
            }
        }

        btnSubtract.setOnClickListener {
            val num1 = etFirstNumber.text.toString().toIntOrNull()
            val num2 = etSecondNumber.text.toString().toIntOrNull()
            if (num1 != null && num2 != null) {
                val result = num1 - num2
                sendResultToNewPage(result.toString())
            } else {
                showToast("Please enter valid numbers")
            }
        }

        btnMultiply.setOnClickListener {
            val num1 = etFirstNumber.text.toString().toIntOrNull()
            val num2 = etSecondNumber.text.toString().toIntOrNull()
            if (num1 != null && num2 != null) {
                val result = num1 * num2
                sendResultToNewPage(result.toString())
            } else {
                showToast("Please enter valid numbers")
            }
        }

        // Button for Division
        btnDivide.setOnClickListener {
            val num1 = etFirstNumber.text.toString().toIntOrNull()
            val num2 = etSecondNumber.text.toString().toIntOrNull()
            if (num1 != null && num2 != null) {
                if (num2 != 0) {
                    val result = num1 / num2
                    sendResultToNewPage(result.toString())
                } else {
                    showToast("Cannot divide by zero")
                }
            } else {
                showToast("Please enter valid numbers")
            }
        }
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}
