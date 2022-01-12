package com.example.derbentsight.adapterTab

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.derbentsight.fragments.ARG_OBJECT
import com.example.derbentsight.fragments.SightFragment

class AdapterTab(fragment:FragmentActivity): FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int = 6

    override fun createFragment(position: Int): Fragment {
        val fragment = SightFragment()
        fragment.arguments = Bundle().apply {
            putInt(ARG_OBJECT, position + 1)
        }
        return fragment
    }

}