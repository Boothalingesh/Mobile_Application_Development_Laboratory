package com.example.imagedemo

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val imgViewLogo: ImageView = findViewById(R.id.imgviewLogo)
        val btnChange: Button = findViewById(R.id.btnchange)
        var boolStatus = true

        btnChange.setOnClickListener {
            if (boolStatus)
                imgViewLogo.setImageResource(R.drawable.rsa)
            else
                imgViewLogo.setImageResource(R.drawable.rec)
            boolStatus = !boolStatus
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
