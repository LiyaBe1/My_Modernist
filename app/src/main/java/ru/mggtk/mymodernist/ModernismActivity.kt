package ru.mggtk.mymodernist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ModernismActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_modernism)
        val button = findViewById<Button>(R.id.button9)

        button.setOnClickListener{
            val intent = Intent(this@ModernismActivity,NavigationActivity::class.java)
            startActivity(intent)
        }
    }
}