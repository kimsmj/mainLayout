package com.my1.demo.ui.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.my1.demo.R
import com.my1.demo.Store

class BoardAdapter(val itemList: ArrayList<Store>) :
    RecyclerView.Adapter<BoardAdapter.BoardViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BoardViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_home, parent, false)
        return BoardViewHolder(view)
    }

    override fun onBindViewHolder(holder: BoardViewHolder, position: Int) {
        holder.tv_name.text = itemList[position].name
        holder.tv_location.text = itemList[position].location
        holder.tv_time.text = itemList[position].time
        holder.tv_postContext.text = itemList[position].postContext
    }

    override fun getItemCount(): Int {
        return itemList.count()
    }


    inner class BoardViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tv_name = itemView.findViewById<TextView>(R.id.tv_name)
        val tv_location = itemView.findViewById<TextView>(R.id.tv_location)
        val tv_time = itemView.findViewById<TextView>(R.id.tv_time)
        val tv_postContext = itemView.findViewById<TextView>(R.id.tv_postContext)
    }
}