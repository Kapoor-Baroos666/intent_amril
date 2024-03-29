package com.example.intent_amril

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnNext: Button = findViewById(R.id.btnnext)
        val btnNext2: Button = findViewById(R.id.btnnext2)

        btnNext.setOnClickListener {
            val intent = Intent(this, NextActivity::class.java)
            startActivity(intent)
        }
        btnNext2.setOnClickListener {
            val intent = Intent(this, NextActivity2::class.java)
            startActivity(intent)
        }
    }
}