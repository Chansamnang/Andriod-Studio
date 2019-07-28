package com.example.gesturedetector

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.GestureDetector
import android.view.MotionEvent
import androidx.core.view.GestureDetectorCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), GestureDetector.OnGestureListener,GestureDetector.OnDoubleTapListener {
    var gdc:GestureDetectorCompat? = null
    override fun onShowPress(p0: MotionEvent?) {
       tv.text = "Show Press...."
        page.setBackgroundColor(Color.BLUE)
    }

    override fun onSingleTapUp(p0: MotionEvent?): Boolean {
        tv.text = "Tap Up..."
        page.setBackgroundColor(Color.GREEN)
        return true
    }

    override fun onDown(p0: MotionEvent?): Boolean {
        tv.text = "Key Down...."
        page.setBackgroundColor(Color.YELLOW)
        return true
    }

    override fun onFling(p0: MotionEvent?, p1: MotionEvent?, p2: Float, p3: Float): Boolean {
        tv.text = "Flinging..."
        page.setBackgroundColor(Color.GRAY)
        return true
    }

    override fun onScroll(p0: MotionEvent?, p1: MotionEvent?, p2: Float, p3: Float): Boolean {
        tv.text = "Scrolling..."
        page.setBackgroundColor(Color.DKGRAY)
        return true
    }

    override fun onLongPress(p0: MotionEvent?) {
        tv.text = "Long Pres..."
        page.setBackgroundColor(Color.GREEN)
    }

    override fun onDoubleTap(p0: MotionEvent?): Boolean {
        return true
    }

    override fun onDoubleTapEvent(p0: MotionEvent?): Boolean {
        tv.text = "Double Tap..."
        page.setBackgroundColor(Color.TRANSPARENT)
        return true
    }

    override fun onSingleTapConfirmed(p0: MotionEvent?): Boolean {
        return true
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        gdc?.onTouchEvent(event)
        return super.onTouchEvent(event)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gdc = GestureDetectorCompat(this,this)
        gdc?.setOnDoubleTapListener(this)
    }
}
