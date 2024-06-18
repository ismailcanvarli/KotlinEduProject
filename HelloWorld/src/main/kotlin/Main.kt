package org.example

fun main() {

    val name: String = "Kotlin"
    val surname: String
    val age = 10

    var isMale = true

    val message : String? = null

    val number = null  // Böyle yaparsan tip Nothing? olur

    var result: Int? = 0
    result!!.plus(32) //Burada null olma ihtimali var ama !! ile null olmayacağını belirttik
    result?.plus(32) //Burada null ise işlem yapmaz null değilse işlem yapar

}