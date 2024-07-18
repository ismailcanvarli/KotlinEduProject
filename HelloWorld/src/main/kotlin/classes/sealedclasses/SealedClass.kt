//Created by canVarli on 7/18/2024.

package org.example.classes.sealedclasses

/**
 * Sealed class'ta gruplayabildiğimiz verilerle değil
 * Gruplayabilidiğimiz class'larla çalışırız.
 *
 * Visibility modifier'ı kabul eder. (private, public, internal, protected)
 * Primary constructor ve init bloğu yazılabilir.
 * Secondary constructor yazılabilir.
 *
 * Sealed class'lar miras alabilir. Enum miras alamıyordu.
 * Enum gibi nesnesi üretilemez. İnit ve constructor'ı var.
 *
 * Companian object tanımlanabiliyor.
 *
 * Object kullanılabilir.
 */

sealed class Error {
    class NoInternet : Error()
    class ServerError : Error()
    class FileIoError : Error()

    companion object

    // Sealed class'ta object kullanımı
    object RunTimeError : Error()

    // Sealed class'ta fonksiyon tanımlama
    fun errorType() {
        println("Error type")
    }

}

fun main() {
    val error = Error.NoInternet()
    val error2 = Error.ServerError()
    val error3 = Error.FileIoError()
    val error4 = Error.RunTimeError

    error.errorType()
    error2.errorType()
    error3.errorType()
    error4.errorType()

}