//Created by canVarli on 7/8/2024.

package org.example.testquestion.higherorderfunction

/**
 * Bir dizi metin ve bir filtreleme fonksiyonu alan bir higher-order fonksiyon yaz.
 *
 * filterStrings adında bir higher-order fonksiyon yaz.
 * Bu fonksiyon, bir dizi metin (Array<String>) ve bir filtreleme fonksiyonu ((String) -> Boolean) parametre olarak almalı.
 * Fonksiyon, verilen filtreleme fonksiyonuna göre metin dizisini filtreleyip yeni bir liste olarak döndürmeli.
 */

fun main() {
    val texts = arrayOf("apple", "banana", "orange", "grape", "kiwi")

    // Filtreleme fonksiyonu: Uzunluğu 5 karakterden fazla olanları filtrele
    // buradaki {} içi filter fonksiyonu oluyor.
    val result = filterStrings(texts) { text -> text.length > 5 }

    println(result.joinToString(", "))  // Output: banana, orange
}

// Higher-order function
// Bir dizi metin ve bir filtreleme fonksiyonu alan bir higher-order fonksiyon
fun filterStrings(texts: Array<String>, filter: (String) -> Boolean): List<String> {
    val result = arrayListOf<String>()

    for (text in texts) {
        if (filter(text)) {
            result.add(text)
        }
    }

    return result
}
