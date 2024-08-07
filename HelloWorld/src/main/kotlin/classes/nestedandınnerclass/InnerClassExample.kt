//Created by canVarli on 8/7/2024.

package org.example.classes.nestedandınnerclass

class Outer {
    private val bar: Int = 1

    inner class Inner {
        fun foo() = bar
    }
}

fun main() {
    val outer = Outer()
    val inner = outer.Inner()
    println(inner.foo()) // prints 1
}