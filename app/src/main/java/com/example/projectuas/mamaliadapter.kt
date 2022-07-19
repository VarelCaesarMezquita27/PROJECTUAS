package com.example.projectuas

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class mamaliadapter (private val context: Context, private val namakota: List<mamalia>, val listener: (mamalia)-> Unit)
    : RecyclerView.Adapter<mamaliadapter.namakotaViewHolder>(){
    class namakotaViewHolder (view: View): RecyclerView.ViewHolder(view) {

        val imgmamalia = view.findViewById<ImageView>(R.id.img_item_photo)
        val namemamalia = view.findViewById<TextView>(R.id.tv_item_name)
        val descmamalia = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindView(namakota: mamalia, listener: (mamalia) ->Unit) {
            imgmamalia.setImageResource(namakota.imgmamalia)
            namemamalia.text = namakota.namemamalia
            descmamalia.text = namakota.descmamalia
            itemView.setOnClickListener {
                listener(namakota)}
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): namakotaViewHolder {
        return namakotaViewHolder(
            LayoutInflater.from(context).inflate(R.layout.list_mamalia, parent, false)
        )
    }

    override fun onBindViewHolder(holder: namakotaViewHolder, position: Int) {
        holder.bindView(namakota[position], listener)
    }

    override fun getItemCount(): Int = namakota.size
    }
