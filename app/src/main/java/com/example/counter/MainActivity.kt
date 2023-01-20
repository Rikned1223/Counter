package com.example.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.counter.databinding.ActivityMainBinding
import com.example.counter.presenter.Presenter
import com.example.counter.view.View

class MainActivity : AppCompatActivity(), View {
    private lateinit var binding: ActivityMainBinding
    private val presenter = Presenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initClickers()
        presenter.attachView(this)
    }

    private fun initClickers() {
        with(binding) {
            plus.setOnClickListener {
                presenter.increment()
            }
            minus.setOnClickListener {
                presenter.decrement()
            }
        }
    }


    override fun changeCount(count: Int) {
    binding.result.text = count.toString()
    }

    override fun showToast() {
        Toast.makeText(this, "Поздравляю", Toast.LENGTH_SHORT).show()
    }

    override fun color(color: Int) {
      binding.result.setTextColor(color)
    }


}