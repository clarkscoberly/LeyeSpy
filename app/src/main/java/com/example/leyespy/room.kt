package com.example.leyespy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.view.inputmethod.EditorInfo
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class room : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_room)

        val secretButton = findViewById<Button>(R.id.buttonSecret)
        secretButton.setOnClickListener { switchActivities() }
        var textInput = findViewById<EditText>(R.id.textUserInput)
        textInput.setOnEditorActionListener {text, actionId, keyEvent ->
            if (actionId == EditorInfo.IME_ACTION_SEARCH || actionId == EditorInfo.IME_ACTION_DONE ||
                keyEvent == null ||
                keyEvent.keyCode == KeyEvent.KEYCODE_ENTER) {
                //User finished typing
                Toast.makeText(this, "Either you are or know of my creator...... Splendid!", Toast.LENGTH_SHORT).show()

                true
            }
            false
        }

    }



    private fun switchActivities() {
        val switchActivityIntent = Intent(this, MainActivity::class.java)
        startActivity(switchActivityIntent)
    }
}