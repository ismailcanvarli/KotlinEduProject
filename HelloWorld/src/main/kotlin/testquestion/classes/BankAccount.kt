//Created by canVarli on 7/12/2024.

package org.example.testquestion.classes


/**
 * Bir BankAccount sınıfı oluşturun. Bu sınıfın accountNumber ve balance isimli
 * iki değişkeni olsun. balance değişkenine yalnızca sınıf içinden erişilebilsin.
 * deposit ve withdraw isimli iki metot ekleyin.
 * deposit metodu sadece pozitif miktarları kabul etsin ve
 * withdraw metodu bakiyeyi aşan miktarları çekmeye çalıştığında bir hata fırlatsın.
 *
 * Bu sınıfın kullanımını gösteren bir örnek yazın.
 */

class BankAccount(val accountNumber: String) {
    private var balance: Double = 0.0

    fun deposit(amount: Double) {
        if (amount > 0) {
            balance += amount
        } else {
            println("Ekleyeceğiniz bakiyeyi yanlış girdiniz.")
        }
    }

    fun withdraw(amount: Double) {
        if (amount <= balance) {
            balance -= amount
        } else {
            println("Çekmek istediğiniz tutarda paranız yok. " + getBalance())
        }
    }

    fun getBalance(): Double {
        return balance
    }
}

fun main() {
    var customer1 = BankAccount("111")

    println("${customer1.accountNumber} nolu müşterinin bakiyesi ${customer1.getBalance()}")

    customer1.deposit(500.0)
    customer1.withdraw(250.0)

    println("${customer1.accountNumber} nolu müşterinin bakiyesi ${customer1.getBalance()}")

    customer1.deposit(-5.0)
    customer1.withdraw(5000.0)

    println("${customer1.accountNumber} nolu müşterinin bakiyesi ${customer1.getBalance()}")

}