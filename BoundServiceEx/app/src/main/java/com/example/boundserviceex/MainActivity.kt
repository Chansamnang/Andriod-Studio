package com.example.boundserviceex

import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.content.ServiceConnection
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.IBinder
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var obj:MyService? = null
    var sc:ServiceConnection = object : ServiceConnection {
        override fun onServiceDisconnected(p0: ComponentName?) {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun onServiceConnected(p0: ComponentName?, p1: IBinder?) {
            var myBinder:MyService.MyBinder = p1 as MyService.MyBinder
            obj = myBinder.getObject()
        }

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var i = Intent(this,MyService::class.java)
        bindService(i,sc, Context.BIND_AUTO_CREATE)
    }
    fun getObj(v:View){
        textView.text = obj?.getTime()
    }
}
