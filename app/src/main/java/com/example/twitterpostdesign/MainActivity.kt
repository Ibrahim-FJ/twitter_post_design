package com.example.twitterpostdesign

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.twitterpostdesign.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.translate.setOnClickListener {
            Toast.makeText(this, "Khaed", Toast.LENGTH_SHORT).show()

        }


        binding.like.setOnClickListener {
            Toast.makeText(this, "like", Toast.LENGTH_SHORT).show()
        }

        binding.translate.setOnClickListener {
            binding.showTranslate.text =
                "Steps to register in #معسكر_طويق_1000 Remote for available software paths\n" +
                        " Registration via the educational platform link:http://satr.codes"
        }

        binding.replay.setOnClickListener {
            Toast.makeText(this, "replay", Toast.LENGTH_SHORT).show()
        }

        binding.retweet.setOnClickListener {
            Toast.makeText(this, "retweet", Toast.LENGTH_SHORT).show()
        }

        binding.share.setOnClickListener {
            Toast.makeText(this, "share", Toast.LENGTH_SHORT).show()

        }


    }
}