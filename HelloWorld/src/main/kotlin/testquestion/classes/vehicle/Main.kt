//Created by canVarli on 7/17/2024.

package org.example.testquestion.classes.vehicle

/**
 * Abstract Sınıf Kullanımı Sorusu
 * Bir Vehicle adlı abstract sınıf oluşturun.
 * Bu sınıfın içinde startEngine ve stopEngine adlı iki abstract metot olsun.
 * Bu abstract sınıfı kullanarak Car ve Motorcycle sınıflarını türetin
 * ve gerekli metotları implement edin.
 * Ayrıca, Car sınıfında numberOfDoors ve Motorcycle sınıfında
 * hasSidecar gibi özellikler ekleyin.
 */

fun main() {
    val car = Car(4, 5, 4)
    val motorcycle = Motorcycle(2, 2, false)

    car.startEngine()
    println("Bu araç ${car.numberOfDoors} kapılı, ${car.wheelCount} tekerlekli ve ${car.seatCount} koltukludur.")
    car.stopEngine()

    motorcycle.startEngine()
    println("Bu araç ${motorcycle.wheelCount} tekerlekli ve ${motorcycle.seatCount} koltukludur.")
    motorcycle.stopEngine()

}