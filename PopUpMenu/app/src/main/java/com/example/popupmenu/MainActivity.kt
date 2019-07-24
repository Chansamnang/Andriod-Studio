package com.example.popupmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.PopupMenu
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener {
            var popup = PopupMenu(this,it)
            popup.inflate(R.menu.my_menu)
            popup.show()
            popup.setOnMenuItemClickListener { menuItem ->
                when(menuItem.itemId){
                    R.id.op1 -> {
                        Toast.makeText(this,"Option1",Toast.LENGTH_SHORT).show()
                        true
                    }
                    R.id.op2 -> {
                        Toast.makeText(this,"Option2",Toast.LENGTH_SHORT).show()
                        true
                    }
                    R.id.op3 -> {
                        Toast.makeText(this,"Option3",Toast.LENGTH_SHORT).show()
                        true
                    }
                    else -> false
                }
            }
        }
    }
}
