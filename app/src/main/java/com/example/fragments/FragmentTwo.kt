package com.example.fragments

import android.content.Context
import android.os.Bundle
import android.text.Editable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_two.*
import kotlinx.android.synthetic.main.fragment_two.view.*

class FragmentTwo:Fragment() {
    lateinit var interListerner: iListerner

    companion object{
        fun newInstance(): FragmentOne {
            return FragmentOne()
        }
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        interListerner = activity as iListerner

    }

    interface  iListerner{
        fun sendValuesToFragOne(text: Editable)
    }


    fun updateFragment2UI(text: Editable)
    {
        edtfrag2Input.setText(text)
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v=inflater.inflate(R.layout.fragment_two,container,false)
        v.btnFrag2Navigate.setOnClickListener(){
            var s=edtfrag2Input.text
            interListerner.sendValuesToFragOne(s)
        }
        return v
    }
}