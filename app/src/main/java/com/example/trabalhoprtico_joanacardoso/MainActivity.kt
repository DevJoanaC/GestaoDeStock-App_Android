package com.example.trabalhoprtico_joanacardoso

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.trabalhoprtico_joanacardoso.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // Binding para aceder os elementos da UI
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        // Configura o botão de login
        binding.entrar.setOnClickListener{
            // Obtém os valores de username e password
            var username: String = binding.username.text.toString()
            var password: String = binding.password.text.toString()
            var i: Intent = Intent(this,LoginActivity::class.java)

            // Verifica as credenciais e inicia a LoginActivity se forem válidas
            if (username == "admin" && password == "password123"){
                i.putExtra("username",username)
                i.putExtra("password",password)
                startActivity(i)
            }
            else if (username == "it" && password == "pastelNata"){
                i.putExtra("username",username)
                i.putExtra("password",password)
                startActivity(i)
            }
            else if (username == "joana" && password == "12345678"){
                i.putExtra("username",username)
                i.putExtra("password",password)
                startActivity(i)
            }
            else {
                // Mostra uma mensagem de erro se as credenciais forem inválidas
                Toast.makeText(applicationContext, "Login Inválido", Toast.LENGTH_SHORT).show()
            }
        }
    }
}