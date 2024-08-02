package org.example.controlflow

fun main() {
    var a = 10
    val b = 5

    // Operatörler
    println("a++ = ${a++}") // 10
    println("++a = ${++a}") // 12
    println("a-- = ${a--}") // 12
    println("--a = ${--a}") // 10

    // Operatör fonksiyonlarının kullanım sebepi
    //Eğer değerlerden birisi veya her ikisi null ise normal operatörler kullanılamaz
    println(a.plus(b)) // 15
    println(a.minus(b)) // 5
    println(a % b) // 0
    println(a / b) // 2

    println(a > b) // true
    println(a < b) // false
    println(a >= b) // true
    println(a <= b) // false
    println(a == b) // false
    println(a != b) // true

    var number1 = 10
    var number2 = 20
    var flag = true
}