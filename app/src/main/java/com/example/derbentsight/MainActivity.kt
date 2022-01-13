package com.example.derbentsight

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.example.derbentsight.adapter.AdapterTab
import com.example.derbentsight.data.tabIcons
import com.example.derbentsight.data.tabNames
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private lateinit var adapterTab: AdapterTab
    private lateinit var tabLayout: TabLayout
    private lateinit var viewPager: ViewPager2


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapterTab = AdapterTab(this)
        viewPager = findViewById(R.id.pager)
        viewPager.adapter = adapterTab

        tabLayout = findViewById(R.id.tab_layout)
        TabLayoutMediator(tabLayout, viewPager){tab, position ->
            tab.text = tabNames[position]
            tab.setIcon(tabIcons[position])
        }.attach()


    }

}