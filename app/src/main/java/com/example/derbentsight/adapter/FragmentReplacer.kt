package com.example.derbentsight.adapter


interface FragmentReplacer {
    fun replace(position: Int, newFragment: BaseFragment, isNotify: Boolean = true)
    fun replaceDef(position: Int, isNotify: Boolean = true) : BaseFragment
}