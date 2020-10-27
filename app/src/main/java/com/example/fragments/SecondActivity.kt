package com.example.fragments

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity

class SecondActivity:AppCompatActivity() {
    lateinit var fragmentTwo: Fragment_Two
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val name:String = intent.getStringExtra("value")
        fragmentTwo= Fragment_Two()
        supportFragmentManager.beginTransaction().replace(R.id.fragmelayout2,fragmentTwo).commit()
        fragmentTwo.displayText(name)
        }



    }

