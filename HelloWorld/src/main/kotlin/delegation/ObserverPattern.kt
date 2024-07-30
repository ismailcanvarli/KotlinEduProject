//Created by canVarli on 7/30/2024.

package org.example.delegation

/**
 * Observer Pattern: Bir nesnenin durumunda değişiklik olduğunda, bağımlı olan diğer nesnelerin
 * otomatik olarak haberdar edilmesini sağlayan bir tasarım desenidir.
 *
 * Burada biz manuel olarak bir observer pattern uygulaması yapacağız.
 */

interface PropertyObserver {
    // eski değeri ve yeni değerinide parametre olarak alır.
    fun onPropertyChanged(oldValue: Int, newValue: Int)
}

class ObservableProperty(var balance: Int) {
    // Birden fazla observer olabileceği için bir liste oluşturuyoruz.
    val observers = mutableListOf<PropertyObserver>()

    fun setValue(newValue: Int) {
        if (newValue != balance) {
            val tempOldValue = balance
            balance = newValue
            notifyObservers(tempOldValue, newValue)
        }
    }

    fun addObserver(observer: PropertyObserver) {
        observers.add(observer)
    }

    private fun notifyObservers(oldValue: Int, newValue: Int) {
        for (observer in observers) {
            observer.onPropertyChanged(oldValue, newValue)
        }
    }
}

class BankAccount : PropertyObserver {
    override fun onPropertyChanged(oldValue: Int, newValue: Int) {
        println("Balance changed from $oldValue to $newValue")
    }
}

fun main() {
    val observableProperty = ObservableProperty(0)
    val bankAccount = BankAccount()

    observableProperty.addObserver(bankAccount)
    observableProperty.setValue(1000) // Balance changed from 0 to 1000
    observableProperty.setValue(2000) // Balance changed from 1000 to 2000
    // Observer'ları temizleyerek hiçbir observer'ın haberdar olmamasını sağlayabiliriz.
    // observableProperty.observers.clear()
}