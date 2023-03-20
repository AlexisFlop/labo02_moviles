package com.avsc.labo2_alexisflop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    //UI ELEMENTS
    private lateinit var weightEditText: EditText
    private lateinit var heightEditText: EditText
    private lateinit var calculateBtn: Button
    private lateinit var bmiResultText: TextView
    private lateinit var bmiStatusText: TextView
    private lateinit var bmiRangeText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bind()
        addListener()

    }

    private fun bind() {
        weightEditText = findViewById(R.id.weight_edit_text)
        heightEditText = findViewById(R.id.height_edit_text)
        calculateBtn = findViewById(R.id.calculate_button)
        bmiResultText = findViewById(R.id.bmi_result_textview)
        bmiStatusText = findViewById(R.id.bmi_status_textview)
        bmiRangeText = findViewById(R.id.bmi_range_textview)
    }

    private fun addListener() {
        calculateBtn.setOnClickListener {
            if (weightEditText.text != null && heightEditText.text != null) {
                val weight = weightEditText.text.toString().toFloat()
                val height = heightEditText.text.toString().toInt()

                var bmi = weight/(height*height)
                bmiResultText.text = bmi.toString()
            }
        }
    }
}