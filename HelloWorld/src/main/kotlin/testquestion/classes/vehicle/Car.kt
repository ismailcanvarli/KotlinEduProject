//Created by canVarli on 7/17/2024.

package org.example.testquestion.classes.vehicle

class Car(wheelCount: Int, seatCount: Int, val numberOfDoors: Int) : Vehicle(wheelCount, seatCount) {

    override fun startEngine() {
        println("Araba çalıştırılıyor.")
    }

    override fun stopEngine() {
        println("Araba durduruluyor..")
    }
}