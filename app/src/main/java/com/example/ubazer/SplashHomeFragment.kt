package com.example.ubazer

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.*
import androidx.fragment.app.Fragment
import androidx.lifecycle.coroutineScope
import androidx.navigation.fragment.findNavController
import com.example.ubazer.Screens.ThirdScreen
import com.example.ubazer.databinding.FragmentSplashHomeBinding
import kotlinx.coroutines.launch

class SplashHomeFragment : Fragment() {
    private lateinit var binding:FragmentSplashHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val id=0

        binding= FragmentSplashHomeBinding.inflate(inflater,container,false)
        //findNavController().navigate(R.id.action_splashHomeFragment_to_welcomeFragment)

           Handler(Looper.myLooper()!!).postDelayed({

                findNavController().navigate(R.id.action_splashHomeFragment_to_welcomeFragment2) },1500)







        //Log.d("$count", "onCreateView:value created ")
        //Handler(Looper.myLooper()!!).postDelayed({
           // findNavController().navigate(R.id.action_splashHomeFragment_to_welcomeFragment) },2000)



        return binding.root
    }


}