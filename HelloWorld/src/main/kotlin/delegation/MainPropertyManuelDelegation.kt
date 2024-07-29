//Created by canVarli on 7/29/2024.

package org.example.delegation

/**
 * Property delegation manuel kısmı
 */

class Database2 {
    private val data = mutableMapOf<String, String>()

    fun saveData(key: String, value: String) {
        data[key] = value
        println("Saved '$value' with key '$key' to the database")
    }

    fun loadData(key: String): String {
        return data[key] ?: "No data found"
    }
}

// Manuel Delegation yapılan kısım
class User2(private val db: Database2) {
// Alt çizgi ile yapma amacımız bunu cache gibi kullanıyoruz.
// Bunu yapmamızın sebebi her seferinde db ye sorgu atmamak.
    private var _name: String? = null
    private var _email: String? = null

    var name: String
        get() {
            if (_name == null) {
                _name = db.loadData("name")
            }
            return _name ?: "No name found"
        }
        set(value) {
            _name = value
            db.saveData("name", value)
        }

    var email: String
        get() {
            if (_email == null) {
                _email = db.loadData("email")
            }
            return _email ?: "No email found"
        }
        set(value) {
            _email = value
            db.saveData("email", value)
        }
}

fun main() {
    val db = Database2()
    val user = User2(db)

    user.name = "John"
    user.email = "asd@gmail.com"

    println("Name: ${user.name}")
    println("Email: ${user.email}")
}