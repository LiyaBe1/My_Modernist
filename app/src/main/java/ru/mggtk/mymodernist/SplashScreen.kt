package ru.mggtk.mymodernist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.animation.AlphaAnimation
import android.widget.TextView
import ru.mggtk.mymodernist.ui.home.HomeFragment
import ru.mggtk.mymodernist.ui.home.HomeViewModel

class SplashScreen : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        splashScreen()

        animOpen()
    }

    fun splashScreen(){
        val timer:Long=2000
        Handler(Looper.getMainLooper()).postDelayed({
            val intent: Intent = Intent(this@SplashScreen, MainActivity::class.java)
            startActivity(intent)
            finish()
        },timer)
    }

    fun animOpen(){
        val fadeln = AlphaAnimation(0f, 1f)
        fadeln.duration = 1000

        val textView: TextView = findViewById(R.id.textView2)

        textView.startAnimation(fadeln)

    }
}