//Created by canVarli on 7/8/2024.

package org.example.testquestion.higherorderfunction

/**
 * Bir liste ve bir dönüştürücü fonksiyon alan ve her bir öğeyi dönüştüren bir higher-order fonksiyon yaz.
 *
 * transformList adında bir higher-order fonksiyon yaz.
 * Bu fonksiyon, bir tamsayı listesi (List<Int>) ve bir dönüştürücü fonksiyon ((Int) -> Int) parametre olarak almalı.
 * Fonksiyon, her bir öğeyi dönüştürüp yeni bir liste olarak döndürmeli.
 */

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)
    // Higher-order function çağrısı
    val result = transformList(numbers) { number -> number * 2 }

    println(result)  // Output: [2, 4, 6, 8, 10]
}

// Higher-order function
// Bir liste ve bir dönüştürücü fonksiyon alan ve her bir öğeyi dönüştüren bir higher-order fonksiyon
fun transformList(list: List<Int>, transformer: (Int) -> Int): List<Int> {
    val result = arrayListOf<Int>()

    for (item in list) {
        result.add(transformer(item))
    }

    return result
}