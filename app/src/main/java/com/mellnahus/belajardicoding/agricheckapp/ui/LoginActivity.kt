package com.mellnahus.belajardicoding.agricheckapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mellnahus.belajardicoding.agricheckapp.R

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        supportActionBar?.hide()
    }
}