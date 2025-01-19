package com.example.afrahyanbaa

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.afrahyanbaa.databinding.ActivityAddInvitationBinding

class AddInvitation : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityAddInvitationBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}