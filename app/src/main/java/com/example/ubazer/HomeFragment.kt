package com.example.ubazer

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.*
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ubazer.databinding.FragmentHomeBinding
import com.example.ubazer.databinding.ItemRowBinding
import com.google.android.material.navigation.NavigationView

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding


   /*private var count =0

   val toolbar :Toolbar=binding.maxtoolbar
    val drawer:DrawerLayout=binding.mDrawerLayout
    val navView:NavigationView =binding.navView
    private  var navController: NavController=findNavController()
    private lateinit var appBarConfiguration: AppBarConfiguration*/

   /*
    toolbar.setupWithNavController(navController,appBarConfiguration)
    navView.setupWithNavController(navController)*/

   override fun onCreateView(
       inflater: LayoutInflater, container: ViewGroup?,
       savedInstanceState: Bundle?
   ): View? {
    binding= FragmentHomeBinding.inflate(inflater,container,false)
       val adapter=ItemAdapter({
           Toast.makeText(activity, "${it.fruit_name}", Toast.LENGTH_SHORT).show()

       })
       binding.itemRV.layoutManager=LinearLayoutManager(activity)
       binding.itemRV.adapter=adapter
       adapter.submitList(itemList)
    //else*/
     //findNavController().navigate(R.id.homeFragment)

        /*val drawer:DrawerLayout=binding.mDrawerLayout*/
        //val toolbar=binding.mainToolbar


       //(activity as AppCompatActivity?)!!.setSupportActionBar(toolbar)





        return binding.root
    }





}