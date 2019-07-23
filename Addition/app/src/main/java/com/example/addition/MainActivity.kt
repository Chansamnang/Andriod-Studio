package com.example.addition

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    Click.setOnClickListener {
        val number1 = num1.text.toString()
        val number2 = num2.text.toString()
        var intent = Intent(this,Main2Activity::class.java)
        intent.putExtra("number1",number1)
        intent.putExtra("number2",number2)
        startActivityForResult(intent,2)
    }
    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode == 2){
            var str:String? = data?.getStringExtra("Result")
            Show.text = "The Addition is $str"
        }
    }
}
