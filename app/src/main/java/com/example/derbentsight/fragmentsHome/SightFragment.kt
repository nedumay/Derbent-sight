package com.example.derbentsight.fragmentsHome

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.derbentsight.R
import com.example.derbentsight.adapter.BaseFragment
import com.example.derbentsight.adapter.RecyclerAdapter
import com.example.derbentsight.adapter.onRecyclerClickListener
import com.example.derbentsight.data.DataItem

//const val ARG_OBJECT = "object"

class SightFragment : BaseFragment(R.layout.fragment_sight) {

    val dataItem: ArrayList<DataItem> = ArrayList()

    /*override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_sight, container, false)

    }*/

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        setInitialSavedState()
        super.onViewCreated(view, savedInstanceState)
        //arguments?.takeIf { it.containsKey(ARG_OBJECT) }?.apply {

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
       // }

    }

    private fun setInitialSavedState() {
        dataItem.add(DataItem(
            "Нарын-Кала – самая главная городская достопримечательность и архитектурная доминанта Дербента.\n" +
                "Крепость была возведена в VI веке, после чего многократно достраивалась и перестраивалась: сегодня здесь есть сооружения, относящиеся к разным эпохам. \n" +
                "Общая площадь цитадели составляет более 4 гектаров, к крепости примыкает оборонительная стена Даг-Бары, частично сохранившаяся до наших дней.",
            "Адрес: Архитектурный комплекс Цитадель Нарын-Кала, улица Магал"
            ,R.drawable.photo_nar_kala))
        dataItem.add(DataItem(
            "Дербентская стена – еще одна часть древних укрепительных сооружений, построенных в период правления персидской династии Сасанидов.\n" +
                    "Она примыкает к крепости Нарын-Кала и идет от цитадели к побережью, перекрывая подход к Каспийскому морю.\n" +
                    "В древности за стеной была расположена основная часть города.",
            "Адрес: Архитектурный комплекс Цитадель Нарын-Кала, улица Магал",
            R.drawable.photo_derb_stena))
        dataItem.add(DataItem(
            "На территории цитадели Нарын-Кала расположен древний комплекс бань, получивший название Ханской бани.\n" +
                    "Здесь правители древнего Дербента совершали омовения, отдыхали и даже вели государственные дела.\n" +
                    "Комплекс хорошо сохранился до наших дней и доступен для туристов.",
            "Адрес: Ханская баня, Дербентский район",
            R.drawable.photo_khans_bath))
        dataItem.add(DataItem(
            "В Дербенте находится самая старая мечеть на территории России, построенная еще в XVIII веке.\n" +
                    "Джума-мечеть была возведена как главный религиозный центр для проживающих в городе мусульман – сюда ходили жители всех районов.\n" +
                    "Хотя здание несколько раз перестраивалось и сегодня выглядит совсем не так, как 13 веков назад, оно имеет высокую историческую ценность и является объектом всемирного наследия ЮНЕСКО.",
            "Адрес: Дербентская Джума Мечеть, улица магал, Дербент",
            R.drawable.photo_mechet))
        dataItem.add(DataItem(
            "В 1722 году Петр I посетил Дербент во время персидского похода и прожил в городе несколько недель.\n" +
                    "На месте землянки, которая служила царю временным домом, позднее был построен павильон с памятной надписью.\n" +
                    "Здание постепенно ветшало, однако в 2010-х годах здесь провели масштабную реконструкцию, после которой открылся новый музей – домик Петра I.",
            "Адрес: Дом Петра I в Дербенте, Зои Космодемьянской улица, Дербент",
            R.drawable.photo_home_petr))
    }

}