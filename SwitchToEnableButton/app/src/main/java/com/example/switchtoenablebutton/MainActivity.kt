package com.example.switchtoenablebutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showToast.isEnabled = false
        switchButton.setOnCheckedChangeListener{ _, Checked ->
            if(Checked){
                showToast.setOnClickListener {
                    Toast.makeText(this,"Button On",Toast.LENGTH_LONG).show()
                }
                showToast.isEnabled = true
            }
            else{
                showToast.isEnabled = false
                showToast.setOnClickListener {
                }
            }
        }
    }
}
