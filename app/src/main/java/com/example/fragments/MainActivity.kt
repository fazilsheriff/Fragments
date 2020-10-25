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
import android.text.Editable

class MainActivity : AppCompatActivity(),FragmentOne.iListenerFrageOne,FragmentTwo.iListerner {
    var fragmentOne=FragmentOne()
    var fragmentTwo= FragmentTwo()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction().replace(R.id.fragOne,fragmentOne)
            .replace(R.id.fragTwo,fragmentTwo)
            .commit()
    }

    override fun sendValuesToFragTwo(text: Editable) {
        fragmentTwo.updateFragment2UI(text)
    }

    override fun sendValuesToFragOne(text: Editable) {
        fragmentOne.updateFragmentOneUI(text)
    }


}