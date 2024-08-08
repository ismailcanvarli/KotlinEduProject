//Created by canVarli on 8/8/2024.

package org.example.objects

// companion object kullanımı
class SingletonClass {
    companion object {
        var singletonVariable = "Singleton Variable"

        fun singletonFunction() {
            println("Singleton Function")
        }
    }

    fun normalFunction() {
        println("Normal Function")
    }
}

fun main() {
    SingletonClass.singletonVariable = "Singleton Variable"
    println(SingletonClass.singletonVariable)
    SingletonClass.singletonFunction()
    SingletonClass().normalFunction()
}