package com.example.trabalhoprtico_joanacardoso

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.trabalhoprtico_joanacardoso.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    // Binding para aceder os elementos da UI
    private val binding by lazy {
        ActivityLoginBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        // Recebe a Intent que iniciou esta Activity
        val i = intent
        // Obtém o nome de utilizador da Intent
        val username = i.extras?.getString("username")

        // Mostra uma mensagem de boas-vindas com o nome de utilizador
        binding.textTextoBemvindo.text = "Bem-vindo/a ${username}!"

        // Configura o botão de registrar produto
        binding.registrarProduto.setOnClickListener {
            startActivity(Intent(this,NovoProdutoActivity::class.java))
        }

        // Configura o botão de logout
        binding.logout.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }

    }
}