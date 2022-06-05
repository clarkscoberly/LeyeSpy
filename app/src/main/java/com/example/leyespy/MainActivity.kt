package com.example.leyespy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import android.content.Intent




class MainActivity : AppCompatActivity() {

    // private lateinit var temp_input : EditText (lateinit tells kotlin to give you a break that you are going to initalize the variable later.
    private lateinit var inputCode :  TextView
    private lateinit var getCode : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // R = resources
        // R.layout. == the path to activity_main
        setContentView(R.layout.activity_main)
        // These return objects when you give them the ID
        val enterRoomButton = findViewById<Button>(R.id.enter_room_button)

        inputCode = findViewById<EditText>(R.id.enter_room_code_space)
        getCode = findViewById<Button>(R.id.create_room_button)

        enterRoomButton.setOnClickListener { enterRoom() }
    }

    private fun enterRoom() {
        Toast.makeText(this, "Successful Code", Toast.LENGTH_SHORT).show()
        val switchActivityIntent = Intent(this, room::class.java)
        startActivity(switchActivityIntent)
        // if (inputCode = validCode)
    }

    private fun createRoom() {
        // Give code to user on new screen with a start button which takes to a new activity
        // getCode = random sequence grabbed and password given that can now be put in the inputCode section

    }

}