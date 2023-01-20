package com.example.counter.presenter

import android.graphics.Color
import com.example.counter.model.Model
import com.example.counter.view.View

class Presenter {
    private val model = Model()
    lateinit var view: View

    fun increment() {
        model.increment()
        view.changeCount(model.count)
        if (model.count == 10) {
            view.showToast()
        }
        if (model.count == 15) {
            view.color(Color.GREEN)
        }
    }

    fun decrement() {
        model.decrement()
        view.changeCount(model.count)
        if (model.count == 10) {
            view.showToast()
        }
        if (model.count != 15) {
            view.color(Color.BLACK)
        }
    }

    fun attachView(view: View) {
        this.view = view
    }
}