package com.example.dice

import android.icu.text.CollationKey
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.widget.Toolbar
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val Button = findViewById<Button>(R.id.rollButton)
        rollButton.setOnClickListener{
            rollDice()
        }
    }
    private fun rollDice(){
        val randomInt: Int = Random().nextInt(6) + 1
        val drawableResource = when (randomInt){
            1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            else->R.drawable.dice_6
        }
        val diceImage = findViewById<ImageView>(R.id.Dice_Image)
        diceImage.setImageResource(drawableResource)

    }
}
