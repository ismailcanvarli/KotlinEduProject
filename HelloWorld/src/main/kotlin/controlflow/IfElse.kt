//Created by canVarli on 7/3/2024.

package org.example.controlflow

fun main() {
    // İf, else ve else if
    var number = 10
    if (number > 0) {
        println("Number is positive")
    } else if (number < 0) {
        println("Number is negative")
    } else {
        println("Number is zero")
    }

    // Kontrol yapılarının fonksiyon olarak kullanımı
    println(number.compareTo(0)) // 1 (number > 0)
    println(number.compareTo(20)) // -1 (number < 20)
    println(number.compareTo(10)) // 0 (number == 10)
    println(number.equals(0)) // false (number != 0)

    // statement kullanımı: if bloğu bir sonuç döndürmez
    if (number > 0) {
        println("Number is positive")
    } else {
        println("Number is negative")
    }

    // expression kullanımı: {} içindeki son satır ifadenin değeri olur
    val result = if (number > 0) {
        "Number is positive"
    } else {
        "Number is negative"
    }

    // İç içe else if kullanırken birbiriyle alakasız olan şeyleri kontrol etmemek gerekiyor.
    // Örneğin, bir sayının pozitif olup olmadığını kontrol ederken, sayının 0 olup olmadığını kontrol etmeye gerek yok.

}