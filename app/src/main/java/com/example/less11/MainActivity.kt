package com.example.less11

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnFacts1.setOnClickListener { navigateTo(ThreeActivity()) }
        btnFacts2.setOnClickListener { navigateTo(SecondActivity()) }
    }

    private fun navigateTo(activity: Activity) {
        val intent = Intent(this, activity::class.java)
        startActivity(intent)
        overridePendingTransition(0, 0)
    }
}