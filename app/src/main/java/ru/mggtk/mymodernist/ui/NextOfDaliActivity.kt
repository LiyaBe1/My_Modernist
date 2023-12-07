package ru.mggtk.mymodernist.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import ru.mggtk.mymodernist.Dali
import ru.mggtk.mymodernist.Leo
import ru.mggtk.mymodernist.R

class NextOfDaliActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next_of_dali)
        val button = findViewById<Button>(R.id.button8)

        button.setOnClickListener{
            val intent = Intent(this, Dali::class.java)
            startActivity(intent)
        }
    }
}