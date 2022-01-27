package com.example.derbentsight.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.derbentsight.R
import com.example.derbentsight.data.DataItem

class RecyclerAdapterCafe internal constructor(context: Context?, dataItem: List<DataItem>, private val onClickListener: onRecyclerClickListener):
    RecyclerView.Adapter<RecyclerAdapterCafe.ViewHolder>() {

    private val inflater: LayoutInflater
    private val dataItem:List<DataItem>


    init {
        this.dataItem = dataItem
        inflater = LayoutInflater.from(context)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View = inflater.inflate(R.layout.list_item_cafe, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val person: DataItem = dataItem[position]
        holder.imgPhoto.setImageResource(person.imageId)
        holder.titlePhoto.setText(person.title)
        holder.textPhoto.setText(person.text)
        holder.addressPhoto.setText(person.address)

        holder.itemView.setOnClickListener {
            onClickListener.onRecClick(person,position)
        }

    }

    override fun getItemCount(): Int {
        return dataItem.size
    }

    class ViewHolder internal constructor(view: View): RecyclerView.ViewHolder(view){
        val imgPhoto: ImageView
        val titlePhoto: TextView
        val textPhoto: TextView
        val addressPhoto: TextView

        init {
            imgPhoto = view.findViewById(R.id.img_photo)
            titlePhoto = view.findViewById(R.id.title_photo)
            textPhoto = view.findViewById(R.id.text_photo)
            addressPhoto = view.findViewById(R.id.address_photo)
        }

    }

}