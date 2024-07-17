//Created by canVarli on 7/17/2024.

package org.example.testquestion.classes.appliance

class WashingMachine(override val brand: String, override val model: String) : Appliance {
    override fun turnOn() {
        println("Çamaşır makinesi açıldı.")
    }

    override fun turnOff() {
        println("Çamaşır makinesi  kapatıldı.")
    }
}