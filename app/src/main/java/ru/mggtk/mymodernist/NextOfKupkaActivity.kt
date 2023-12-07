package ru.mggtk.mymodernist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class NextOfKupkaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next_of_kupka)
        val button = findViewById<Button>(R.id.button6)

        button.setOnClickListener{
            val intent = Intent(this, Kupka::class.java)
            startActivity(intent)
        }
    }
}