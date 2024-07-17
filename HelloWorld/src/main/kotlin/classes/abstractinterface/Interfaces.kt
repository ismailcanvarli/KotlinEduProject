//Created by canVarli on 7/16/2024.

package org.example.classes.abstractinterface

/**
 * Interface (arayüz)
 * Bir şeyi yapabilme yeteneğini tanımlar.
 * Abstraction (soyutlama) yapmak için kullanılır.
 * Soyut sınıflar gibi nesne oluşturulamaz.
 * Genelde en az bir metodu olur.
 * Constructor'ı yoktur.
 * Fonksiyonların body'si (gövdesi) olmaz. Alt sınıflar tarafından implemente edilir.
 * Bir sınıf birden fazla interface'i implemente edebilir.
 * Bir interface başka bir interface'i extend edebilir.
 * Interface'lerde final kullanılamaz. (Çünkü hepsi override edilmek zorunda)
 */
interface Shape {

    // İnterface ve abstract farkı
    // Property tanımlanabilir ama değer ataması yapamayız. Sadece get metodu olur.
    var name: String
    fun asd(a: Int)
    fun area(): Double
    fun perimeter(): Double

    // Body'si olan bir fonkiyon tanımlarsak
    // alt sınıflar bu fonksiyonu override etmek zorunda değil.
    fun funWithBody() {
        println("This is a function with body")
    }
}

// Bir interface'i implemente edebiliriz
interface ChildShape : Shape {
    fun childFunction()
}

// Bir sınıf birden fazla interface'i implemente edebilir.
class Circle : Shape, ChildShape {
    override var name: String = "Circle"

    override fun asd(a: Int) {
        println("asd")
    }

    override fun area(): Double {
        return 3.14
    }

    override fun perimeter(): Double {
        return 3.14
    }

    override fun childFunction() {
        println("Child function")
    }
}

fun main() {
    // Objenin expression kullanımı
    val shape = object : Shape {
        override var name: String = "Shape"
        override fun asd(a: Int) {
            println("asd")
        }

        override fun area(): Double {
            TODO("Not yet implemented")
        }

        override fun perimeter(): Double {
            TODO("Not yet implemented")
        }
    }

    shape.asd(1) // asd
    shape.funWithBody() // This is a function with body

    val circle = Circle() // Circle
    circle.childFunction() // Child function
    circle.funWithBody() // This is a function with body

}