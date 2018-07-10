package com.example.yeong.test

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.content.Intent

class LoginActivity : AppCompatActivity() {

    lateinit var nLogin : Button
    lateinit var nSignup : TextView
    lateinit var nPassword : TextView
    lateinit var nEmail : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

      nLogin = findViewById(R.id.Loginbtn)
      nSignup = findViewById(R.id.Signup)
      nPassword = findViewById(R.id.loginPassword)
      nEmail = findViewById(R.id.loginEmail)

        nSignup.setOnClickListener {
            val intent = Intent(applicationContext , RegisterActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
