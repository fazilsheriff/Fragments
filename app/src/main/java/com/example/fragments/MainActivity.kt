package com.example.fragments
///Todo 1: Dual pane support  tablet and mobile layouts
///Todo 2: Fragment lifecycle scearios and what is happening in each lifecycle call back
///Todo 3: Add,Repelace and remove
///Todo 4 : Commuincation between Activity and fragments
///Todo 5 : Commuincation between Fragments same activity
///Todo 6 : Commuincation of fragments with different acitivuy 1AF to 1AF
///Todo 7 : Commuincation Recycler with detaisl view
///Todo 8 : All scenarios of back stacks
///Todo 9 : Tab layout using fragments
///Todo 10 : Fragment with dialogs
///Todo 11 : Fragment with bottom sheet
///Todo 12 : Fragments with Retrofit
///Todo 13 : Fragments with live data
///Todo 14 : All scenarios of back stacks
///Todo 15 : Congiguration changes orinetation


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.frag_one.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        addFragmentOne()
        addFragmentTwo()

    }

    private fun addFragmentTwo() {
        //Creating instance of fragment
        val fragOne=FragmentTwo()
        //Creating manager
        val manager=supportFragmentManager
        //Creating transaction
        val transaction=manager.beginTransaction()
        //Adding fragment to layout
        transaction.add(R.id.fragmentTwo,fragOne)
        //commit
        transaction.commit()
    }

    private fun addFragmentOne() {
        //Creating instance of fragment
        val fragOne=FragmentOne()
        //Creating manager
        val manager=supportFragmentManager
        //Creating transaction
        val transaction=manager.beginTransaction()
        //Adding fragment to layout
        transaction.add(R.id.fragmentOne,fragOne)
        //commit
        transaction.commit()
    }
}