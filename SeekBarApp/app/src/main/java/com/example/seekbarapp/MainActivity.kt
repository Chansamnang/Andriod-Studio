package com.example.seekbarapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        seekBar.max = 500

        seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                level.text = "Current Posistion is : $p1"
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {
                level.text = "Started at ${p0?.progress}"
            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
                level.text = "Stoped at ${p0?.progress}"
            }

        })
    }
}

