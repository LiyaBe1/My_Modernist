package ru.mggtk.mymodernist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class NextOfAmilioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next_of_amilio)
        val button = findViewById<Button>(R.id.button5)

        button.setOnClickListener{
            val intent = Intent(this, Amilio::class.java)
            startActivity(intent)
        }
    }
}