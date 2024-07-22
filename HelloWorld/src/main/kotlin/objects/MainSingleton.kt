//Created by canVarli on 7/22/2024.

package org.example.objects

/**
 * Singleton object sadece bir tane instance'a sahip olabilir.
 * Kotlin de Singleton object tanımlamak için object keyword'ü kullanılır.
 * Singleton object'ler class'lar gibi constructor'a sahip olamazlar.
 * Java da yazdığımız o kod bloklarını kotlin kendisi halleder.
 */

// Objenin declaration kullanımı yada singleton kullanımıda denir.
object Retrofit {
    var baseUrl = "https://api.github.com"

}

fun main() {
    Retrofit.baseUrl = "https://api.github.com"

}