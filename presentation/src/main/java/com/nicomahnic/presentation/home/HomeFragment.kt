package com.nicomahnic.presentation.home

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.nicomahnic.presentation.R

class HomeFragment : Fragment(R.layout.fragment_home) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        println("NM: HomeFragment")
    }
}