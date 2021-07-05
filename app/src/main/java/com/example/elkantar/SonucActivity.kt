package com.example.elkantar

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_sonuc.*

class SonucActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sonuc)

        yenibolum.setOnClickListener {
            startActivity(Intent(this, BirimTani::class.java))

        }
        aynıbolum.setOnClickListener {
            startActivity(Intent(this, AgirlikAlActivity::class.java))
        }
    }
}