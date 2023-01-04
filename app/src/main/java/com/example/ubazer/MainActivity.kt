package com.example.ubazer

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var navController: NavController
    private lateinit var appBarConfiguration: AppBarConfiguration
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setTheme(R.style.Alex_screen)
        setContentView(R.layout.activity_main)

        /*val toolbar=findViewById<Toolbar>(R.id.maxtoolbar)
        val drawer=findViewById<DrawerLayout>(R.id.maindrawerlaayout)
        val navView =findViewById<NavigationView>(R.id.nav_view)
        setSupportActionBar(toolbar)
        val navHostFragment=supportFragmentManager.
        findFragmentById(R.id.fragmentContainerView2) as NavHostFragment
        navController=navHostFragment.navController
        appBarConfiguration= AppBarConfiguration(navController.graph,drawer)
        toolbar.setupWithNavController(navController,appBarConfiguration)
        navView.setupWithNavController(navController)
*/


    }
}