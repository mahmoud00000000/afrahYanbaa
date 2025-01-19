package com.example.afrahyanbaa

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.afrahyanbaa.databinding.ActivityShowAddBinding

class showAddActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityShowAddBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageGroupWater.setOnClickListener {
            val intent = Intent(this,WatershopsActivity::class.java)
            startActivity(intent)
        }

        binding.backBtn.setOnClickListener {
            onBackPressed()
        }

        window.statusBarColor = Color.parseColor("#A70F71")

        window.decorView.systemUiVisibility = 0

    }
}