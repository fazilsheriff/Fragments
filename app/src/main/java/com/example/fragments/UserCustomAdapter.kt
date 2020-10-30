//package com.example.fragments
//
//import android.content.Context
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.widget.TextView
//import androidx.recyclerview.widget.RecyclerView
//
//class UserCustomAdapter(val context: Context, val userList: List<User>):RecyclerView.Adapter<UserCustomAdapter.UserViewHolder>() {
//
//
//    class UserViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
//        fun bindItems(user:User){
//            val tvUserName=itemView.findViewById(R.id.txtName)as TextView
//            tvUserName.text=user.name
//        }
//    }
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
//        val v = LayoutInflater.from(parent.context).inflate(R.layout.row_names, parent, false)
//        return UserViewHolder(v)
//    }
//
//    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
//        holder.bindItems(userList[position])
//    }
//
//    override fun getItemCount(): Int {
//        return userList.size
//    }
//}