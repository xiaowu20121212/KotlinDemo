package com.example.yuanzhiwu.kotlin

class Woman(name: String, color: String) : Human(name, 1, color) {
    init {
        println("Human  name : ${name} ")
    }

    override fun action() {
        super.action()
    }
}