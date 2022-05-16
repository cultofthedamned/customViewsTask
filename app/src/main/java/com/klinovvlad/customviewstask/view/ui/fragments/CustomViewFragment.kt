package com.klinovvlad.customviewstask.view.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.klinovvlad.customviewstask.R
import com.klinovvlad.customviewstask.view.customViews.RectangleView

class CustomViewFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return RectangleView(requireContext())
    }

}