package com.example.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Time: AppCompatActivity() {


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.time)


            val textView = TextView(this)
            textView.setTextSize(20F)
            textView.setPadding(16, 16, 16, 16)
            textView.setText("Time")
            setContentView(textView)
        }

}