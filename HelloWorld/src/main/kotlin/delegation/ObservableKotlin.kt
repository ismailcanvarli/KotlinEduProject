//Created by canVarli on 7/30/2024.

package org.example.delegation

import kotlin.properties.Delegates

/**
 * Burada observable'ı kotlinde kullanıldığı gibi kullanacağız.
 */

class User3{
    // Delegates.observable() fonksiyonu, bir değişkenin değeri değiştiğinde bir işlem yapmamızı sağlar.
    // Bir initial Value ve bir lambda fonksiyonu alır.
    var name: String by Delegates.observable("no name") { property, oldValue, newValue ->
        println("Property ${property.name} changed from $oldValue to $newValue")
    }

    var surName: String by Delegates.observable("no surname") { property, oldValue, newValue ->
        println("Property ${property.name} changed from $oldValue to $newValue")
    }

    // vetoable ile değeri değiştirmeden önce bir koşul kontrolü yapabiliriz.
    var age: Int by Delegates.vetoable(0) { property, oldValue, newValue ->
        println("Property ${property.name} changed from $oldValue to $newValue")
        newValue >= 18
    }
}

fun main() {
    val user = User3()
    user.name = "Can"
    user.surName = "Varlı"
    user.age = 20
    user.age = 15
    println("Age: ${user.age}")

    user.name = "Alice"
    println("Name: ${user.name}")
    println("Surname: ${user.surName}")
}