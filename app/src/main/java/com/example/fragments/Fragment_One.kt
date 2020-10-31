package com.example.fragments

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_one.view.*

class Fragment_One:Fragment() {
    //getting recyclerview from xml
    //adding a layoutmanager
    //crating an arraylist to store users using the data class user

    //creating our adapter



    @SuppressLint("WrongConstant")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view=inflater.inflate(R.layout.fragme_list_names,container,false)
        val recyclerView =view.findViewById(R.id.list_names) as RecyclerView
        recyclerView.layoutManager = LinearLayoutManager(activity, LinearLayout.VERTICAL, false)
        val users = ArrayList<User>()
        users.add(User("Belal Khan"))
        users.add(User("Belal Basha"))
        users.add(User("Belal Badusha"))
        val adapter = activity?.let { UserCustomAdapter(it,users) }
        recyclerView.adapter = adapter

        return view
    }
}