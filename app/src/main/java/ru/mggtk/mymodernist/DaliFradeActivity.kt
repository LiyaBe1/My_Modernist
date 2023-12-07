package ru.mggtk.mymodernist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class DaliFradeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dali_frade)
        val button = findViewById<Button>(R.id.button2)

        button.setOnClickListener{
            val intent = Intent(this@DaliFradeActivity, NavigationActivity::class.java)
            startActivity(intent)
        }
    }
}