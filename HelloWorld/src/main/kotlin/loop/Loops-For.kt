//Created by canVarli on 7/4/2024.

package org.example.loop

/**
 * For döngüsü, belirli bir aralıktaki değerler üzerinde döngü yapmak için kullanılır.
 * 3 Farklı şekilde kullanılabilir.
 * value in list                    şeklinde value değerlerini döndürür.
 * index in list.indices            şeklinde index değerlerini döndürür.
 * (index, value) in list.withIndex() şeklinde index ve value değerlerini döndürür.
 */

fun main() {
    // 1. value in list şeklinde kullanım
    for (value: Int in 1..5) { // 1,2,3,4,5
        println(value)
    }

    // 2. index in list.indices şeklinde kullanım
    val countryCodeArray = arrayOf("TR", "US", "UK", "DE")

    for (value in countryCodeArray) { // TR, US, UK, DE
        println(value)
    }

    for (index in countryCodeArray.indices) { // 0, 1, 2, 3
        println("$index. index: ${countryCodeArray[index]}")
    }

    // 3. (index, value) in list.withIndex() şeklinde kullanım
    // Bunun adı destructuring declaration'dır.
    for ((index, value) in countryCodeArray.withIndex()) {
        println("$index. index: $value")
    }

    /*********************************************
     * Repeat ile herhangi bir değeri belirli sayıda tekrar etmek için kullanılır.
     * Bu inline bir higher-order function'dır.
     */
    repeat(5) { // 5 defa "Merhaba" yazdırır.
        println("Merhaba")

    }

    /*************************************
     * Break, Continue ve Return
     * Break: Döngüyü sonlandırmak için kullanılır.
     * Continue: Döngüde bir sonraki adıma geçmek için kullanılır.
     * Return: Döngüyü sonlandırır ve fonksiyonu sonlandırır.
     */
    for (i in 1..5) {
        if (i == 2) {
            break // 2. adımda döngüyü sonlandırır.
        }
        println(i)
    }

    for (i in 1..5) {
        if (i == 2) {
            continue // 2. adımda döngüde bir sonraki adıma geçer.
        }
        println(i)
    }

    for (i in 1..5) {
        if (i == 2) {
            return // 2. adımda döngüyü ve fonksiyonu sonlandırır.
        }
        println(i)
    }

    /**************************************************
     * İç içe for döngüsü, bir döngü içinde başka bir döngü kullanmaktır.
     */
    for (i in 1..3) {
        for (j in 1..3) {
            println("$i * $j = ${i * j}")
        }
    }

    // Normalde break sadece içteki döngüyü sonlandırır.
    // Ancak returnLabel ile dıştaki döngüyü de sonlandırabiliriz.
    // İç içe for döngüsünde retrun label kullanmak mantıklı oluyor.
    returnLabel@ for (i in 1..3) {
        for (j in 1..3) {
            if (i == 2) { // i = 2 olduğunda tüm döngüyü sonlandırır.
                break@returnLabel
            }
            println("$i * $j = ${i * j}")
        }
    }
}