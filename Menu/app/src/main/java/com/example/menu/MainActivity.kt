package com.example.menu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.my_menu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.option1 -> {
                var intent = Intent(this,Pizza::class.java)
                startActivity(intent)
                Toast.makeText(this,"You selected Pizza",Toast.LENGTH_LONG).show()
            }
            R.id.option2 -> {
                var intent = Intent(this,Burger::class.java)
                startActivity(intent)
                Toast.makeText(this,"You selected Burger",Toast.LENGTH_LONG).show()
            }
            R.id.option3 -> {
                var intent = Intent(this,Salad::class.java)
                startActivity(intent)
                Toast.makeText(this,"U selected Salad",Toast.LENGTH_LONG).show()
            }
            R.id.option4 -> {
                var intent = Intent(this,Cheese::class.java)
                startActivity(intent)
                Toast.makeText(this,"U selected Cheese",Toast.LENGTH_LONG).show()
        }

        }
        return super.onOptionsItemSelected(item)
    }
}
