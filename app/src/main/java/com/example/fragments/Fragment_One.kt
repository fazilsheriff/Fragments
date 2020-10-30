package com.example.fragments

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_one.view.*

class Fragment_One:Fragment() {
   lateinit var iNavigate2ActivitySecond:INavigate2ActivitySecond

    companion object {
        fun newInstance(): Fragment_One {
            return Fragment_One()
        }
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        iNavigate2ActivitySecond=activity as INavigate2ActivitySecond
    }

    interface INavigate2ActivitySecond
    {
        fun sendValues(name:String)
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view=inflater.inflate(R.layout.fragment_one,container,false)
        view.btnSend.setOnClickListener{
           var text=view.edtName.text
            iNavigate2ActivitySecond.sendValues(text.toString())
        }
        return view
    }
}