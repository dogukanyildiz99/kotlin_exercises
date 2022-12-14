package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            /*
            This one pops up a message to the screen
            Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT).show() 
            */
            val resultTextView: TextView = findViewById(R.id.textView2)
            resultTextView.text = "6"
        }
    }
}
