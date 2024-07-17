//Created by canVarli on 7/17/2024.

package org.example.testquestion.classes.appliance

interface Appliance {
    val brand: String
    val model: String

    fun turnOn()
    fun turnOff()

}