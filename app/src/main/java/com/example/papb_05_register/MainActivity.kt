package com.example.papb_05_register

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.papb_05_register.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    companion object {
        const val EXTRA_USERNAME = "username"
        const val EXTRA_EMAIL = "email"
        const val EXTRA_PHONE = "phone"
        const val EXTRA_PASSWORD = "password"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        with(binding){
            val intentToHome = Intent(this@MainActivity,MainActivity2::class.java)

            submit.setOnClickListener{
                val username = inusername.text.toString()
                val email = inemail.text.toString()
                val phone = inphone.text.toString()
                val password = inpass.text.toString()

                intentToHome.putExtra(EXTRA_USERNAME, username)
                intentToHome.putExtra(EXTRA_EMAIL, email)
                intentToHome.putExtra(EXTRA_PHONE, phone)
                intentToHome.putExtra(EXTRA_PASSWORD, password)

                startActivity(intentToHome)
            }
        }


    }
}