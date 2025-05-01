package com.example.stacktmeuportifolio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.stacktmeuportifolio.databinding.ActivityProjetosBinding

private lateinit var binding: ActivityProjetosBinding
class Projetos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProjetosBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.projTool.setNavigationOnClickListener { finish() }
    }
}