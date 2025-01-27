package com.example.afrahyanbaa

import android.graphics.Color
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.afrahyanbaa.databinding.ActivityItemBinding

class ItemActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityItemBinding.inflate(layoutInflater)
        setContentView(binding.root)

        window.statusBarColor = Color.parseColor("#A70F71")

        window.decorView.systemUiVisibility = 0

        binding.backBtn.setOnClickListener {
            finish()
        }

        val receviedText = intent.getStringExtra("EXTRA_TEXT")
        val recevedImage = intent.getIntExtra("EXTRA_IMAGE", 0)

        binding.textItem1.text = receviedText
        binding.statusTitle.text = receviedText
        if (recevedImage != 0) {
            binding.itemViewImage.setImageResource(recevedImage)
        }

        val receviedText2 = intent.getStringExtra("EXTRA_TEXT")
        val recevedImage2 = intent.getIntExtra("EXTRA_IMAGE", 1)


        binding.textItem1.text = receviedText2
        binding.statusTitle.text = receviedText2
        if (recevedImage2 != 1) {
            binding.itemViewImage.setImageResource(recevedImage2)
        }
    }
}