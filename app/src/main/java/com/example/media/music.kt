package com.example.media

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import com.example.media.databinding.ActivityMusicBinding

class music : AppCompatActivity() {
    lateinit var binding: ActivityMusicBinding
    lateinit var mediaPlayer : MediaPlayer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMusicBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mediaPlayer = MediaPlayer.create(this, R.raw.yassen)

        binding.seekBar.max = mediaPlayer.duration/1000

        binding.play.setOnClickListener {
            mediaPlayer.start()
        }

        binding.pause.setOnClickListener {
            mediaPlayer.pause()
        }

        binding.replay.setOnClickListener {
            mediaPlayer.seekTo(0)
            binding.seekBar.progress = 0
        }

        binding.forward.setOnClickListener {
            binding.seekBar.progress += (10)
            mediaPlayer.seekTo(binding.seekBar.progress*1000)
        }

        binding.back.setOnClickListener {
            binding.seekBar.progress -= (10)
            mediaPlayer.seekTo(binding.seekBar.progress*1000)
        }



        binding.seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar, i: Int, b: Boolean) {
                if (b) {
                    mediaPlayer.seekTo(i * 1000)
                }
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {
            }

            override fun onStopTrackingTouch(seekBar: SeekBar) {
            }
        })

    }

    override fun onBackPressed() {
        mediaPlayer.stop()
        super.onBackPressed()

    }

}