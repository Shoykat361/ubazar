package com.example.ubazer.Screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.ubazer.R
import com.example.ubazer.databinding.FragmentSecondscreenBinding

class Secondscreen : Fragment() {
    private lateinit var binding:FragmentSecondscreenBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentSecondscreenBinding.inflate(inflater,container,false)
        binding.SecondSkip.setOnClickListener {
            findNavController().popBackStack()
        }
        return binding.root
    }

}