package com.example.classwork

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityOptionsCompat
import androidx.core.view.ViewCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity(), MyRecyclerViewAdapter.SetPlayerOnClickListener {

    lateinit var myRecyclerView : RecyclerView
    lateinit var itemArray :Array<RecyclerData>

    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myRecyclerView = findViewById(R.id.myRecyclerView)


        itemArray = arrayOf(
            RecyclerData(R.drawable.lionel_messi,"Lionel Messi","(650) 555 - 1367","firstnameLastname@yahoo.com"),
            RecyclerData(R.drawable.ronaldo,"Christiano Ronaldo","(650) 555 - 1367","firstnameLastname@yahoo.com"),
            RecyclerData(R.drawable.neymar,"Neymar Jnr","(650) 555 - 1367","firstnameLastname@yahoo.com"),
            RecyclerData(R.drawable.hazard,"Eden Hazard","(650) 555 - 1367","firstnameLastname@yahoo.com"),
            RecyclerData(R.drawable.lacca,"Alenxander Laccazete","(650) 555 - 1367","firstnameLastname@yahoo.com"),
            RecyclerData(R.drawable.aubameyang,"Pier Emrick Aubameyang","(650) 555 - 1367","firstnameLastname@yahoo.com"),
            RecyclerData(R.drawable.ozil,"Mesut Ozil","(650) 555 - 1367","firstnameLastname@yahoo.com"),
            RecyclerData(R.drawable.muller,"Thomas Muller","(650) 555 - 1367","firstnameLastname@yahoo.com"),
            RecyclerData(R.drawable.xhaka,"Granit Xhaka","(650) 555 - 1367","firstnameLastname@yahoo.com"),
            RecyclerData(R.drawable.leno,"Bend Leno","(650) 555 - 1367","firstnameLastname@yahoo.com")
        )


        myRecyclerView.layoutManager = LinearLayoutManager(this)

        myRecyclerView.adapter = MyRecyclerViewAdapter(itemArray,this)



    }



    override fun showPlayerDetails(position: Int) {

        val clickedItem :RecyclerData = itemArray[position]
        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("EXTRA_DATA", clickedItem)
        startActivity(intent)
    }





}