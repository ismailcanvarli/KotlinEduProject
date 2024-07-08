//Created by canVarli on 7/8/2024.

package org.example.function

/**
 * Higher Order Functions (Yüksek Düzey Fonksiyonlar) (HOF)
 * Fonksiyonları parametre olarak alan ve/veya fonksiyon döndüren fonksiyonlardır.
 * Lambda fonksiyonlar ile birlikte kullanıldığında daha güçlü bir yapı oluştururlar.
 * Higher Order Functions, fonksiyonları birer veri tipi gibi kullanmamızı sağlar.
 * Kullanma amacımız daha okunabilir, test edilebilir ve daha az kod yazmaktır.
 */

fun main() {
    calculateAndPrintNormal(5, 3, '+')
    calculateAndPrintNormal(5, 3, '-')

    // Lambda fonksiyonlar
    // Burada yukarıdaki fonksiyonları lambda fonksiyonlar ile daha kısa bir şekilde yazabiliriz.
    // Fonksiyonun body'sini direk burada yazmış oluyoruz.
    // CalculateAndPrint fonksiyonunun body'si parametre olarak gönderdiğimiz
    // lambda fonksiyonun body'si olur.
    calculateAndPrint(5, 3) { number1, number2 -> number1 + number2 }
    calculateAndPrint(5, 3) { number1, number2 -> number1 - number2 }

    /**
     * HOF tanımlama yöntemleri
     * 1. Lambda İfadeleri ile
     * 2. Fonksiyon Referansları ile
     * 3. Anonim Fonksiyonlar ile
     */

    // 1. Lambda İfadeleri ile Higher-Order Fonksiyonlar
    fun ikiyeKatla1(f: (Int) -> Int): (Int) -> Int {
        return { x -> 2 * f(x) }
    }

    val karesi1: (Int) -> Int = { x -> x * x }
    val karesiIkiyeKatla1 = ikiyeKatla1(karesi1)

    println("Lambda İfadeleri ile:")
    println(karesiIkiyeKatla1(3))  // Output: 18
    println(karesiIkiyeKatla1(4))  // Output: 32

    // 2. Fonksiyon Referansları ile Higher-Order Fonksiyonlar
    val karesiIkiyeKatla2 = ikiyeKatla2(::karesi2)

    println("Fonksiyon Referansları ile:")
    println(karesiIkiyeKatla2(3))  // Output: 18

    // 3. Anonim Fonksiyonlar ile Higher-Order Fonksiyonlar
    // Bu çok az kullanılır.
    fun ikiyeKatla3(f: (Int) -> Int): (Int) -> Int {
        return fun(x: Int): Int {
            return 2 * f(x)
        }
    }

    val karesi3 = fun(x: Int): Int {
        return x * x
    }

    val karesiIkiyeKatla3 = ikiyeKatla3(karesi3)

    println("Anonim Fonksiyonlar ile:")
    println(karesiIkiyeKatla3(3))  // Output: 18
    println(karesiIkiyeKatla3(4))  // Output: 32

}

fun calculateAndPrintNormal(number1: Int, number2: Int, operation: Char) {
    val result = when (operation) {
        '+' -> number1 + number2
        '-' -> number1 - number2
        '*' -> number1 * number2
        '/' -> number1 / number2
        else -> throw IllegalArgumentException("Invalid operation")
    }
    println("Result: $result")
}

// Fonksiyon başka bir fonksiyona parametre olarak gönderilebilir.
// Bu fonksiyonlara Higher Order Functions denir.
fun calculateAndPrint(number1: Int, number2: Int, operation: (number1: Int, number2: Int) -> Int) {
    // Operation fonksiyonu parametre olarak gönderilen fonksiyonu temsil eder.
    // Bu fonksiyonun body'sini paramtere olarak gönderdiğimiz fonksiyonun body'si oluşturur.
    val result = operation(number1, number2)
    println("Result: $result")
}

// Bu fonksiyonun body'sini böyle yazmadıkta yukarıdaki gibi lambda fonksiyonlar ile yazdık.
//fun operation(number1: Int, number2: Int): Int {
// return number1 + number2
//}

fun karesi2(x: Int): Int {
    return x * x
}

// Higher-Order Fonksiyonlar
// Bu fonksiyon bir fonksiyon alır ve geriye bir fonksiyon döner.
fun ikiyeKatla2(f: (Int) -> Int): (Int) -> Int {
    return { x -> 2 * f(x) }
}
