package com.example.trabalhoprtico_joanacardoso

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        // Handler para mostrar a SplashScreen por 3 segundos
        Handler(Looper.getMainLooper()).postDelayed({
            // Inicia a MainActivity após o delay
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            // Finaliza a SplashScreen
            finish() }, 3000)

    }
}