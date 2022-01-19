package com.example.derbentsight.adapter

import com.example.derbentsight.data.DataItem

interface onRecyclerClickListener {
    fun onSightClick(dataItem: DataItem, position:Int)
}
