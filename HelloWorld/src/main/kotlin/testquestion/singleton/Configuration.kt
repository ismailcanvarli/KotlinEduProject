//Created by canVarli on 7/23/2024.

package org.example.testquestion.singleton

/**
 * Soru:
 * Kotlin'de Singleton Pattern kullanarak bir Configuration sınıfı oluşturun.
 * Bu sınıf, uygulama konfigürasyon ayarlarını tutmak için kullanılacaktır.
 *
 * Aşağıdaki gereksinimleri karşılayacak bir Configuration sınıfı yazınız:
 *
 * Ayarları Saklama: apiKey ve timeout gibi iki konfigürasyon ayarını saklamalıdır.
 * Ayarları Erişme: Bu ayarları almak için getter metodları sağlamalıdır.
 * Singleton Yapı: Configuration sınıfı Singleton Pattern ile oluşturulmalıdır,
 * böylece uygulama genelinde tek bir örnek kullanılmalıdır.
 * Bir örnek kullanım ile bu sınıfın nasıl çalıştığını gösteriniz.
 */


object Configuration {
    private val apiKey: String = "123456789"
    private val timeout: Int = 30

    fun getApiKey(): String {
        return apiKey
    }

    fun getTimeout(): Int {
        return timeout
    }
}

fun main() {
    val timeout = Configuration.getTimeout()
    val apiKey = Configuration.getApiKey()

    println("$timeout $apiKey")
}