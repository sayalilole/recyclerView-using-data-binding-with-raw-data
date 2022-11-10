package com.example.kotline_recycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kotline_recycle.databinding.ActivitymainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivitymainBinding//binding used
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitymainBinding.inflate(layoutInflater)//layout inflater
        setContentView(binding.root)
       // val item = listOf<String>("hi","ai","mi","si","gi","ai")

        var items= listOf<String>("sayali","sayali","sayali","sayali")//raw data
        binding.itemlist.adapter= Adapter(items)//call in to adapter
        binding.itemlist.layoutManager = LinearLayoutManager(this)//call the raw data in to linear layout
     //  binding.itemlist.adapter= Adapter()

    }
}