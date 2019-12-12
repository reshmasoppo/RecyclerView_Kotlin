package com.example.recyclerview_kotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(val userlist:ArrayList<User>):RecyclerView.Adapter<CustomAdapter.ViewHolder>()
{


    //this method is returning the view for each item in the list

      override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):ViewHolder {

        val v = LayoutInflater.from(parent.context).inflate(R.layout.list_layout, parent, false)
        return ViewHolder(v)
      }

    //this method is giving the size of the list
    override fun getItemCount(): Int {
        return userlist.size
    }


    //this method is binding the data on the list
     override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val user1: User =userlist[position]
        holder.text__name1.text=user1.name
        holder.text_address1.text= user1.address
        //holder.profile_img.setImageResource(user1.Image)


    }
    //the class is holding the list view

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)
    {
        val text__name1= itemView.findViewById<TextView>(R.id.text_name)
        val text_address1= itemView.findViewById<TextView>(R.id.text_address)


    }

}