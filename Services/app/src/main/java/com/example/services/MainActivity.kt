package com.example.services

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun demo(v:View){
        var i = Intent(this,MyMusicService::class.java)
        when(v.id){
            R.id.start -> {
                startService(i)
            }
            R.id.stop -> {
                stopService(i)
            }
            R.id.startNew -> {
                startActivity(Intent(this,Main2Activity::class.java))
            }
        }
    }
}
