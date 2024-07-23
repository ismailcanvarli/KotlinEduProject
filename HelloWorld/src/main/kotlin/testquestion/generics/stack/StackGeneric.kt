//Created by canVarli on 7/23/2024.

package org.example.testquestion.generics.stack

/**
 * Soru:
 * Bir Stack sınıfı yazmanızı istiyoruz.
 * Bu sınıf, herhangi bir türde öğeyi tutabilmelidir ve
 * aşağıdaki metodları içermelidir:
 *
 * push: Bir öğeyi yığının tepesine ekler.
 * pop: Yığının tepesindeki öğeyi çıkarır ve döner.
 * peek: Yığının tepesindeki öğeyi döner ama yığından çıkarmaz.
 * isEmpty: Yığının boş olup olmadığını döner.
 */

class StackGeneric<T> {
    private val stack: MutableList<T> = mutableListOf()

    fun push(item: T) {
        stack.add(item)
    }

    fun pop(): T? {
        return if (stack.isNotEmpty()) stack.removeAt(stack.size - 1) else null
    }

    fun peek(): T? {
        return stack.lastOrNull()
    }

    fun isEmpty(): Boolean {
        return stack.isEmpty()
    }
}


fun main() {
    val stack = StackGeneric<Int>()
    println(stack.isEmpty())  // Çıktı: true

    stack.push(1)
    stack.push(2)
    stack.push(3)
    println(stack.isEmpty())  // Çıktı: false

    println(stack.peek())  // Çıktı: 3
    println(stack.pop())   // Çıktı: 3
    println(stack.pop())   // Çıktı: 2
    println(stack.pop())   // Çıktı: 1
    println(stack.isEmpty())  // Çıktı: true
}