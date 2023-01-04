package com.example.ubazer

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import com.example.ubazer.Screens.FirstScreenFragment
import com.example.ubazer.Screens.Secondscreen
import com.example.ubazer.Screens.ThirdScreen
import com.example.ubazer.databinding.FragmentWelcomeBinding

class WelcomeFragment : Fragment() {
    private lateinit var binding:FragmentWelcomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentWelcomeBinding.inflate(inflater,container,false)
        val fragmentlist = arrayListOf<Fragment>(
            ThirdScreen(),
            Secondscreen(),
            FirstScreenFragment(),


            )
        // Inflate the layout for this fragment
       /*val view= inflater.inflate(R.layout.fragment_welcome, container, false)
        val fragmentlist = arrayListOf<Fragment>(
            FirstScreenFragment(),
            Secondscreen(),

        )
        val adapter=ViewPagerAdapter(
            fragmentlist,requireActivity()
                .supportFragmentManager,lifecycle
        )*/
        val adapter=ViewPagerAdapter(
            fragmentlist,requireActivity()
                .supportFragmentManager,lifecycle
        )
        binding.viewPager.adapter=adapter






        return binding.root
    }

}