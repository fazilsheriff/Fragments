package com.example.fragments

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_one.*
import kotlinx.android.synthetic.main.fragment_one.view.*

class FragmentOne: Fragment() {
    //Intiliazing the lateint value
    lateinit var iOnClickLisner: onClickLisner
    //Companion object
    companion object {
        fun newInstance(): FragmentOne {
            return FragmentOne()
        }
    }
    override fun onAttach(context: Context) {
        super.onAttach(context)
        iOnClickLisner=activity as  onClickLisner
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_one,container,false)
        iOnClickLisner.navigate()
        return view
    }

        fun updateUI(text:String)
        {
            var s=text
//            txtDisplay.text=text
        }
    interface onClickLisner{
        fun navigate()
    }
}