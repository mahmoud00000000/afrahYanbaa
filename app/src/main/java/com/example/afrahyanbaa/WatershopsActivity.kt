package com.example.afrahyanbaa

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.afrahyanbaa.databinding.ActivityWatershopsBinding

class WatershopsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityWatershopsBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.backBtn.setOnClickListener {
            finish()
        }
        window.statusBarColor = Color.parseColor("#A70F71")

        window.decorView.systemUiVisibility = 0

        binding.imageGroupA.setOnClickListener {
            val i = Intent(this,KatratWaterActivity::class.java)
            startActivity(i)
        }

    }
}