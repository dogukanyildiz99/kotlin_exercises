package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Our roll button in the layout of our program
        val rollButton: Button = findViewById(R.id.button)
        //We add a listener to check the interection
        rollButton.setOnClickListener {
           rollDice()
        }
    }
    
//Our roll function
    private fun rollDice() {
        //We create a dice with 6 sides
        val dice = Dice(6)
        //Calling the roll function
        val diceRoll = dice.roll()
        //Getting the textView
        val resultTextView: TextView = findViewById(R.id.textView2)
        //Result of the roll function is an integer so we use toString() method to convert it to a string 
        resultTextView.text = diceRoll.toString()
    }
}

//Our dice class
class Dice(private val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}
//To see the output please check the issues section
