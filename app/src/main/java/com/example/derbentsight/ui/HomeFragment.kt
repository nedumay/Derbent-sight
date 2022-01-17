package com.example.derbentsight.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.example.derbentsight.R
import com.example.derbentsight.adapter.AdapterTab
import com.example.derbentsight.data.tabIcons
import com.example.derbentsight.data.tabNames
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class HomeFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val adapterTab = AdapterTab(this)
        val viewPager: ViewPager2 = view.findViewById(R.id.pager)
        viewPager.adapter = adapterTab

        val tabLayout: TabLayout = view.findViewById(R.id.tab_layout)
        TabLayoutMediator(tabLayout, viewPager){tab, position ->
            tab.text = tabNames[position]
            tab.setIcon(tabIcons[position])
        }.attach()
        super.onViewCreated(view, savedInstanceState)
    }

}