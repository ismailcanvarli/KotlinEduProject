//Created by canVarli on 7/4/2024.

/**
 * Döngüler kullanarak asal sayı kontrol eden bir algoritma yazınız.
 *
 *         -Kullanıcıdan sayı alınsın
 *         -For veya while döngüsüyle Asal olup olmadığını kontrol etsin
 *         -kodu kısa ve verimli tutmaya çalışınız
 */

package org.example.testquestion

fun main() {

    val number: Int = readln().toInt()

    if (number < 1) {
        println("Your number need to be bigger then 1")
    } else {
        if (isPrime(number)) {
            println("Your number is a prime number: $number")
        } else {
            println("Your number isn't a prime number: $number")
        }
    }

}

fun isPrime(number: Int): Boolean {

    for (value in 2..(number / 2)) {
        if (number % value == 0) {
            return false
        }
    }
    return true
}

