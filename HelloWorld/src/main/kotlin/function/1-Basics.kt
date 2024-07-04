//Created by canVarli on 7/4/2024.

package org.example.function

import kotlin.math.pow

/**
 * Function (Fonksiyonlar) : Bir işlemi gerçekleştiren kod bloklarıdır.
 * Fonksiyonlar, kodun tekrar kullanılabilirliğini sağlar.
 * fun keywordü ile tanımlanır.
 * Fonksiyonlar parametre alabilir ve geriye değer döndürebilir.
 * Geri dönüş değeri olmayan fonksiyonlar Unit tipinde döner.
 * Unit tipi Java'daki void'e karşılık gelir.
 */

// main fonksiyonu: Parametre almayan ve geriye değer döndürmeyen fonksiyondur.
fun main() {

    // Fonksiyon çağrısı
    println("Square: ${square(5)}")

    // Fonksiyonlarda default argüman kullanımı
    // Fonksiyon Overloading yapmış olduk.
    println("Default argüman: ${defaultArgument()}")
    println("Default argüman: ${defaultArgument(5)}")
    //Buna da name argüment ile çağırma denir.
    println("Default argüman: ${defaultArgument(power = 3)}")

    // Default argüman ile fonksiyon çağrısı
    println("Default argüman: ${defaultArgument(5, 3)}")

    /**
     * Fonksiyonlarda varargs kullanımı
     * Varargs, fonksiyonlara değişken sayıda argüman göndermemizi sağlar.
     * Eğer kaç tane argüman gönderileceği belli değilse varargs kullanılabilir.
     * Ancak bir fonksiyonunda paramtere sayısı çok fazla olmamalıdır.
     */

    // vararg'tan sonra başka tipte parametre verilirken isimlendirilmiş argüman kullanılmalıdır.
    varargsFunction(1, name = "ASD") // 1
    varargsFunction(1, 2, 3, 4, 5) // 1, 2, 3, 4, 5
    varargsFunction(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

}

// Karesini alan fonksiyon
fun square(number: Int): Int {
    return number * number
}

// Default argüman alan fonksiyon
// Eğer power parametresi verilmezse, power değeri 2 olacaktır.
fun defaultArgument(number: Int = 4, power: Int = 2): Int {
    return number.toDouble().pow(power.toDouble()).toInt()
}

// Varargs kullanımı farklı değişkenlerle
fun varargsFunction(vararg numbers: Int, name: String = "Can") {
    for (number in numbers) {
        println(number)
    }
    println("Name: $name")
}
