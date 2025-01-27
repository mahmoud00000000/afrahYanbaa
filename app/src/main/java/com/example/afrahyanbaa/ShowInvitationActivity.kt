package com.example.afrahyanbaa

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
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

        binding.card1.setOnClickListener {
            val text = binding.cardTitle.text.toString()
            val image = R.drawable.nopath_3

            val intent = Intent(this,ShowInvitationDetails::class.java).apply {
                putExtra("EXTRA_TEXT", text)
                putExtra("EXTRA_IMAGE", image)
            }
            startActivity(intent)

        }

        binding.card2.setOnClickListener {
            val text2 = binding.cardTitle2.text.toString()
            val image2 = R.drawable.nopath_copy

            val intent = Intent(this,ShowInvitationDetails::class.java).apply {
                putExtra("EXTRA_TEXT", text2)
                putExtra("EXTRA_IMAGE", image2)
            }
            startActivity(intent)
        }





    }
}