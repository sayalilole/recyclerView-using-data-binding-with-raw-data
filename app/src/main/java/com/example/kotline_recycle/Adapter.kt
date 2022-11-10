package com.example.kotline_recycle

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.annotation.RestrictTo
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView

//@RestrictTo(RestrictTo.Scope.LIBRARY)
//@BindingAdapter("app:goneUnless")
//fun goneUnless(view: View, visible: Boolean) {
//view.visibility = if (visible) View.VISIBLE else View.GONE
//}




class Adapter(val items: List<String>): RecyclerView.Adapter<Adapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

       val inflater= LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.linearlayout,parent,false)
        return ViewHolder(view)
    }



    override fun getItemCount(): Int {

     return items.size

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       holder.textTitle.text = items[position]
    }
    class ViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView) {
        var textTitle = itemView.findViewById<TextView>(R.id.title)
        var textDescription = itemView.findViewById<TextView>(R.id.des)

    }


}

