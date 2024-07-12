//Created by canVarli on 7/12/2024.

package org.example.testquestion.classes

/**
 * Sınıflar ve Constructor Kullanımı
 * Bir Person sınıfı oluşturun. Bu sınıfın primary constructor'ında
 * name ve age isimli iki değişken bulunsun. Ayrıca, bir secondary constructor ekleyin.
 * Bu secondary constructor, sadece name alacak ve age değişkenini
 * varsayılan olarak 18 yapacak.
 *
 * Bu sınıfın kullanımını gösteren bir örnek yazın.
 */
class Person(val name: String, var age: Int) {

    constructor(name: String) : this(name, 18)
}

fun main () {
    val person1 = Person("Hasan", 15)

    val person2 = Person("Ahmet")

    println("${person1.name} ${person1.age}")
    println("${person2.name} ${person2.age}")
}