package com.example.afrahyanbaa

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.afrahyanbaa.databinding.ActivityAddAdBinding
import com.example.afrahyanbaa.databinding.ActivityMainBinding

class addAdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityAddAdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.sendBtn.setOnClickListener {
            val firstname = binding.name.text.toString()
            val number = binding.number.text.toString()
            val emailaddress = binding.emailaddrress.text.toString()
            val firstdepartment = binding.firstDepartment.text.toString()
            val scounddepartment = binding.scoundDepartment.text.toString()
            if (firstname.isBlank() || number.isBlank() || emailaddress.isBlank() || firstdepartment.isBlank() || scounddepartment.isBlank())
                Toast.makeText(this, "برجاء ادخال بياناتك", Toast.LENGTH_SHORT).show()
            else{
                Toast.makeText(this, "تمت الاضافه بنجاح", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish()
            }
        }

        window.statusBarColor = Color.parseColor("#A70F71")

        window.decorView.systemUiVisibility = 0

        binding.backBtn.setOnClickListener {
            finish()
        }


    }
}