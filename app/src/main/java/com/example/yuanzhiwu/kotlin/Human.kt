package com.example.yuanzhiwu.kotlin

open class Human constructor(var name: String) {

    constructor(name: String, sex: Int) : this(name) {
        println("Human  name : ${name} sex: ${sex}")
    }

    init {
        println("Human  name : ${name} ")
    }


    constructor(name: String, sex: Int, color: String) : this(name, sex) {
        println("Human  name : ${name} sex: ${sex}  color: ${color}")
    }

    open fun action() {
        println("Human  name : ${name} do action")
    }

    //https://www.kotlincn.net/docs/reference/nested-classes.html
    //标记为 inner 的嵌套类能够访问其外部类的成员。内部类会带有一个对外部类的对象的引用：
    inner class Body{
        init {
            println("human name: ${name}")
        }

        fun doPlay(){
            println("body do play")
        }
    }
}
