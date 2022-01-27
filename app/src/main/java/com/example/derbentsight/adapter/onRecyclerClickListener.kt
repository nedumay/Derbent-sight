package com.example.derbentsight.adapter

import com.example.derbentsight.data.DataItem
import com.example.derbentsight.data.DataItemBus
import com.example.derbentsight.data.DataItemTaxi

interface onRecyclerClickListener {
    fun onRecClick(dataItem: DataItem, position:Int)
}

interface onRecyclerClickListenerBus{
    fun onRecClickBus(dataItem: DataItemBus, position:Int)
}

interface onRecyclerClickListenerTaxi{
    fun onRecClickTaxi(dataItem: DataItemTaxi, position:Int)
}
