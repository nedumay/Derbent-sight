package com.example.derbentsight.adapter

import android.util.ArrayMap
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.derbentsight.fragmentsHome.CafeFragment
import com.example.derbentsight.fragmentsHome.HotelFragment
import com.example.derbentsight.fragmentsHome.SightFragment
import com.example.derbentsight.ui.HomeFragment
import java.lang.IllegalStateException

class AdapterTab(container: HomeFragment): FragmentStateAdapter(container),FragmentReplacer {
    companion object {
        private const val PAGE_COUNT = 3
    }
    private val mapOfFragment = ArrayMap<Int,BaseFragment>()
    //override fun getItemCount(): Int = 4

    override fun replace(position: Int, newFragment: BaseFragment, isNotify: Boolean) {
        newFragment.setPageInfo(pagePos = position, fragmentReplacer = this)
        mapOfFragment[position] = newFragment
        if(isNotify){
            notifyItemChanged(position)
        }
    }

    override fun replaceDef(position: Int, isNotify: Boolean): BaseFragment {
        val fragment = when(position){
            0 -> SightFragment()
            1 -> CafeFragment()
            2 -> HotelFragment()
            else -> throw IllegalStateException()
        }
        replace(position, fragment, isNotify)
        return fragment
    }


    override fun createFragment(position: Int): Fragment {
        /*val fragment = SightFragment()
        fragment.arguments = Bundle().apply {
            putInt(ARG_OBJECT, position + 1)
        }
        return fragment*/
        return mapOfFragment[position] ?: replaceDef(position, false)
    }

    override fun containsItem(itemId: Long): Boolean {
        var isContains = false
        mapOfFragment.values.forEach {
            if (it.pageId == itemId) {
                isContains = true
                return@forEach
            }
        }
        return isContains
    }

    override fun getItemId(position: Int) = mapOfFragment[position]?.pageId ?: super.getItemId(position)
    override fun getItemCount() = PAGE_COUNT
}