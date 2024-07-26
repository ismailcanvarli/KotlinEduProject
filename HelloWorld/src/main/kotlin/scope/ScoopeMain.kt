//Created by canVarli on 7/25/2024.

package org.example.scope

data class User(val name: String, val age: Int)

class Student {
    var name: String = ""
    var age: Int = 0

    fun someUserFun(user: User?) {
        // Null check'e ihtiyaç varsa let'i kullan. Boş değilse işlemi yapar.
        user?.let {

        } ?: run {

        }
    }
}

// bunlar bir Higher order function'dır.
fun main() {

    val user = User("Hasan", 29)

//    val student = Student()
//    // Bunun gibi bir sürü değişkeni yazdırma işlemimiz olabilir mesela
//    // Burada problem eğer user nesnesinin adı değişirse bu kod hata verir.
//    println(student.age)
//    println(student.name)
//    println(student.name)
//    println(student.name)
//    println(student.name)

    // Şeklinde tanımla diyor.
    val student = Student().apply {
        name = "Hasan"
        age = 29
    }

    println(user.age)
    println(user.name)




//    val name: String = "asd"
//
//    // T= Önüne gelen değer, R= Son satır
//    //Buradaki it parametrenin kendisidir.
//    // Bu bloktaki son yazılan kod geri dönüş tipi olur.
//    val retrunValueLet = name?.let { it ->
//        println("let $name")
//    }
//    println(retrunValueLet)
//
//    val retrunValueRun = name?.run {
//        println("run $this")
//    }
//    println(retrunValueRun)
//
//    val returnValueRun2 = run {
//        println("run ")
//    }
//    println(returnValueRun2)
//
//    // 2 paramtre var. Birisi name birisi hof body'si.
//    // buna örnek repeat(10){println("asd")}
//    val returnValueWith = with(name) {
//        println("with $this")
//    }
//    println(returnValueWith)
//
//    val returnValueApply = name?.apply {
//        println("apply $this")
//    }
//    println(returnValueApply)
//
//    val returnValueAlso = name?.also {
//        println("also")
//    }
//    println(returnValueAlso)
}