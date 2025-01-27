package com.example.afrahyanbaa

import android.graphics.Color
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.afrahyanbaa.databinding.ActivityShowInvitationBinding
import com.example.afrahyanbaa.databinding.ActivityShowInvitationDetailsBinding

class ShowInvitationDetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityShowInvitationDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        window.statusBarColor = Color.parseColor("#A70F71")

        window.decorView.systemUiVisibility = 0

        intent.extras?.getInt("image")?.let { binding.invitationImage.setImageResource(it) }
        intent.extras?.getString("description")?.let { binding.invitationTitle.setText(it) }

        binding.backBtn.setOnClickListener {
            finish()
        }

        val textReceiver = intent.getStringExtra("EXTRA_TEXT")
        val imageReceiver = intent.getIntExtra("EXTRA_IMAGE",0)

        binding.invitationTitle.text = textReceiver
        if (imageReceiver != 0) {
            binding.invitationImage.setImageResource(imageReceiver)
        }

        val textReceiver2 = intent.getStringExtra("EXTRA_TEXT")
        val imageReceiver2 = intent.getIntExtra("EXTRA_IMAGE", 1)

        binding.invitationTitle.text = textReceiver2
        if (imageReceiver2 != 1) {
            binding.invitationImage.setImageResource(imageReceiver2)
        }

        val textRe = intent.getStringExtra("EXTRA_TEXT")
        val imageRe = intent.getIntExtra("EXTRA_IMAGE", 2)

        binding.invitationTitle.text = textRe
        if (imageRe != 2){
            binding.invitationImage.setImageResource(imageRe)
        }



    }
}