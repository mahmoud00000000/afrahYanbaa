package com.example.afrahyanbaa

import android.graphics.Color
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.afrahyanbaa.databinding.ActivityCalendarBinding

class Calendar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityCalendarBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.calendarView.setOnDateChangeListener { _, year, month, dayOfMonth ->

            val selectedDate = "$dayOfMonth/${month + 1}/$year"
            binding.selectedDateText.text = "Selected Date: $selectedDate"

            Toast.makeText(this, "Date: $selectedDate", Toast.LENGTH_SHORT).show()
        }
        window.statusBarColor = Color.parseColor("#A70F71")

        window.decorView.systemUiVisibility = 0

        binding.backBtn.setOnClickListener {
            finish()
        }




    }
}