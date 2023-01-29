package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.os.SystemClock
import android.view.View
import android.widget.*
import com.example.myapplication.databinding.ActivityMainBinding
import org.w3c.dom.Text
import kotlin.math.pow
import kotlin.math.sqrt

class MainActivity : AppCompatActivity() {
    lateinit var bindingClass : ActivityMainBinding


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)


        bindingClass.btn.setOnClickListener {

           val height = bindingClass.ed1.text.toString().toDouble()
           val weight = bindingClass.ed.text.toString().toDouble()
           val a = 100
           val x = height / a
           val result = weight / (x.pow(2))

            if (result <= 18.5) {
                bindingClass.tvRes.text = "Дефицит массы тела"
            }
            else if (result <= 24.9) {
                bindingClass.tvRes.text = "Нормальная масса тела"
            }
            else if (result <= 29.9) {
                bindingClass.tvRes.text = "Избыточная масса тела"
            }
            else if (result <= 34.9) {
                bindingClass.tvRes.text = "Ожирение 1 степени"
            }
            else if (result <= 39.9) {
                bindingClass.tvRes.text = "Ожирение 2 степени"
            }
            else {
                bindingClass.tvRes.text = "Ожирение 3 степени"
            }

        }

    }

}
