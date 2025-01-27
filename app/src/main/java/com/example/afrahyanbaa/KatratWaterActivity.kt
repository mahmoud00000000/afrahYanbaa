package com.example.afrahyanbaa

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.afrahyanbaa.databinding.ActivityKatratWaterBinding

class KatratWaterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityKatratWaterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        window.statusBarColor = Color.parseColor("#A70F71")

        window.decorView.systemUiVisibility = 0

        binding.backBtn.setOnClickListener {
            finish()
        }

        binding.card1.setOnClickListener {
            val text = binding.itemText.text.toString()
            val image = R.drawable.nopath_copy_item

            val intent = Intent(this,ItemActivity::class.java).apply {
                putExtra("EXTRA_TEXT", text)
                putExtra("EXTRA_IMAGE", image)
            }
            startActivity(intent)

        }

        binding.card2.setOnClickListener {
            val text1 = binding.itemText2.text.toString()
            val image2 = R.drawable.nopath_copy_item_two

            val intent = Intent(this,ItemActivity::class.java).apply {
                putExtra("EXTRA_TEXT", text1)
                putExtra("EXTRA_IMAGE", image2)
            }
            startActivity(intent)

        }

    }
}