//Created by canVarli on 7/17/2024.

package org.example.testquestion.classes.vehicle

abstract class Vehicle(val wheelCount: Int, val seatCount: Int) {

    abstract fun startEngine()
    abstract fun stopEngine()

}