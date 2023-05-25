package com.iamauttamai.loading

import android.content.Context
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.iamauttamai.avloading.AVLoadingIndicatorView.TypeIndicator
import com.iamauttamai.avloading.ui.AVLoading
import com.iamauttamai.loading.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        AVLoading.loadingParamsBuilder(this,
            TypeIndicator.BallScaleMultipleIndicator, Color.parseColor("#FFFFFF"))
        AVLoading.initializeAVLoading()

        binding.btnStart.setOnClickListener {
            AVLoading.startAnimLoading()
        }

        binding.btnStop.setOnClickListener {
            AVLoading.stopAnimLoading()
        }

    }
}