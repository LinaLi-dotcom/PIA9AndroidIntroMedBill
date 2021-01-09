package com.example.pia9intromedbill

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toptext: TextView = findViewById<TextView>(R.id.theTopText)

        toptext.text = "Hejsan hej!!! "

        val topbutton = findViewById<Button>(R.id.theTopButton)

        topbutton.setOnClickListener {
            toptext.text = "Nu händer det!!! "
        }
    }
}