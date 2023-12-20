package com.example.freecode

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sencond)
        var userName=intent.getStringExtra("USER")
        val textView=findViewById<TextView>(R.id.tvOffer)
        val message="$userName,you will get free to all the content for one month"
        textView.text=message
    }
}