package com.example.textviewclickablelinks

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textsachi : TextView = findViewById(R.id.tv_sachi)
        textsachi.movementMethod = LinkMovementMethod.getInstance()
        textsachi.setTextColor(Color.BLUE)
    }
}