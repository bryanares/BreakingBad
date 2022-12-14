package com.brian.breakingbad.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.brian.breakingbad.R
import com.brian.breakingbad.databinding.FragmentSplashBinding
import com.squareup.picasso.Picasso

class SplashFragment : Fragment() {

    private val viewModel: BreakingBadViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = FragmentSplashBinding.inflate(inflater, container, false)
        viewModel.getCharacter()
        binding.lifecycleOwner = this
        binding.splashButton.setOnClickListener{
            findNavController().navigate(R.id.action_splashFragment_to_homeFragment)
        }
        val view = binding.root
        return view
    }
}