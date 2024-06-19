package com.example.trabalhoprtico_joanacardoso

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.trabalhoprtico_joanacardoso.databinding.ActivityNovoProdutoBinding

class NovoProdutoActivity : AppCompatActivity() {

    // Binding para aceder os elementos da UI
    private val binding by lazy {
        ActivityNovoProdutoBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        // Configura o botão de registrar produto
        binding.registar.setOnClickListener {
            // Obtém os valores dos campos
            var nome = binding.nome.text.toString()
            var codigo = binding.codigo.text.toString()
            var categoria = binding.categoria.text.toString()
            var i: Intent = Intent(this, RegistarProdutoActivity::class.java)

            // Verifica se todos os campos estão preenchidos
            if (nome == "" || codigo == "" || categoria == "") {
                // Mostra uma mensagem se algum campo estiver vazio
                Toast.makeText(applicationContext, "Preencha todos os campos", Toast.LENGTH_SHORT)
                    .show()
            }
            else
            {
                // Adiciona os dados à Intent e inicia a RegistarProdutoActivity
                i.putExtra("nome", nome)
                i.putExtra("codigo", codigo)
                i.putExtra("categoria", categoria)
                startActivity(i)
            }

        }
    }
}
