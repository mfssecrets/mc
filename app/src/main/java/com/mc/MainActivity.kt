package com.mc

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rootLayout = findViewById<androidx.constraintlayout.widget.ConstraintLayout>(R.id.rootLayout)
        val logoImage = findViewById<ImageView>(R.id.logoImage)
        val loginButton = findViewById<Button>(R.id.loginButton)
        val signupButton = findViewById<Button>(R.id.signupButton)

        // Load app logo
        logoImage.setImageResource(R.drawable.ic_launcher)

        // Login button click listener
        loginButton.setOnClickListener {
            Snackbar.make(rootLayout, "Login functionality coming soon", Snackbar.LENGTH_SHORT).show()
        }

        // Signup button click listener
        signupButton.setOnClickListener {
            Snackbar.make(rootLayout, "Signup functionality coming soon", Snackbar.LENGTH_SHORT).show()
        }
    }
}
