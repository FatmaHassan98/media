package com.example.media

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import com.example.media.databinding.ActivityMainBinding
import com.example.media.databinding.ActivityWebviewBinding

class webview : AppCompatActivity() {
    lateinit var binding : ActivityWebviewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWebviewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.WebView.loadUrl("https://quran.com/")

        binding.WebView.webViewClient = WebViewClient()

        binding.WebView.settings.javaScriptEnabled = true

        binding.WebView.settings.builtInZoomControls = true

    }

    override fun onBackPressed() {
        if (binding.WebView.canGoBack()){
            binding.WebView.goBack()
        }
        else{
        super.onBackPressed()
    }}
}