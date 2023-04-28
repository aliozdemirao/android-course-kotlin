package com.aliozdemir.kotlinintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.aliozdemir.kotlinintent.databinding.ActivityMainBinding
import com.aliozdemir.kotlinintent.databinding.ActivityNextBinding

class NextActivity : AppCompatActivity() {

    private lateinit var binding: ActivityNextBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)

        binding = ActivityNextBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        // getIntent
        val intent = intent
        val username = intent.getStringExtra("username")
        val name = intent.getStringExtra("name")

        binding.userNameTextNextActivity.text = "Username: " + username
        binding.nameTextNextActivity.text = "Name: " + name

    }


}