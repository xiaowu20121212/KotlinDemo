package com.example.yuanzhiwu.kotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.setArrayValue(arrayOf(1, 2, 2))
        this.setArrayValue(arrayOf(1.0f, 2.0f, 2.0f))
        val sum = { x: Int, y: Int -> x + y }
        sum(1, 3)
        var localreturn = localreturn()

        var findUsers = findUsers()
        findUsers.receiver

    }

    fun <T : Number> setArrayValue(array: Array<T>) {

    }
    private fun findUsers() = object {
                val sender = 1
                val receiver = 2
            }


    private fun localreturn(): Any {
        val x = 1;
        val y = 2;
        var value = object {
            val x1 = x
            val y1 = y
        }
        return value
    }

    fun doFuntion(block:() -> Unit) {
        block()
    }
}
