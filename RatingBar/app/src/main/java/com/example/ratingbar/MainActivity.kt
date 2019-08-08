package com.example.ratingbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RatingBar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),RatingBar.OnRatingBarChangeListener {
    override fun onRatingChanged(p0: RatingBar?, p1: Float, p2: Boolean) {
        textView.text = "$p1"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ratingBar1.onRatingBarChangeListener = this
    }
}
