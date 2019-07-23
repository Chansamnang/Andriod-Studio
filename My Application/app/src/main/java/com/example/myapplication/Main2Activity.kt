package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
//        var user = intent.getStringExtra("name")
//        var sch = intent.getStringExtra("school")
        var bundle = intent.extras
        details.text = "User ${bundle?.get("name")} and school ${bundle?.get("school")}"
    }
}
