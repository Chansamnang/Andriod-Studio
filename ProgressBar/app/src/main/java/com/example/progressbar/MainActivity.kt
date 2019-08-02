package com.example.progressbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener{

            // Variable to hold progress status
            var progressStatus = 0

            // Initialize a new Handler instance
            val handler: Handler = Handler()

            // Start the lengthy operation in a background thread
            Thread(Runnable {
                while (progressStatus < 100) {
                    // Update the progress status
                    progressStatus += 1

                    // Try to sleep the thread for 50 milliseconds
                    try {
                        Thread.sleep(50)
                    } catch (e: InterruptedException) {
                        e.printStackTrace()
                    }

                    // Update the progress bar
                    handler.post(Runnable {
                        progress_bar.progress = progressStatus

                        // Show the progress on text view
                        text_view.text = progressStatus.toString()
                    })
                }
            }).start() // Start the operation
        }
    }
}
