package com.example.stacktmeuportifolio

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.stacktmeuportifolio.databinding.ActivityContatoBinding

private lateinit var binding: ActivityContatoBinding

class Contato : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityContatoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.contTool.setNavigationOnClickListener { finish() }
        binding.contWhats.setOnClickListener { abrirWhatsApp() }
    }

    private fun abrirWhatsApp() {
        val numeroTel = "74999631921"
        val uri = Uri.parse("https://api.whatsapp.com/send?phone=$numeroTel")

        val intent = Intent(Intent.ACTION_VIEW, uri)

        if (numeroTel.equals(numeroTel)) startActivity(intent)
        else {
            val playStoreIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.whatsapp"))
            startActivity(playStoreIntent)
        }
    }
}