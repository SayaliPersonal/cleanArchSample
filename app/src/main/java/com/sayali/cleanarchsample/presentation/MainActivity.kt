package com.sayali.cleanarchsample.presentation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.sayali.cleanarchsample.R
import com.sayali.cleanarchsample.databinding.ActivityMainBinding
import com.sayali.cleanarchsample.presentation.movie.MovieActivity


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.btnDisplay.setOnClickListener{
            val intent=Intent(this, MovieActivity::class.java)
            startActivity(intent)
        }
    }
}