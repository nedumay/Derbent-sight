package com.example.derbentsight.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.derbentsight.R
import com.example.derbentsight.data.DataItemTaxi

class RecyclerAdapterTaxi internal constructor(context: Context?, dataItem: List<DataItemTaxi>, private val onClickListener:onRecyclerClickListenerTaxi) :
    RecyclerView.Adapter<RecyclerAdapterTaxi.ViewHolder>(){

    private val inflater: LayoutInflater
    private val dataItem:List<DataItemTaxi>


    init {
        this.dataItem = dataItem
        inflater = LayoutInflater.from(context)
    }

    class ViewHolder internal constructor(view: View):RecyclerView.ViewHolder(view){
        val imgPhoto: ImageView
        val titlePhoto: TextView
        val textPhone: TextView
        val textCoast: TextView
        init {
            imgPhoto = view.findViewById(R.id.img_photo)
            titlePhoto = view.findViewById(R.id.title_photo)
            textPhone = view.findViewById(R.id.text_photo)
            textCoast = view.findViewById(R.id.coast)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View = inflater.inflate(R.layout.list_item_taxi, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val person: DataItemTaxi = dataItem[position]
        holder.imgPhoto.setImageResource(person.imageId)
        holder.titlePhoto.setText(person.title)
        holder.textPhone.setText(person.number)
        holder.textCoast.setText(person.coast)

        holder.itemView.setOnClickListener {
            onClickListener.onRecClickTaxi(person,position)
        }

    }

    override fun getItemCount(): Int {
        return dataItem.size
    }

}