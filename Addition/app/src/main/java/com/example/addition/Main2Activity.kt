package com.example.addition

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val num1 = intent.getStringExtra("number1")
        val num2 = intent.getStringExtra("number2")
        Res.setOnClickListener {
            var i = Intent()
            var res = num1.toInt() + num2.toInt()
            i.putExtra("Result",res.toString())
            setResult(Activity.RESULT_OK,i)
            finish()
        }
    }
}
