package ru.mggtk.mymodernist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class KandinskyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kandinsky)
        val button = findViewById<Button>(R.id.button10)

        button.setOnClickListener{
            val intent = Intent(this@KandinskyActivity, NavigationActivity::class.java)
            startActivity(intent)
        }
    }
}