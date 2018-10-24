package com.example.saurabh.samplenavigationcomponent.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment.findNavController
import com.example.saurabh.samplenavigationcomponent.R
import kotlinx.android.synthetic.main.activity_main.*

class ColorActivity : AppCompatActivity(){


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    //Setup activity to host the navigation using host fragment
    override fun onSupportNavigateUp()
            = findNavController(my_nav_host_fragment).navigateUp()
}

