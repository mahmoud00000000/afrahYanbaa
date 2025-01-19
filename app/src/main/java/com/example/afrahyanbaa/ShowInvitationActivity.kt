package com.example.afrahyanbaa

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.afrahyanbaa.databinding.ActivityShowInvitationBinding

class ShowInvitationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityShowInvitationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        window.statusBarColor = Color.parseColor("#A70F71")

        window.decorView.systemUiVisibility = 0

        binding.backBtn.setOnClickListener {
            finish()
        }

        binding.calendarBtn.setOnClickListener {
            val i = Intent(this,Calendar::class.java)
            startActivity(i)
        }

    }
}