package com.log.covid_19app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.log.covid_19app.databinding.ActivityImageBinding

class ImageActivity : AppCompatActivity() {

    private lateinit var binding: ActivityImageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityImageBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onStart() {
        super.onStart()
        if (Settings.english){
            binding.imagePoster.setImageResource(R.drawable.handwash_english)
        } else {
            binding.imagePoster.setImageResource(R.drawable.handwash_polska)
        }
    }
}