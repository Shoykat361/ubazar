package com.example.ubazer.Screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.ubazer.R
import com.example.ubazer.ViewPagerAdapter
import com.example.ubazer.databinding.FragmentFirstScreenBinding

class FirstScreenFragment : Fragment() {
    private lateinit var binding:FragmentFirstScreenBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentFirstScreenBinding.inflate(inflater,container,false)
        binding.fscreenskip.setOnClickListener {
            findNavController().popBackStack()
        }

        return binding.root
    }

}