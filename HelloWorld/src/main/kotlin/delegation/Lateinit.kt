//Created by canVarli on 7/30/2024.

package org.example.delegation

/**
 * Late initialization: lateinit ile tanımlanan property'lerin değeri sadece
 * tanımlandığı andan itibaren erişilebilir hale gelir.
 *
 * lateinit ile tanımlanan property'lerin değeri null olamaz.
 * lateinit ile tanımlanan property'lerin değeri sadece var olabilir.
 */

class MyClass {
    private lateinit var lateInitProperty: String

    fun initailize() {
        lateInitProperty = "Initialized"
    }

    fun printProperty() {
        // Eğer lateInitProperty henüz başlatılmadıysa, bir exception fırlatılır.
        // isInitialized ile property'nin başlatılıp başlatılmadığını kontrol edebiliriz.
        // Eğer başlatılmadıysa, exception fırlatmadan önce kontrol edebiliriz.
        if (::lateInitProperty.isInitialized) {
            println(lateInitProperty)
        } else {
            initailize()
            printProperty()
        }
    }
}

fun main() {
    val myClass = MyClass()
    myClass.printProperty() // Çıktı: Initialized

    myClass.initailize()
    myClass.printProperty() // Çıktı: Initialized
}