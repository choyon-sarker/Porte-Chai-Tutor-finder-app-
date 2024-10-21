package com.devdroid.portechai

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Selection : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_selection)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val cards:CardView=findViewById(R.id.cardStudentid)
        cards.setOnClickListener {
            val i=Intent(this,Signup::class.java)
            startActivity(i)
        }
        val cardt:CardView=findViewById(R.id.cardTeacherid)
        cardt.setOnClickListener {
            val i=Intent(this,SignupTutor::class.java)
            startActivity(i)
        }
    }
}