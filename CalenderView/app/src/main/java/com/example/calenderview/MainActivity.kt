package com.example.calenderview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val month = arrayOf("January","February","March","April","May","June","July","August","September","October","November","December")
        calendarView.setOnDateChangeListener { calendarView, year, months, day ->
            textView.text = "$day ${month[months]} $year"
        }
    }
}
