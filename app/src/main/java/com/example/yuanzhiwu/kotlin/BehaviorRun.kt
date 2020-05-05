package com.example.yuanzhiwu.kotlin

class BehaviorRun : Behavior {
    override fun fly(): String {
        return "飞不起来"
    }

    override fun swim(): String {
        return "望洋兴叹"
    }

    override fun run(): String {
        return "只能奔跑了"
    }
}