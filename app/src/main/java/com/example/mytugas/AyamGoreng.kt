package com.example.mytugas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class AyamGoreng : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ayam_goreng)
        supportActionBar?.title = "Ayam Goreng"
    }
}