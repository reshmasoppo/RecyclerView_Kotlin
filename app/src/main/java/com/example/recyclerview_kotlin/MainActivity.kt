package com.example.recyclerview_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {



    var recyclerview:RecyclerView?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //getting recyclerview from xml
        recyclerview=findViewById<RecyclerView>(R.id.recyclerView)
        //adding a layoutmanager

   recyclerview!!.layoutManager= LinearLayoutManager(applicationContext, LinearLayoutManager.VERTICAL,false)
       // recyclerview!!.layoutManager= GridLayoutManager(applicationContext, GridLayoutManager.VERTICAL,false)
        val users=ArrayList<User>()
        users.add(User("Belal Khan", "Ranchi Jharkhand"))
        users.add(User("Ramiz Khan", "Ranchi Jharkhand"))
        users.add(User("Faiz Khan", "Ranchi Jharkhand"))
        users.add(User("Yashar Khan", "Ranchi Jharkhand"))
        //creating our adapter
        val adapter = CustomAdapter(users)
        //now adding the adapter to recyclerview
        recyclerview!!.adapter = adapter


    }


}
