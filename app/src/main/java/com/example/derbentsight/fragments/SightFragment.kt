package com.example.derbentsight.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.derbentsight.R
import com.example.derbentsight.adapter.RecyclerAdapter
import com.example.derbentsight.adapter.onRecyclerClickListener
import com.example.derbentsight.data.DataItem

const val ARG_OBJECT = "object"

class SightFragment : Fragment() {

    val dataItem: ArrayList<DataItem> = ArrayList()
    //var names: Array<String> = arrayOf("Test1", "Test2", "Test2")

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_sight, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        setInitialSavedState()
        //super.onViewCreated(view, savedInstanceState)
        arguments?.takeIf { it.containsKey(ARG_OBJECT) }?.apply {

            val recyclerView: RecyclerView = view.findViewById(R.id.recyclerView)
            val recClickListener = object : onRecyclerClickListener{
                override fun onSightClick(dataItem: DataItem, position: Int) {
                    when(position){
                        0 ->{
                            Toast.makeText(context,"test1", Toast.LENGTH_SHORT).show()
                        }
                        1 ->{
                            Toast.makeText(context,"test2", Toast.LENGTH_SHORT).show()
                        }
                        2 ->{
                            Toast.makeText(context,"test3", Toast.LENGTH_SHORT).show()
                        }
                    }
                }
            }
            val adapter = RecyclerAdapter(context, dataItem,recClickListener)
            recyclerView.adapter = adapter
        }

    }

    private fun setInitialSavedState() {
        dataItem.add(DataItem("test1",R.drawable.ic_baseline_fastfood))
        dataItem.add(DataItem("test2",R.drawable.ic_baseline_local_grocery_store_))
        dataItem.add(DataItem("test3",R.drawable.ic_baseline_local_hotel))
    }


}