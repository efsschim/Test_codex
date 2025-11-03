package com.example.sampleapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.sampleapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.greetingText.text = getString(R.string.greeting_message)
        binding.actionButton.setOnClickListener {
            binding.greetingText.text = getString(R.string.button_clicked_message)
        }
    }
}
