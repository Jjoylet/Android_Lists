package com.example.androidlist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myListView : ListView = findViewById(R.id.ListCities)

        //data
        val cities = arrayOf("Nairobi","Mombasa","Kisumu","Eldoret","Nakuru","Naivasha",
            "Kitui","Bomet","Kitale","Isiolo","Bungoma","Karbanet","Kisumu","Kericho","Kakamega",
            "Kisii","Dodoma","Addis Ababa","Arusha","Embu","Meru","Cote d`ivore","Liberia")
        Log.d("_CITIES", "We have ${cities.size} cities")
        Log.d("XYZ",cities[0])
        // The tag is used to filter the log


        //Adapter
        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, cities)

        //tell the list which adapter to use
        myListView.adapter = adapter

        myListView.onItemClickListener = AdapterView.OnItemClickListener{_, _, position, _->
            val city = cities[position]
            Toast.makeText(this, city , Toast.LENGTH_SHORT).show()
            Log.d("_CITIES","City that was clicked is $city")
          //  Log.i("_CITIES","Position is $position")
            Log.e("_CITIES","Position is $position")
          //  Log.v("_CITIES","Position is $position")
            //Log.wtf("_CITIES","Position is $position")
            //Log.w("_CITIES","Position is $position")

            val intent = Intent( this,SecondActivity::class.java)
            //Pass data between activities
            intent.putExtra("name",city)
            intent.putExtra("position",position)
            //Open the activity
            startActivity(intent)
        }

    }
}