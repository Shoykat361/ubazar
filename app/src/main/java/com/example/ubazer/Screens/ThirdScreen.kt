package com.example.ubazer.Screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.ubazer.R
import com.example.ubazer.databinding.FragmentThirdScreenBinding

class ThirdScreen : Fragment() {
    private lateinit var binding: FragmentThirdScreenBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentThirdScreenBinding.inflate(inflater, container, false)

            binding.firstskip.setOnClickListener {
                findNavController().navigate(R.id.action_welcomeFragment_to_homeFragment2)
            }


        return binding.root
    }
}

