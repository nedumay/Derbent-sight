package com.example.derbentsight.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.derbentsight.R
import com.example.derbentsight.data.DataItemBus

class RecyclerAdapterBus internal constructor(context: Context?, dataItemBus: List<DataItemBus>, private val onClickListener: onRecyclerClickListenerBus):
RecyclerView.Adapter<RecyclerAdapterBus.ViewHolder>(){

    private val inflater: LayoutInflater
    private val dataItemBus:List<DataItemBus>

    init {
        this.dataItemBus = dataItemBus
        inflater = LayoutInflater.from(context)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View = inflater.inflate(R.layout.list_item_bus, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val person: DataItemBus = dataItemBus[position]
        holder.titelView.setText(person.titleNumber)

        holder.itemView.setOnClickListener {
            onClickListener.onRecClickBus(person,position)
        }
    }

    override fun getItemCount(): Int {
        return dataItemBus.size
    }

    class ViewHolder internal constructor(view: View): RecyclerView.ViewHolder(view){
        val titelView: TextView
        init {
            titelView = view.findViewById(R.id.titleNumberBus)
        }

    }
}