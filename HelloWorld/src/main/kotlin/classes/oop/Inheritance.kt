//Created by canVarli on 7/12/2024.

package org.example.classes.oop

// Kalıtım'a açık olduğunu söylemek için open yazmamız gerekiyor.
// Buradan da bu sınıfın miras alınabilir olduğunu anlayabiliyoruz.
open class Animal(name: String) {
    // Bu alt sınıflarda override edilebilirdir.
    open var name: String = ""
    var feetCount: Int = 0
    var origin: String = ""
    var tailShape: String = ""

    // Fonksiyonlar içinde open yazılabilir. Bu onun override edilebilir olduğunu söyler.
    open fun makeSound(): String {
        return "Hayvan sesi"
    }

    fun eat(): String {
        return ""
    }

}

// Kalıtım alırken o sınıfın constructor parantezinide yazmalıyız.
class Dog : Animal("Zeus") {
    override fun makeSound(): String {
        return "HAV HAV"
    }
}

class Cat : Animal("Lily") {
    override fun makeSound(): String {
        return "Miyav"
    }
}

fun main() {
    val animal = Animal("Hayvan")
    val dog = Dog()
    val cat = Cat()

    // Override ettiğimiz fonksiyon her sınıfta farklı işlem yaptı.
    // İsterserk aynı işlemide yaptırabiliriz.
    println(animal.makeSound()) // Hayvan sesi
    println(dog.makeSound()) // HAV HAV
    println(cat.makeSound()) // Miyav
}