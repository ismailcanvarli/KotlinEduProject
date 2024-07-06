//Created by canVarli on 7/6/2024.

package org.example.function

/**
 * Function Scope (Fonksiyon Kapsamı)
 * {} süslü parantezler arasında kalan alan fonksiyonun kapsamını oluşturur.
 * Top level yazım şeklinde fonksiyon tanımlanmışsa, fonksiyonun kapsamı dosya seviyesinde olur.
 */

/**
 * Fonksiyon içinde fonksiyon tanımlanabilir. Bunlara local fonksiyonlar denir.
 * Local fonksiyonlar reflection işlemlerinde de kullanılamazlar.
 */


fun main() {

    //Local Function
    fun printName(name: String) {
        println("Name: $name")
    }

    printName("Can Varlı")
}