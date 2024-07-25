//Created by canVarli on 7/24/2024.

package org.example.reflection

import kotlin.reflect.full.memberProperties
import kotlin.reflect.full.primaryConstructor
import kotlin.reflect.jvm.isAccessible

/**
 * Kolinde genel olarak değişkenler ve fonksiyonlar private değil.
 */
class Account private constructor(val branchName: String, val branchCode: Int) {
    private var balance: Long = 323213232
    private val accountName: String = "örnek hesap"

    private fun sendMoneyFromBalance(senderMoney: Long) {
        balance = balance - senderMoney
    }
}

fun main() {
    //Constructor private olduğu için nesne oluşturmıyoruz.
    //val account: Account = Account()
    // println(account.balance)
    // println(account.accountName)

    /**
     * Burada normalde private sınıflara fonksiyonlara erişememiz gerekiyor.
     * Ancak biz reflect kütüphanesini kullanarak private dahi olsa erişebiliyoruz.
     *
     * Sınıfın referansı üzerinden constructor'ı call diyerek parametreleri verebilyirouz.
     *
     */
    // ::class dediğimizde kotlin KClass haliyle veriyor.
    val constructor = Account::class.primaryConstructor
    constructor?.isAccessible = true
    // Burada contructor'u çağırdık ve type casting ile Account olarak atadık.
    val account: Account = constructor?.call("Maltepe", 34001) as Account
    println(account.branchName)

    // bu şekilde tüm member property'lere eriştik.
    Account::class.memberProperties.forEach {
        println(it.name)
    }
}