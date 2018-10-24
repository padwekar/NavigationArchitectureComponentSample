package com.example.saurabh.samplenavigationcomponent.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation.findNavController
import com.example.saurabh.samplenavigationcomponent.R
import kotlinx.android.synthetic.main.fragment_option.*


class OptionFragment : Fragment() {

    var bundle = Bundle()

    var clickCount : Int
    get() {
        return bundle.getInt("count",0)
    }
    set(value) {
        bundle.putInt("count",value)
    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_option, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        greenButton.setOnClickListener {
            clickCount = clickCount.plus(1)
            findNavController(it).navigate(R.id.greenFragment,bundle)
        }

        /*
         Navigation Through action id, supports enter/exit/pop animation
        */
        redButton.setOnClickListener {
            clickCount = clickCount.plus(1)
            findNavController(it).navigate(R.id.redFragment,bundle)
        }

        /*
            Navigation Through action id, supports enter/exit/pop animation
         */
        blueButton.setOnClickListener {
            clickCount = clickCount.plus(1)
            findNavController(it).navigate(R.id.action_optionFragment_to_blueFragment,bundle)
        }
    }

}
