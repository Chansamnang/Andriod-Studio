package com.example.checkboxcheck

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var order:String = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        selection.setOnClickListener {
            order=""
            if(pizza.isChecked)
            {
               order = "pizza"
            }
            if(donut.isChecked)
            {
               order+= "\ndonut"
            }
            if(burger.isChecked)
            {
                order+="\nburger"
            }
            Toast.makeText(this,order,Toast.LENGTH_LONG).show()
        }
    }
}
