package com.example.videoview

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.MediaController
import android.widget.VideoView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val filelocation = "android.resource://" + packageName + "/raw/"+ R.raw.video
        val display = findViewById<View>(R.id.screen) as VideoView
        display.setVideoURI(Uri.parse(filelocation))
        display.setMediaController(MediaController(this))
        display.start()
    }
}
