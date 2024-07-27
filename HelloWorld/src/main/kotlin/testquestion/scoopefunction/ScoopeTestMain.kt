//Created by canVarli on 7/27/2024.

package org.example.testquestion.scoopefunction

data class User(var name: String, var age: Int, var email: String?)

fun main() {
    val user = User(name = "John Doe", age = 30, email = null)

    // 'apply' fonksiyonunu kullanarak 'user' nesnesinin email'ini güncelleyin ve yazdırın.
    // Email: "john.doe@example.com"

    user.apply {
        email = "john.doe@example.com"
    }.also {
        println("Updated email: ${it.email}")
    }

    // 'let' fonksiyonunu kullanarak email'i null değilse uzunluğunu yazdırın.
    user.email?.let {
        println("Email length: ${it.length}")
    }
}