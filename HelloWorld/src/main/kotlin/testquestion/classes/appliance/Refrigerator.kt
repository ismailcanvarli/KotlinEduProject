//Created by canVarli on 7/17/2024.

package org.example.testquestion.classes.appliance

class Refrigerator(override val brand: String, override val model: String) : Appliance {

    override fun turnOn() {
        println("Buzdolabı açıldı.")
    }

    override fun turnOff() {
        println("Buzdolabı kapatıldı.")
    }
}