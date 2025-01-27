package com.example.afrahyanbaa

import android.content.Intent
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

        binding.card1.setOnClickListener {
            val image = R.drawable.nopath_3
            val  text = binding.itemText.text.toString()

            val intent = Intent(this,ShowInvitationDetails::class.java).apply {
                putExtra("EXTRA_IMAGE", image)
                putExtra("EXTRA_TEXT", text)
            }
            startActivity(intent)
        }

        binding.card2.setOnClickListener {
            val image2 = R.drawable.nopath_4
            val text2 = binding.itemText2.text.toString()

            val intent = Intent(this,ShowInvitationDetails::class.java).apply {
                putExtra("EXTRA_IMAGE", image2)
                putExtra("EXTRA_TEXT", text2)


            }
            startActivity(intent)
        }






    }
}