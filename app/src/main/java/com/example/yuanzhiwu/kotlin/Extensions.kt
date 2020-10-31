package com.example.yuanzhiwu.kotlin

open class Base
class Extended : Base()

open class X {
    open fun Base.foo() {
        println("i am Base.foo in X")
    }

    open fun Extended.foo() {
        println("i am Extended.foo in Y")
    }

    open fun deal(base: Base) {
        base.foo()
        println("" + base.javaClass.simpleName)
    }
}

class Y : X() {
    override fun Base.foo() {
        println("i am Base.foo in Y")
    }

    override fun Extended.foo() {
        println("i am Extended.foo in Y")
    }

}

fun main() {
    X().deal(Base())
    Y().deal(Base())
    X().deal(Extended())
    Y().deal(Extended())
}