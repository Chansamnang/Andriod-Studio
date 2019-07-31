package com.example.seekbardemo

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.SeekBar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        seekBar1.max = 255
        seekBar2.max = 255
        seekBar3.max = 255
        seekBar4.max = 255
        class CommonLisenter: SeekBar.OnSeekBarChangeListener{
            var col1 = 0
            var col2 = 0
            var col3 = 0
            var col4 = 0
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                when(p0?.id) {
                    R.id.seekBar1 -> {
                        col1 = p1
                    }
                    R.id.seekBar2 -> {
                        col2 = p1
                    }
                    R.id.seekBar3 -> {
                        col3 = p1
                    }
                    R.id.seekBar4 -> {
                        col4 = p1
                    }
                }
                var myCol = Color.argb(col1,col2,col3,col4)
                background.setBackgroundColor(myCol)
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {}
            override fun onStopTrackingTouch(p0: SeekBar?) {}
        }
        var commonLisenter = CommonLisenter()
        seekBar1.setOnSeekBarChangeListener(commonLisenter)
        seekBar2.setOnSeekBarChangeListener(commonLisenter)
        seekBar3.setOnSeekBarChangeListener(commonLisenter)
        seekBar4.setOnSeekBarChangeListener(commonLisenter)
    }
}
