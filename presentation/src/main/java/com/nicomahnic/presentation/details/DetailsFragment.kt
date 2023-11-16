package com.nicomahnic.presentation.details

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.nicomahnic.presentation.R
import com.nicomahnic.presentation.databinding.FragmentDetailsBinding

class DetailsFragment : Fragment(R.layout.fragment_details) {

    private lateinit var binding: FragmentDetailsBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentDetailsBinding.bind(view)
    }

}