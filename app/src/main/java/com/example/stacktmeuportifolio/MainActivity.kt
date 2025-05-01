package com.example.stacktmeuportifolio

import android.content.Intent
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.graphics.drawable.RoundedBitmapDrawable
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory
import com.example.stacktmeuportifolio.databinding.ActivityMainBinding

private lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fotoPerfil = BitmapFactory.decodeResource(resources, R.drawable.foto2)
        val circulo = RoundedBitmapDrawableFactory.create(resources, fotoPerfil)
        circulo.isCircular = true
        binding.imPerfil.setImageDrawable(circulo)

        binding.btProjetos.setOnClickListener {
            val intent = Intent(this, Projetos::class.java)
            startActivity(intent)
        }

        binding.btContatos.setOnClickListener {
            val intent = Intent(this, Contato::class.java)
            startActivity(intent)
        }
    }
}