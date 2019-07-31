package com.example.seekbarex

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.SeekBar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        al.max = 255
        red.max = 255
        green.max = 255
        blue.max = 255
    }
    fun onClick(v:View)
    {
        class CommonListener :SeekBar.OnSeekBarChangeListener{
            var alpha = 0
            var Red = 0
            var Green = 0
            var Blue = 0
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                when(p0?.id){
                    R.id.al -> {
                        alpha = p1
                    }
                    R.id.red -> {
                        Red = p1
                    }
                    R.id.green -> {
                        Green = p1
                    }
                    R.id.blue -> {
                        Blue = p1
                    }
                }
                var myCol = Color.argb(alpha,Red,Green,Blue)
                when(v.id){
                    R.id.button -> {
                        button.setBackgroundColor(myCol)
                    }
                    R.id.button2 -> {
                        button2.setBackgroundColor(myCol)
                    }
                }
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {}

            override fun onStopTrackingTouch(p0: SeekBar?) {}


        }
        var k = CommonListener()
        al.setOnSeekBarChangeListener(k)
        red.setOnSeekBarChangeListener(k)
        green.setOnSeekBarChangeListener(k)
        blue.setOnSeekBarChangeListener(k)
    }
}
