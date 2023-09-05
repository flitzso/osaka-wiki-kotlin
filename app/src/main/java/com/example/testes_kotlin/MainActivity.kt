package com.example.testes_kotlin

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botaoAbrirWikipedia = findViewById<Button>(R.id.button_tokio)

        botaoAbrirWikipedia.setOnClickListener {
            // URL do artigo na Wikipedia que você deseja abrir
            val urlArtigoWikipedia = "https://en.wikipedia.org/wiki/Osaka"

            // Crie uma intenção explícita para abrir o navegador da web
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(urlArtigoWikipedia))

            // Verifique se ha aplicativos que podem lidar com esta intenção
            if (intent.resolveActivity(packageManager) != null) {
                startActivity(intent)
            }
        }
    }
}