package ru.mggtk.mymodernist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class NextOfLeoActivity : AppCompatActivity() {
    lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next_of_leo)

        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener{
            val intent = Intent(this, Leo::class.java)
            startActivity(intent)
        }
    }
}