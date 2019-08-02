package com.example.switchdemo

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        layoutMode.setBackgroundColor(Color.LTGRAY)
        themeSwitch.setOnCheckedChangeListener{ _, isChecked ->
            if(isChecked){
                mode.text = "Dark Mode"
                mode.setTextColor(Color.LTGRAY)
                themeSwitch.setTextColor(Color.LTGRAY)
                layoutMode.setBackgroundColor(Color.BLACK)
            }else {
                mode.text = "Light Mode"
                mode.setTextColor(Color.BLACK)
                themeSwitch.setTextColor(Color.BLACK)
                layoutMode.setBackgroundColor(Color.LTGRAY)
            }
        }
    }
}
