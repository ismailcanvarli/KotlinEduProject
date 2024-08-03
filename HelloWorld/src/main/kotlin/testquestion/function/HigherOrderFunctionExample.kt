//Created by canVarli on 8/3/2024.

package org.example.testquestion.function

// Higher-order fonksiyon tanımı: iki sayıyı işleyen bir fonksiyon
fun operate(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}

fun main() {
    // Toplama işlemi için lambda fonksiyonu
    val sum = operate(5, 3) { x, y -> x + y }
    println("Sum: $sum") // Çıktı: Sum: 8

    // Çarpma işlemi için lambda fonksiyonu kullanımı
    val product = operate(5, 3) { x, y -> x * y }
    println("Product: $product") // Çıktı: Product: 15
}