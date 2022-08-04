//Dice roll with images
package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Our roll button in the layout of our program
        val rollButton: Button = findViewById(R.id.button)
        //We add a listener to check the interaction
        rollButton.setOnClickListener { rollDice() }
        // Do a roll dice when application starts
        rollDice()
    }

    //Our roll function
    private fun rollDice() {
        //We create a dice with 6 sides
        val dice = Dice(6)
        //Calling the roll function
        val diceRoll = dice.roll()
        //Getting the ImageView for dice images
        val diceImage: ImageView = findViewById(R.id.imageView)
        val drawableResource = when (diceRoll) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        // Update the ImageView with the correct drawable resource ID
        diceImage.setImageResource(drawableResource)
        // Update the content description
        diceImage.contentDescription = diceRoll.toString()
    }
}

//Our dice class
class Dice(private val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}

