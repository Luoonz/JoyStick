package com.example.joystickpanel

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.joystickpanel.databinding.ActivityMainBinding
import com.example.joystick.JoystickView

//https://monotics.tistory.com/19
//https://github.com/monotics/joystick

class MainActivity : AppCompatActivity() {
    val binding : ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.joystick.setOnMoveListener({ angle, strength ->
            binding.valueAngle.text = "angle : ${angle}"
            binding.valueStrength.text = "strength : ${strength}"
        }, 100)

    }
}