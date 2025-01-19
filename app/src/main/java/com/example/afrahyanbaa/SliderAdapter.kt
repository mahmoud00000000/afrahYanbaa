package com.example.afrahyanbaa

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.afrahyanbaa.ui.dashboard.DashboardFragment
import com.example.afrahyanbaa.ui.home.HomeFragment
import com.example.afrahyanbaa.ui.notifications.NotificationsFragment

class SliderAdapter(fa : FragmentActivity): FragmentStateAdapter(fa) {

    override fun getItemCount() = 3

    override fun createFragment(position: Int): Fragment {
        return  when(position){
            0 -> SettingFragment()
            1 -> DashboardFragment()
            2 -> HomeFragment()
            else -> NotificationsFragment()
        }
    }

}