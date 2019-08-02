package com.example.progressbardemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ProgressBar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val progressBar = findViewById<ProgressBar>(R.id.progressBar)
        if(progressBar!=null){
            val btn = findViewById<Button>(R.id.button)
            btn.setOnClickListener{
                val visibility = if(progressBar.visibility == View.GONE) View.VISIBLE else View.GONE
                progressBar.visibility = visibility

                val btnText = if(progressBar.visibility == View.GONE) "Show Progress Bar" else "Hide Progress Bar"
                btn.text = btnText
            }
        }
    }
}
