package com.example.derbentsight.fragmentsHome

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.derbentsight.R
import com.example.derbentsight.adapter.BaseFragment
import com.example.derbentsight.adapter.RecyclerAdapter
import com.example.derbentsight.adapter.onRecyclerClickListener
import com.example.derbentsight.data.DataItem

class HotelFragment : BaseFragment(R.layout.fragment_hotel) {

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
        val adapter = RecyclerAdapter(context, dataItem,recClickListener)
        recyclerView.adapter = adapter
        // }*/

    }

    private fun setInitialSavedState() {
        dataItem.add(
            DataItem(
                "Отель SeaZone\n" +
                        "Услуги и удобства в отеле: Бесплатная парковка и Wi-Fi" +
                        "ресторан, пляж, трансфер из/до аэропорта, круглосуточная охрана.\n" +
                        "Оснащенность номера: кондиционер, уборка и обслуживание номеров, письменный стол" +
                        "кофеварка/чайник, холодильник, ванна/душ, кабельное и спутниковое Tv.\n" +
                        "Типы номеров: с видом на горы, с видом на море, номера-люксы, семейные номера",
                "Адрес: ул. Г. Длинная, 5, Дербент 368604 "
                , R.drawable.seazone)
        )
        dataItem.add(
            DataItem(
                "Отель Элит\n" +
                        "Услуги и удобства в отеле: Бесплатная парковка и Wi-Fi" +
                        "конференц-залы, салон красоты, хранение багажа, круглосуточная работа стойки регистрации\n" +
                        "Оснащенность номера: кондиционер, уборка и обслуживание номеров.\n" +
                        "Типы номеров: ---",
                "Адрес: ул. 3-го Интернационала 4/A, Дербент 368600 ",
                R.drawable.elit_hotel)
        )
        dataItem.add(
            DataItem(
                "Отель Metropol\n" +
                        "Услуги и удобства в отеле: Бесплатный завтрак" +
                        "бар/лаунж, ресторан, пляж.\n" +
                        "Оснащенность номера: кондиционер, письменный стол, телефон, купальные халаты, " +
                        "напольная вешалка для одежды, мини-бар, ТВ с плоским экраном, ванна/дущ.\n" +
                        "Типы номеров: Семейные номера.",
                "Адрес: ул. Х. Тагиева 33 Т, Дербент 368608",
                R.drawable.metropol)
        )
        dataItem.add(
            DataItem(
                "Отель Шахристан\n" +
                        "Услуги и удобства в отеле: Бесплатная Wi-Fi. \n" +
                        "Оснащенность номера: кондиционер, телефон, " +
                        "напольная вешалка для одежды, холодильник, удлиненные кровати, бесплатные туалетные принадлежности.\n" +
                        "Типы номеров: Семейные номера.",
                "Адрес: ул. Советская, д.15е, Дербент 368600 ",
                R.drawable.shahstan)
        )
        dataItem.add(
            DataItem(
                "Отель Красный бык\n" +
                        "Услуги и удобства в отеле: Бесплатная Wi-Fi, бар/лаунж, рыбалка, " +
                        "автобусный трансфер, массаж, круглосуточная работа стойки регистрации," +
                        "услуги прачечной, массаж.\n" +
                        "Оснащенность номера: Частный пляж, обслуживание номеров, утюг, услуга побудки/будильник.\n" +
                        "Типы номеров: Семейные номера.",
                "Адрес: ул. Ахундова, 48, Дербент 368604 ",
                R.drawable.red)
        )
    }

}