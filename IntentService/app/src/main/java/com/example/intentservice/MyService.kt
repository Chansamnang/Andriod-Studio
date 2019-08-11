package com.example.intentservice

import android.app.IntentService
import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.widget.Toast

class MyService : IntentService("Daemon..") { //using intent service to run many thread as we want
                                                    //using service can run only single thread
    override fun onHandleIntent(p0: Intent?) {
        Toast.makeText(this,"Start Service",Toast.LENGTH_LONG).show()
        Thread.sleep(3000)
        Toast.makeText(this,"Task Over",Toast.LENGTH_LONG).show()
    }

//    override fun onBind(p0: Intent?): IBinder? {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//    }
//
//    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
//        Toast.makeText(this,"Service Started",Toast.LENGTH_LONG).show()
//        Thread.sleep(10000)
//        Toast.makeText(this,"Task Over",Toast.LENGTH_LONG).show()
//        return super.onStartCommand(intent, flags, startId)
//    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this,"Service Killed",Toast.LENGTH_LONG).show()
    }
}
