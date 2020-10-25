package com.example.fragments

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_one.*
import kotlinx.android.synthetic.main.fragment_one.view.*
import kotlinx.android.synthetic.main.fragment_two.view.*
import javax.sql.ConnectionEventListener

class FragmentOne:Fragment() {

    lateinit var iListener:Ilistener

    interface Ilistener
    {
        fun navigateToFragment2()
    }

    companion object {
        fun newInstance() : FragmentOne{
        return FragmentOne()
    }
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        iListener=activity as Ilistener
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view=inflater.inflate(R.layout.fragment_one,container,false)
        view. btnNaigateToFrament2.setOnClickListener{
            iListener.navigateToFragment2()
        }
        return view
    }
}