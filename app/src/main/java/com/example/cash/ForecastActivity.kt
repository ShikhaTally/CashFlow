package com.example.cash

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ForecastActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forecast)

        // Navigate to AI Predictions screen
//        val nextButton: Button = findViewById(R.id.nextButton)
//        nextButton.setOnClickListener {
//            val intent = Intent(this, AIPredictionsActivity::class.java)
//            startActivity(intent)
//        }
    }
}
