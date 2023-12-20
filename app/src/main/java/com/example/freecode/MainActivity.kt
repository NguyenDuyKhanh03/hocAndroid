package com.example.freecode

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.INVISIBLE
import android.view.View.VISIBLE
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val greetingTextView=findViewById<TextView>(R.id.txt_mes)
        val inputField=findViewById<EditText>(R.id.edtTextName)
        val buttonSubmit=findViewById<Button>(R.id.btn_submit)
        val offersButton=findViewById<Button>(R.id.btnOffers)
        var enteredName=""
        buttonSubmit.setOnClickListener {

            enteredName=inputField.text.toString()
            if(enteredName=="")
            {
                offersButton.visibility=INVISIBLE
                greetingTextView.text=""
                Toast.makeText(this@MainActivity,"Please,enter your name!",Toast.LENGTH_SHORT).show()

            }
            else{
                val message="Welcome $enteredName"
                greetingTextView.text=message
                inputField.text.clear()
                offersButton.visibility=VISIBLE
            }

        }
        offersButton.setOnClickListener {
            val intent=Intent(this,SecondActivity::class.java)
            intent.putExtra("USER",enteredName)
            startActivity(intent)
        }
    }

}
