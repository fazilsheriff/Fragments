package com.example.fragments

import android.content.Context
import android.os.Bundle
import android.text.Editable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_one.*
import kotlinx.android.synthetic.main.fragment_one.view.*

class FragmentOne : Fragment() {
    lateinit var iListener: iListenerFrageOne

    interface iListenerFrageOne {
        fun sendValuesToFragTwo(text: Editable)

    }

    companion object {

        fun newInstance(): FragmentOne {
            return FragmentOne()
        }
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        iListener = activity as iListenerFrageOne
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_one, container, false)
        view.btnFrag1Navigate.setOnClickListener{
            var s=edtfragOneInput.text
            iListener.sendValuesToFragTwo(s)

        }

        return view
    }

    fun updateFragmentOneUI(text: Editable) {
        edtfragOneInput.setText(text)
    }
}