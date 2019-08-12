package com.example.asynctask

import android.content.Context
import android.os.AsyncTask
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView

class MyTask(context: Context,button: Button,progressBar: ProgressBar,textView: TextView):AsyncTask<Void,Int,String>(){

    lateinit var context: Context
    lateinit var button: Button
    lateinit var progressBar: ProgressBar
    lateinit var textView: TextView

    init {
        this.context = context
        this.button = button
        this.progressBar = progressBar
        this.textView = textView
    }

    override fun onPreExecute() {
        textView.text = "Preparing Download..."
        Thread.sleep(1000)
        button.isEnabled = false
    }
    override fun doInBackground(vararg p0: Void?): String {
        for (i in 1..100 step 1){
            Thread.sleep(80)
            publishProgress(i)
        }
        return "Download Completed..."
    }

    override fun onProgressUpdate(vararg values: Int?) {
        super.onProgressUpdate(*values)
        var progress = values[0]
        progressBar.progress = progress!!
        textView.text = "$progress % Downloaded...."
    }

    override fun onPostExecute(result: String?) {
        super.onPostExecute(result)
        textView.text = result
        button.isEnabled = true
    }

}