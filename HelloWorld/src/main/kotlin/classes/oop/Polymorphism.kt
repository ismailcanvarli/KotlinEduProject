//Created by canVarli on 8/5/2024.

/**
 * Polymorphism (Çok biçimlilik)
 */
package org.example.classes.oop

open class Shape {
    open fun draw() {
        println("Drawing a shape.")
    }
}

class Circle : Shape() {
    override fun draw() {
        println("Drawing a circle.")
    }
}

class Square : Shape() {
    override fun draw() {
        println("Drawing a square.")
    }
}

fun main() {
    val shapes: List<Shape> = listOf(Circle(), Square())
    for (shape in shapes) {
        shape.draw()
    }
}
