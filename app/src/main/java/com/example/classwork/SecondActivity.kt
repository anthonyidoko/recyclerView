package com.example.classwork

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val theImage = findViewById<ImageView>(R.id.theImage)
        val phoneNumber = findViewById<TextView>(R.id.phoneNumber)
        val personalEmail = findViewById<TextView>(R.id.personalEmail)
        val theName = findViewById<TextView>(R.id.theName)

        val data = intent.getParcelableExtra<RecyclerData>("EXTRA_DATA")

        theImage.setImageResource(data!!.image)
        phoneNumber.text = data.phoneNumber
        personalEmail.text = data.email
        theName.text = data.name




    }
}