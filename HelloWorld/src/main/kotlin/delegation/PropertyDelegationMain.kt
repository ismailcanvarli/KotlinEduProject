//Created by canVarli on 7/29/2024.

package org.example.delegation

/**
 * By kullanarak property delegation
 * Separate of concerns (Endişeleri ayırma)
 * User sınıfı verileri yönetirken, Database sınıfı verileri saklar.
 * Delegate sınıfı veritabanı işlemlerini yapar.
 */

// db her iki örnek içinde aynı
class Database {
    private val data = mutableMapOf<String, String>()

    fun saveData(key: String, value: String) {
        data[key] = value
        println("Saved '$value' with key '$key' to the database")
    }

    fun loadData(key: String): String {
        return data[key] ?: "No data found"
    }
}

// Eğer db'de bir değişiklik olursa bu değişiklik User'a da yansır.
// DatabaseDelegate class'ı User class'ına delegate edilmiştir.
// Set ve get fonksiyonları birer operator fonksiyonlardır. (minus gibi)
// Bu sınıfta getValue ve setValue fonksiyonları overload edilmiştir.
class DatabaseDelegate(private val db: Database, private val key: String) {
    operator fun getValue(thisRef: Any?, property: Any?): String {
        return db.loadData(key)
    }

    operator fun setValue(thisRef: Any?, property: Any?, value: String) {
        db.saveData(key, value)
    }
}

// Name ve email property'lerini DatabaseDelegate ile delegate ediyoruz.
class User(db: Database) {
    var name: String by DatabaseDelegate(db, "name")
    var email: String by DatabaseDelegate(db, "email")
}

fun main() {
    val db = Database()
    val user = User(db)

    user.name = "John"
    user.email = "asd@gmail.com"

    println("Name: ${user.name}")
    println("Email: ${user.email}")
}