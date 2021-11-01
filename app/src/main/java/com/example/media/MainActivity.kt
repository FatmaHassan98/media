package com.example.media

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.media.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.music.setOnClickListener{
            var intent = Intent(this,music::class.java)
            startActivity(intent)
        }

        binding.web.setOnClickListener {
            var intent = Intent(this,webview::class.java)
            startActivity(intent)
        }

        binding.vedio.setOnClickListener {
            var intent = Intent(this,vedio::class.java)
            startActivity(intent)
        }

    }
}