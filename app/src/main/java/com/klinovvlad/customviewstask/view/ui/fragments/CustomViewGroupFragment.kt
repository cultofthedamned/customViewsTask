package com.klinovvlad.customviewstask.view.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.klinovvlad.customviewstask.databinding.FragmentCustomViewGroupBinding

class CustomViewGroupFragment : Fragment() {
    private lateinit var binding: FragmentCustomViewGroupBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCustomViewGroupBinding.inflate(
            inflater,
            container,
            false
        )
        return binding.root
    }

}