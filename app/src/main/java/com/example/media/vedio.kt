package com.example.media

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import com.example.media.databinding.ActivityVedioBinding
import android.net.Uri.parse

class vedio : AppCompatActivity() {
    lateinit var binding: ActivityVedioBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVedioBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mediaController = MediaController(this)
        mediaController.setAnchorView(binding.videoView)

        val uri: Uri = parse("android.resource://" + getPackageName() + "/" + R.raw.videoplayback)

        binding.videoView.setMediaController(mediaController)
        binding.videoView.setVideoURI(uri)
        binding.videoView.requestFocus()
        binding.videoView.start()

    }
}