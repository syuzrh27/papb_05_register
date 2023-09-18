package com.example.papb_05_register

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.papb_05_register.MainActivity.Companion.EXTRA_USERNAME
import com.example.papb_05_register.databinding.ActivityMain2Binding
import com.example.papb_05_register.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {

private lateinit var binding: ActivityMain2Binding

override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main2)


    val username = intent.getStringExtra(EXTRA_USERNAME)
    val email = intent.getStringExtra(MainActivity.EXTRA_EMAIL)
    val phone = intent.getStringExtra(MainActivity.EXTRA_PHONE)

    with(binding) {

        binding.username.text = "$username"
        binding.email.text = "$email"
        binding.phone.text = "$phone"

    }
}
}