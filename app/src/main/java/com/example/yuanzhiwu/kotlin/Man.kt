package com.example.yuanzhiwu.kotlin

class Man(name: String, color: String) : Human(name, 0, color) {
    init {
        println("Man name : ${name} ")
    }

    constructor(name: String, color: String, action:String) : this(name, color)
}