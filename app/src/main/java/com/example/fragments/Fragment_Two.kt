package com.example.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_two.*
import kotlinx.android.synthetic.main.fragment_two.view.*


class Fragment_Two:Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view=inflater.inflate(R.layout.fragment_two,container,false)
       view. txtName.text="12345"

        return view
    }
    fun displayText(name:String)
    {
        var s=name
        txtName.setText(name)
    }

    fun displayName(name:String)
    {
        var s=name
        txtName.setText(name)
    }

}