package com.example.derbentsight.adapter

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.derbentsight.fragments.ARG_OBJECT
import com.example.derbentsight.fragments.SightFragment
import com.example.derbentsight.ui.HomeFragment

class AdapterTab(fragment: HomeFragment): FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int = 4

    override fun createFragment(position: Int): Fragment {
        val fragment = SightFragment()
        fragment.arguments = Bundle().apply {
            putInt(ARG_OBJECT, position + 1)
        }
        return fragment
    }

}