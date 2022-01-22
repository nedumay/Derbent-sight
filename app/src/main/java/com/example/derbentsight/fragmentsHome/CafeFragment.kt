package com.example.derbentsight.fragmentsHome

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.derbentsight.R
import com.example.derbentsight.adapter.BaseFragment
import com.example.derbentsight.adapter.RecyclerAdapterCafe
import com.example.derbentsight.adapter.RecyclerAdapterSight
import com.example.derbentsight.adapter.onRecyclerClickListener
import com.example.derbentsight.data.DataItem

class CafeFragment : BaseFragment(R.layout.fragment_cafe) {

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
        val adapter = RecyclerAdapterCafe(context, dataItem,recClickListener)
        recyclerView.adapter = adapter
        // }*/

    }

    private fun setInitialSavedState() {
        dataItem.add(
            DataItem(
                "Kaфе Рандеву",
                " Кухня: Японская, Европейская, Восточноевропейская\n" +
                    " Диапазон цен: 100 руб - 1 500 руб ",
            "Адрес: ул. Гагарина, 10, Дербент 368600"
            , R.drawable.randvy)
        )
        dataItem.add(
            DataItem(
                "Кафе Buro 345",
                " Кухня: Японская, Европейская, Азиатская, Грузинская, Восточноевропейская, Кавказская\n" +
                    " Диапазон цен: 300 руб - 700 руб ",
            "Адрес: 345 Дагестанской Стрелковой Дивизии, 8Б/2, Дербент 368608",
            R.drawable.buro)
        )
        dataItem.add(
            DataItem(
                "Кафе Z&M",
                " Кухня: Европейская\n" +
                    " Диапазон цен: ???",
            "Адрес: Гагарина, дом 14, Дербент 368600",
            R.drawable.zm)
        )
        dataItem.add(
            DataItem(
                "Ресторан Шолковый путь",
                " Кухня: Европейская,Восточноевропейская,Кавказская\n" +
                    " Диапазон цен: 90 руб - 1 500 руб",
            "Адрес: Makhachkala-Derbent rd., Дербент 368600",
            R.drawable.shelc)
        )
        dataItem.add(
            DataItem(
                "Ресторан Хаял",
                    " Кухня: Европейская,Азербайджанская\n" +
                    " Диапазон цен: 500 руб - 1 500 руб",
            "Адрес: ул. 3-го Интернационала, 4, Дербент 368601",
            R.drawable.hayal)
        )
    }

}