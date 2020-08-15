package com.example.yuanzhiwu.kotlin.utils

import android.content.Context

fun getAppVersionCode(context: Context): Int {
    return 1.sum(1)
}

// 方法名     方法类型       方法体
val sum: Int.(Int) -> Int = { other -> plus(other) }

class HTML {
    fun body() {

    }
}

/*
fun html(init: HTML.()-> Unit): HTML {
    val html: HTML();
    html.init()
    return html
}*/
val foo:(Int) -> Int = {bar -> bar * 2}

val li = listOf(1, 2, 3, 4, 5)
val liNew = li.map(foo)

val foo2:(Int) ->Boolean = {bar -> bar == 2}
val listNew = li.filter(foo2)