package com.example.trabalhoprtico_joanacardoso

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.trabalhoprtico_joanacardoso.databinding.ActivityRegistarProdutoBinding

class RegistarProdutoActivity : AppCompatActivity() {

    // Binding para aceder os elementos da UI
    private val binding by lazy {
        ActivityRegistarProdutoBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        // Recebe a Intent que iniciou esta Activity
        val i = intent

        // Obtém os valores dos campos da Intent
        val nome = i.extras?.getString("nome")
        val codigo = i.extras?.getString("codigo")
        val categoria = i.extras?.getString("categoria")

        // Mostra os dados do produto nos TextViews
        binding.nomeProduto.text = "Nome: ${nome}"
        binding.codigoProduto.text = "Código: ${codigo}"
        binding.categoriaProduto.text = "Categoria: ${categoria}"

        // Configura o botão de confirmar
        binding.confirmar.setOnClickListener {
            // Volta para a LoginActivity e mostra uma mensagem de sucesso
            startActivity(Intent(this,LoginActivity::class.java))
            Toast.makeText(applicationContext, "Produto adicionado com sucesso!", Toast.LENGTH_SHORT).show()
        }

        // Configura o botão de cancelar
        binding.cancelar.setOnClickListener {
            // Volta para a NovoProdutoActivity
            startActivity(Intent(this,NovoProdutoActivity::class.java))
        }
    }
}