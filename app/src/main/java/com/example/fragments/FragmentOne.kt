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
    lateinit var iOnClickLisner: iListner

    interface iListner{
        fun passValues(text:String)
    }

    companion object {
        fun newInstance(): FragmentOne {
            return FragmentOne()
        }
    }
    override fun onAttach(context: Context) {
        super.onAttach(context)
        iOnClickLisner=activity as iListner
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val View=inflater.inflate(R.layout.fragment_one,container,false)
        View.btnNavigate.setOnClickListener{
            var name:String
            name=View.edtName.text.toString()
            iOnClickLisner.passValues(name)

        }
        return View
    }

}