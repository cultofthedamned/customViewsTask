package com.klinovvlad.customviewstask.view.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.klinovvlad.customviewstask.R
import com.klinovvlad.customviewstask.databinding.ActivityMainBinding
import com.klinovvlad.customviewstask.view.ui.fragments.CustomViewFragment
import com.klinovvlad.customviewstask.view.ui.fragments.CustomViewGroupFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.customViewButton.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.main_frame, CustomViewFragment())
                .commit()
        }
        binding.customViewgroupButton.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.main_frame, CustomViewGroupFragment())
                .commit()
        }
    }
}