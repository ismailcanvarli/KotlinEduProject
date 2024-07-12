//Created by canVarli on 7/12/2024.

package org.example.testquestion.classes

/**
 * Bir Vehicle sınıfı oluşturun.
 * Bu sınıfın make, model ve year isimli değişkenleri ve bir startEngine metodu olsun.
 * Car isimli bir sınıf oluşturun ve Vehicle sınıfından miras alsın.
 * Car sınıfına isConvertible isimli bir değişken ekleyin ve startEngine metodunu override
 * ederek, aracın üstünün açık olup olmadığını kontrol eden bir mesaj yazdırın.
 * Bu sınıfın kullanımını gösteren bir örnek yazın.
 */

// Miras verebilmesi için open olması lazım
open class Vehicle(val make: String, val model: String, val year: Int) {
    open fun startEngin() {
        println("Motor çalıştırıldı.")
    }
}

class Car(make: String, model: String, year: Int, val isConvertible: Boolean) : Vehicle(make, model, year) {
    override fun startEngin() {
        super.startEngin()
        if (isConvertible) {
            println("Bu araba üstü açık bir araba.")
        } else {
            println("Bu araba üstü açık bir araba değil.")
        }
    }
}

fun main() {
    val vehicle = Vehicle("Toyota", "Corolla", 2024)
    val car = Car("Honda", "Civic", 2018, false)

    vehicle.startEngin()
    car.startEngin()
}