package uan.edu.co.app_route_plan.View.ui.activities

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import uan.edu.co.app_route_plan.databinding.ActivitymainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivitymainBinding
    lateinit var handler: Handler
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivitymainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.animationView.playAnimation()
        handler= Handler(Looper.myLooper()!!)
        handler.postDelayed({
            val intent= Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }, 4000)

    }

}