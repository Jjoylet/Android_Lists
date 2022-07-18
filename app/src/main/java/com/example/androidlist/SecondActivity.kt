package com.example.androidlist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.core.content.res.ResourcesCompat

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val txtName : TextView = findViewById(R.id.txtCity)
        val txtPosition : TextView =findViewById(R.id.txtPosition)

        val font = ResourcesCompat.getFont(this, R.font.font)
        txtName.typeface = font
        txtPosition.typeface = font


        val intent : Intent = intent
        val nameCity = intent.getStringExtra("name")

       // Log.d("CITY", "$nameCity")
        val positionCity = intent.getIntExtra("position",0)

        txtName.text = nameCity
        txtPosition.text = positionCity.toString()

        val actionBar = supportActionBar
        actionBar!!.title = nameCity

    }
}