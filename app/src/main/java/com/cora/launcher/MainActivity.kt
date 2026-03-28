package com.cora.launcher

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

// Usamos Activity pura para garantir que o JStudio compile sem erros de biblioteca externa
class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        // 1. Carrega o XML que corrigimos antes
        setContentView(R.layout.activity_main)

        // 2. Encontra o botão (Certifique-se que o ID no XML é btnJogar)
        val btn = findViewById<Button>(R.id.btnJogar)

        // 3. Ação do clique
        btn.setOnClickListener {
            Toast.makeText(this, "Iniciando CoraLauncher...", Toast.LENGTH_SHORT).show()
        }
    }
}
