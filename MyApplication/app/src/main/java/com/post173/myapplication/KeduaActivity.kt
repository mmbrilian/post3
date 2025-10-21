package com.post173.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.post173.myapplication.databinding.ActivityKeduaBinding

class KeduaActivity : AppCompatActivity() {
    lateinit var binding: ActivityKeduaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityKeduaBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
        val fullname = intent.getStringExtra("EXTRA_FULLNAME")
        val username = intent.getStringExtra("EXTRA_USERNAME")
        val age = intent.getStringExtra("EXTRA_AGE")
        val email = intent.getStringExtra("EXTRA_EMAIL")
        val gender = intent.getStringExtra("EXTRA_GENDER")
        binding.apply{
            hasilfullname.text = fullname
            hasilusername.text = username
            hasilumur.text = age
            hasilemail.text = email
            hasilgender.text = gender
        }

        binding.btnkembali.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}