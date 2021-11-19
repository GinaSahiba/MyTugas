package com.example.mytugas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.title = " Penjualan berbagai Macam Ayam"
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnAyamGoreng: Button = findViewById(R.id.btn_ayam_goreng)
        btnAyamGoreng.setOnClickListener(this)

        val btnAyamBakar: Button = findViewById(R.id.btn_ayam_bakar)
        btnAyamBakar.setOnClickListener(this)
    }
    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_ayam_goreng -> {
                val ayamGorengIntent = Intent(this@MainActivity, AyamGoreng::class.java)
                startActivity(ayamGorengIntent)
            }
            R.id.btn_ayam_bakar -> {
                val ayamBakarIntent = Intent (this@MainActivity, AyamBakar::class.java)
                startActivity(ayamBakarIntent)
            }
        }
    }
}