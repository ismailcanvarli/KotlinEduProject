//Created by canVarli on 7/3/2024.

package org.example.controlflow

fun main() {

    // When kontrol yapısı
    val countryCode = readln()
    when (countryCode.lowercase()) {
        "tr", "az" -> {
            println("Türkiye - Azerbaycan")
        }

        "us" -> println("Amerika")
        "de" -> println("Almanya")
        else -> println("Bilinmeyen ülke")
    }

    //When'de is kullanımı
    val number = 10
    when (number) {
        is Int -> println("Number is integer")
        else -> println("Number is not integer ")
    }

    //When'de range kullanımı
    val score = 85
    when (score) {
        in 0..50 -> println("F")
        in 51..70 -> println("D")
        in 71..85 -> println("C")
        in 86..100 -> println("A")
        else -> println("Invalid score")
    }

}