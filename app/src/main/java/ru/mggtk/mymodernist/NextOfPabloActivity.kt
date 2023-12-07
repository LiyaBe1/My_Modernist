package ru.mggtk.mymodernist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class NextOfPabloActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next_of_pablo)
        val button = findViewById<Button>(R.id.button7)

        button.setOnClickListener{
            val intent = Intent(this, Pablo::class.java)
            startActivity(intent)
        }
    }
}