package com.example.yuanzhiwu.kotlin

interface Behavior {
    fun fly(): String
    fun swim(): String
    fun run(): String = "大多数鸟儿跑得并不象样，只有鸵鸟等少数鸟类才擅于奔跑"
}