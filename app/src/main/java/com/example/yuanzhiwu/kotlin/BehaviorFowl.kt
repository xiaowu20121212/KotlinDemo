package com.example.yuanzhiwu.kotlin

class BehaviorFowl(var behavior: Behavior) : Behavior by behavior{
    override fun run(): String {
        return "我自己跑，不需要代理"
    }
}