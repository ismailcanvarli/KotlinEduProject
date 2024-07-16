//Created by canVarli on 7/16/2024.

package org.example.abstractinterface

/**
 * Abstract Class
 * Constructor'ı olabilir injtection veya başka amaç için kullanılır.
 * Ancak constructor olsada sınıfın nesnesi oluşturulamaz.
 * Abstract sınıfın abstract property ve fonksiyonları olabilir.
 * Abstract sınıfın open property ve fonksiyonları olabilir.
 * Abstract sınıfların abstract property ve fonksiyonları override edilmek zorundadır.
 * Abstract anahtar kelimesi sadece abstract sınıfın içinde kullanılabilir.
 */
abstract class Human(val sex: Boolean) {

    // Abstract sınıflar state tutabilir.
    val eyeColor: String = "Brown"

    // Abstract property tanımlanabilir. Default değer verilemez.
    // override edilmesi zorunludur.
    abstract val name: String

    // Open property tanımlanabilir. Default değer verilebilir.
    open val age: Int = 0

    fun walk() {
        println("Human is walking")
    }

    // Abstract fonksiyon tanımlanabilir. Body'si olmaz.
    abstract fun eat()

    // Open fonksiyon tanımlanabilir.
    open fun sleep() {
        println("Human is sleeping")
    }

}

// Abstract sınıftan miras aldı. Turk normal bir sınıf.
// Eğer bu sınıfta abstract olsaydı override etmemize gerek kalmayacaktı.
open class Turk(sex: Boolean) : Human(sex) {
    // Abstract property override edilmek zorunda.
    override val name: String = "asdasd"

    // Abstract bir fonksiyon override edilmek zorunda.
    override fun eat() {
        println("Turk is eating")
    }

}

// Open olsada olmasa da abstract sınıfın abstract değerlerini override etmek zorunda
open class Italian(sex: Boolean) : Human(sex) {
    override val name: String
        get() = "Italian"

    // final yazarsak alt sınıfta override edilemez.
    final override fun eat() {
        println("Italian is eating")
    }

}

// Bu sınıfın üstünde 2 adet abstract class var.
// Hepsinin abstract property veya fonksiyonlarını almak zorunda
class Ordu : Turk(true) {
    override val name: String
        get() = super.name

}

fun main() {
    val ordu = Ordu()

    ordu.walk() // Human is walking
    ordu.eat() // Turk is eating
    ordu.sleep() // Human is sleeping
    println(ordu.eyeColor) // Brown
    println(ordu.name) // Italian
    println(ordu.age) // 0
}