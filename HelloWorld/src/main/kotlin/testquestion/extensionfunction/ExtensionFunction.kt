//Created by canVarli on 7/8/2024.

package org.example.testquestion.extension

fun main() {
    val user = User("can", 22)

    //User sınıfına eklediğimiz fonksiyonu kullanıyoruz.
    println(user.upperCaseName())
}

// Extension fonksiyon tanımlıyoruz.
// User sınıfa herhangi bir değişiklik yapmadan yeni bir fonksiyon eklemiş olduk.
fun User.upperCaseName(): String {
    return this.name.uppercase()
}