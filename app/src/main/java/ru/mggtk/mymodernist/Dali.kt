package ru.mggtk.mymodernist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import ru.mggtk.mymodernist.ui.NextOfDaliActivity
import ru.mggtk.mymodernist.ui.home.HomeFragment

class Dali : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dali)

        val textView = findViewById<TextView>(R.id.textView29)

        textView.setOnClickListener {
            val intent = Intent(this, NextOfDaliActivity::class.java)
            startActivity(intent)
        }

        val button = findViewById<Button>(R.id.button3)

        button.setOnClickListener{
            val intent = Intent(this, NavigationActivity::class.java)
            startActivity(intent)
        }
    }


}