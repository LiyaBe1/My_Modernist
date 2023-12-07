package ru.mggtk.mymodernist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class NextOfClimtActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next_of_climt)

        val button = findViewById<Button>(R.id.button4)

        button.setOnClickListener{
            val intent = Intent(this, Climt::class.java)
            startActivity(intent)
        }
    }
}