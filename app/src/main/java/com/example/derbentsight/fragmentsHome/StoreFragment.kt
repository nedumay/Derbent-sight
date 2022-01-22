package com.example.derbentsight.fragmentsHome

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.derbentsight.R
import com.example.derbentsight.adapter.BaseFragment
import com.example.derbentsight.adapter.RecyclerAdapterSight
import com.example.derbentsight.adapter.onRecyclerClickListener
import com.example.derbentsight.data.DataItem

class StoreFragment: BaseFragment(R.layout.fragment_store) {

    val dataItem: ArrayList<DataItem> = ArrayList()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_sight, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        setInitialSavedState()
        super.onViewCreated(view, savedInstanceState)
        //arguments?.takeIf { it.containsKey(ARG_OBJECT) }?.apply {

        val recyclerView: RecyclerView = view.findViewById(R.id.recyclerView)
        val recClickListener = object : onRecyclerClickListener {
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
                    3 ->{
                        Toast.makeText(context,"test4", Toast.LENGTH_SHORT).show()
                    }
                    4 ->{
                        Toast.makeText(context,"test5", Toast.LENGTH_SHORT).show()
                    }
                }
            }
        }
        val adapter = RecyclerAdapterSight(context, dataItem,recClickListener)
        recyclerView.adapter = adapter
        // }*

    }

    private fun setInitialSavedState() {
        dataItem.add(
            DataItem(
                "Store 1",
                "Text",
                "Адрес: "
                , R.drawable.photo_nar_kala)
        )
        dataItem.add(
            DataItem(
                "Store 2",
                "Text",
                "Адрес: ",
                R.drawable.photo_derb_stena)
        )
        dataItem.add(
            DataItem(
                "Store 3",
                "Text",
                "Адрес: ",
                R.drawable.photo_khans_bath)
        )
        dataItem.add(
            DataItem(
                "Store 4",
                "Text",
                "Адрес: ",
                R.drawable.photo_mechet)
        )
        dataItem.add(
            DataItem(
                "Store 5",
                "Text",
                "Адрес: ",
                R.drawable.photo_home_petr)
        )
    }

}