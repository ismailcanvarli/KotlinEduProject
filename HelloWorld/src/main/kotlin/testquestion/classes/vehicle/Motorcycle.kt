//Created by canVarli on 7/17/2024.

package org.example.testquestion.classes.vehicle

class Motorcycle(wheelCount: Int, seatCount: Int, val hasSideCar: Boolean) : Vehicle(wheelCount, seatCount) {

    override fun startEngine() {
        println("Motor çalıştırılıyor.")
    }

    override fun stopEngine() {
        println("Motor durduruluyor.")
    }
}