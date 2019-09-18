package com.example.sqliteexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //val context = this

        btn_insert.setOnClickListener{
            if (etv1.text.toString().length > 0 && etv2.text.toString().length > 0){
                var user = User(etv1.text.toString(), etv2.text.toString().toInt())
                var db = DataBaseHandler(this)
                db.insertData(user)

            } else{
                Toast.makeText(this,"Please Fill All Data's",Toast.LENGTH_LONG).show()
            }
        }
    }
}
