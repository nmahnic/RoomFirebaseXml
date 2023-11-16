package com.nicomahnic.presentation.details

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.nicomahnic.presentation.R

class DetailsFragment : Fragment(R.layout.fragment_details) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        println("NM: DetailsFragment")
    }

}