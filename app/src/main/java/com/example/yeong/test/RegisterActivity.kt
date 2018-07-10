package com.example.yeong.test

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class RegisterActivity : AppCompatActivity() {

    lateinit var nRegisterBtn : Button
    lateinit var nRegEmail : EditText
    lateinit var nRegPassword : EditText
    lateinit var nRegUserName : EditText
    lateinit var nRegLoginBtn : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        nRegisterBtn = findViewById(R.id.RegisterBtn)
        nRegEmail = findViewById(R.id.regEmail)
        nRegPassword = findViewById(R.id.regPassword)
        nRegUserName = findViewById(R.id.regUserName)
        nRegLoginBtn = findViewById(R.id.regLogin)

        nRegLoginBtn.setOnClickListener {
            val intent = Intent(applicationContext , LoginActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
