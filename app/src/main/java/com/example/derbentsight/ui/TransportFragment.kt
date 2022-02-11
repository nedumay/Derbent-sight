package com.example.derbentsight.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.derbentsight.R
import com.example.derbentsight.adapter.RecyclerAdapterBus
import com.example.derbentsight.adapter.RecyclerAdapterTaxi
import com.example.derbentsight.adapter.onRecyclerClickListenerBus
import com.example.derbentsight.adapter.onRecyclerClickListenerTaxi
import com.example.derbentsight.data.DataItemBus
import com.example.derbentsight.data.DataItemTaxi

class TransportFragment : Fragment() {

    val dataItemBus: ArrayList<DataItemBus> = ArrayList()
    val dataItemMiniBus: ArrayList<DataItemBus> = ArrayList()
    val dataItemTaxi: ArrayList<DataItemTaxi> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        setInitialSavedStateBus()
        setInitialSavedStateMiniBus()
        setInitialSavedStateTaxi()
        return inflater.inflate(R.layout.fragment_transport, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerViewBus: RecyclerView = view.findViewById(R.id.recyclerBus)
        val recClickListenerBus = object : onRecyclerClickListenerBus {
            override fun onRecClickBus(dataItem: DataItemBus, position: Int) {
                when(position){
                    0 ->{
                        Toast.makeText(context,"Автобус №5", Toast.LENGTH_SHORT).show()
                    }
                }
            }
        }
        val adapterBus = RecyclerAdapterBus(context, dataItemBus,recClickListenerBus)
        recyclerViewBus.adapter = adapterBus

        val recyclerViewMiniBus: RecyclerView = view.findViewById(R.id.recyclerMiniBus)
        val recClickListenerMiniBus = object : onRecyclerClickListenerBus {
            override fun onRecClickBus(dataItem: DataItemBus, position: Int) {
                when(position){
                    0 ->{ Toast.makeText(context,"Маршрутка №1", Toast.LENGTH_SHORT).show() }
                    1 ->{ Toast.makeText(context,"Маршрутка №2", Toast.LENGTH_SHORT).show() }
                    2 ->{ Toast.makeText(context,"Маршрутка №3", Toast.LENGTH_SHORT).show() }
                    3 ->{ Toast.makeText(context,"Маршрутка №4", Toast.LENGTH_SHORT).show() }
                    4 ->{ Toast.makeText(context,"Маршрутка №6", Toast.LENGTH_SHORT).show() }
                    5 ->{ Toast.makeText(context,"Маршрутка №7", Toast.LENGTH_SHORT).show() }
                    6 ->{ Toast.makeText(context,"Маршрутка №8", Toast.LENGTH_SHORT).show() }
                    7 ->{ Toast.makeText(context,"Маршрутка №9", Toast.LENGTH_SHORT).show() }
                    8 ->{ Toast.makeText(context,"Маршрутка №10", Toast.LENGTH_SHORT).show() }
                    9 ->{ Toast.makeText(context,"Маршрутка №11", Toast.LENGTH_SHORT).show() }
                }
            }
        }
        val adapterMiniBus = RecyclerAdapterBus(context,dataItemMiniBus,recClickListenerMiniBus)
        recyclerViewMiniBus.adapter = adapterMiniBus

        val recyclerViewTaxi: RecyclerView = view.findViewById(R.id.recyclerTaxi)
        val recClickListenerTaxi = object : onRecyclerClickListenerTaxi{
            override fun onRecClickTaxi(dataItem: DataItemTaxi, position: Int) {
                when(position){
                    0 ->{ Toast.makeText(context,"Taxi Vip", Toast.LENGTH_SHORT).show() }
                    1 ->{ Toast.makeText(context,"Городское такси", Toast.LENGTH_SHORT).show() }
                    2 ->{ Toast.makeText(context,"Такси Дербент", Toast.LENGTH_SHORT).show() }
                    3 ->{ Toast.makeText(context,"Такси Максим", Toast.LENGTH_SHORT).show() }
                    4 ->{ Toast.makeText(context,"Такси Пчелка", Toast.LENGTH_SHORT).show() }
                }
            }
        }
        val adapterTaxi = RecyclerAdapterTaxi(context,dataItemTaxi,recClickListenerTaxi)
        recyclerViewTaxi.adapter = adapterTaxi
    }



    private fun setInitialSavedStateBus() {
        dataItemBus.add(DataItemBus("№5"))
    }

    private fun setInitialSavedStateMiniBus() {
        dataItemMiniBus.add(DataItemBus("№1"))
        dataItemMiniBus.add(DataItemBus("№2"))
        dataItemMiniBus.add(DataItemBus("№3"))
        dataItemMiniBus.add(DataItemBus("№4"))
        dataItemMiniBus.add(DataItemBus("№6"))
        dataItemMiniBus.add(DataItemBus("№7"))
        dataItemMiniBus.add(DataItemBus("№8"))
        dataItemMiniBus.add(DataItemBus("№9"))
        dataItemMiniBus.add(DataItemBus("№10"))
        dataItemMiniBus.add(DataItemBus("№11"))
    }

    private fun setInitialSavedStateTaxi() {
        dataItemTaxi.add(DataItemTaxi("Taxi Vip", "+7 (87240) 4-20-44","---",R.drawable.viptaxi))
        dataItemTaxi.add(DataItemTaxi("City", "555-800","10 Rub/Km",R.drawable.citytaxi))
        dataItemTaxi.add(DataItemTaxi("Derbent", "600-800","from 50 Rub",R.drawable.taxi))
        dataItemTaxi.add(DataItemTaxi("Maxim", "777-555","---",R.drawable.taximaxim))
        dataItemTaxi.add(DataItemTaxi("Taxi bee", "910-558","from 30 Rub",R.drawable.beetaxi))

    }

}