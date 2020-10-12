package com.example.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Create Instance of Fragment
        val firstFragment=FirstFragment()
        //Creating  a fragment manager
        val manager=supportFragmentManager
        // Creating a transaction
        val transacion=manager.beginTransaction()
        // Adding fragment dynamically
        transacion.add(R.id.fragmentLayout,firstFragment)
        transacion.commit()


    }
}