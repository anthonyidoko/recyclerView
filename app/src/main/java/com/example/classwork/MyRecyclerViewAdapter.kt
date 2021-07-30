package com.example.classwork

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyRecyclerViewAdapter(var itemList :Array<RecyclerData>, var listener: SetPlayerOnClickListener): RecyclerView.Adapter<MyRecyclerViewAdapter.ViewHolder>() {


     inner class ViewHolder(view: View):RecyclerView.ViewHolder(view),View.OnClickListener{

        var image: ImageView = view.findViewById(R.id.theImage)
        var name:TextView = view.findViewById(R.id.theName)
        var phoneNumber: TextView = view.findViewById(R.id.phoneNumber)
        var email :TextView  = view.findViewById(R.id.personalEmail)

        init {
            view.setOnClickListener(this)
        }

         override fun onClick(v: View?) {
             val position: Int = adapterPosition

             if (position != RecyclerView.NO_POSITION){

                 listener.showPlayerDetails(position)
             }
         }


     }

    interface SetPlayerOnClickListener{
        fun showPlayerDetails(position: Int)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.my_recycler_view,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentItem = itemList[position]
        holder.image.setImageResource(currentItem.image)
        holder.name.text = currentItem.name
        holder.phoneNumber.text = currentItem.phoneNumber
        holder.email.text = currentItem.email
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

}