package com.example.testgest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.GestureDetector
import android.view.MotionEvent
import android.widget.Toast
import androidx.core.view.GestureDetectorCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {

    var gDetector: GestureDetectorCompat? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.gDetector = GestureDetectorCompat(this, this)
        gDetector?.setOnDoubleTapListener(this)
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        this.gDetector?.onTouchEvent(event)
        return super.onTouchEvent(event)
    }

    override fun onDown(e: MotionEvent?): Boolean {
        getGestureText.text = "onDown"
        Toast.makeText(applicationContext, "You moved your mouse downward.", Toast.LENGTH_SHORT)
            .show()
        return true
    }

    override fun onShowPress(e: MotionEvent?) {
        getGestureText.text = "onShowPress"
        Toast.makeText(applicationContext, "You pressed your mouse button.", Toast.LENGTH_SHORT)
            .show()
    }

    override fun onSingleTapUp(e: MotionEvent?): Boolean {
        getGestureText.text = "onSingleTapUp"
        Toast.makeText(applicationContext, "You made a single tap going up.", Toast.LENGTH_SHORT)
            .show()
        return true
    }

    override fun onScroll(
        e1: MotionEvent?,
        e2: MotionEvent?,
        distanceX: Float,
        distanceY: Float
    ): Boolean {
        getGestureText.text = "onScroll"
        Toast.makeText(applicationContext, "You scrolled up on your mouse.", Toast.LENGTH_SHORT)
            .show()
        return true
    }

    override fun onLongPress(e: MotionEvent?) {
        getGestureText.text = "onLongPress"
        Toast.makeText(applicationContext, "You pressed a long time on your mouse button.", Toast.LENGTH_SHORT)
            .show()
    }

    override fun onFling(
        e1: MotionEvent?,
        e2: MotionEvent?,
        velocityX: Float,
        velocityY: Float
    ): Boolean {
        getGestureText.text = "onFling"
        Toast.makeText(applicationContext, "You did a flinge with your mouse movement.", Toast.LENGTH_SHORT)
            .show()
        return true
    }

    override fun onSingleTapConfirmed(e: MotionEvent?): Boolean {
        getGestureText.text = "onSingleTapConfirmed"
        Toast.makeText(applicationContext, "That was a single tap with you mouse.", Toast.LENGTH_SHORT)
            .show()
        return true
    }

    override fun onDoubleTap(e: MotionEvent?): Boolean {
        getGestureText.text = "onDoubleTap"
        Toast.makeText(applicationContext, "You did a double tap with your mouse.", Toast.LENGTH_SHORT)
            .show()
        return true
    }

    override fun onDoubleTapEvent(e: MotionEvent?): Boolean {
        getGestureText.text = "onDoubleTapEvent"
        Toast.makeText(applicationContext, "This is called a double tap event with your mouse.", Toast.LENGTH_SHORT)
            .show()
        return true
    }
}