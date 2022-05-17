package com.klinovvlad.customviewstask.view.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.klinovvlad.customviewstask.databinding.FragmentCustomViewGroupBinding
import com.klinovvlad.customviewstask.view.customViews.CustomLinearLayout

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

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.customViewgroupFrame.addView(CustomLinearLayout(requireContext()))
    }

}