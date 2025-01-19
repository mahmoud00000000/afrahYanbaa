package com.example.afrahyanbaa.ui.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.afrahyanbaa.AddInvitation
import com.example.afrahyanbaa.NotificationActivity
import com.example.afrahyanbaa.R
import com.example.afrahyanbaa.ShowInvitationActivity
import com.example.afrahyanbaa.ViewPagerAdapter
import com.example.afrahyanbaa.addAdActivity
import com.example.afrahyanbaa.databinding.FragmentHomeBinding
import com.example.afrahyanbaa.image
import com.example.afrahyanbaa.showAddActivity

class HomeFragment : Fragment() {



    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?




    ): View {





        val image = arrayListOf<image>()
        image.add(image(R.drawable.nopath),)

        val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        binding.adddAddBtn.setOnClickListener {
            val i = Intent(this.requireContext(), addAdActivity::class.java)
            startActivity(i)
        }

        binding.notificationBtn.setOnClickListener {
            val i = Intent(this.requireContext(), NotificationActivity::class.java)
            startActivity(i)
        }

        binding.addAdBtn.setOnClickListener {
            val intent = Intent(this@HomeFragment.requireContext(), showAddActivity::class.java)
            startActivity(intent)
        }

        binding.showInvitation.setOnClickListener {
            val i = Intent(this.requireContext(),ShowInvitationActivity::class.java)
            startActivity(i)
        }

        binding.addInvitation.setOnClickListener {
            val i = Intent(this.requireContext(),AddInvitation::class.java)
            startActivity(i)
        }




        val images = listOf(
            R.drawable.no_path_big,
            R.drawable.no_card,
            R.drawable.notification_image
        )

        val adapter = ViewPagerAdapter(images)
        binding.viewPager.adapter = adapter




        return root





    }







}