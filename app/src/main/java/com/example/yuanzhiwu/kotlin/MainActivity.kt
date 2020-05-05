package com.example.yuanzhiwu.kotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.setArrayValue(arrayOf(1, 2, 2))
        this.setArrayValue(arrayOf(1.0f, 2.0f, 2.0f))
    }

    fun <T : Number> setArrayValue(array: Array<T>) {

    }
}
