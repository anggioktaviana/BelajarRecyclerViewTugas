package com.example.belajarrecyclerviewtugas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.belajarrecycleview.Adapter
import kotlinx.android.synthetic.main.activity_main.*

val list = ArrayList<Handphone>()
val listHandphone = arrayOf(
        "Samsung Galaxy A21s",
        "Samsung Galaxy A10",
        "Samsung Galaxy M51",
        "Samsung Galaxy A11",
        "Samsung Galaxy M21",
        "Samsung Galaxy A20s",
        "Samsung Galaxy S20",
        "Samsung Galaxy A31",
        "Samsung Galaxy A30s",
        "Samsung Galaxy A20"
)
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rv.setHasFixedSize(true)
        rv.layoutManager = LinearLayoutManager(this)
        for (i in 0 until listHandphone.size){
            list.add(Handphone(listHandphone.get(i)))
            if(listHandphone.size - 1 == i){
                val adapter = Adapter(list)
                adapter.notifyDataSetChanged()
                rv.adapter = adapter
            }
        }
    }
}