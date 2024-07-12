//Created by canVarli on 7/12/2024.

package org.example.testquestion.classes

/**
 * Init Bloğu ve Constructor Değişkenleri
 * Bir Student sınıfı oluşturun. Bu sınıfın primary constructor'ında name ve grade
 * isimli iki değişken bulunsun. init bloğunda grade değişkeninin 0 ile 100 arasında
 * olup olmadığını kontrol edin ve değilse bir hata fırlatın.
 *
 * Bu sınıfı test etmek için iki örnek oluşturun:
 * biri geçerli, biri geçersiz olacak şekilde.
 */
class Student(val name: String, val grade: Int) {
    init {
        require(grade in 0..100) { "Hatalı sayı $grade" }
    }
}

fun main() {
    val student1 = Student("İsmail", 95)
    println("${student1.name} isimli öğrencinin notu: ${student1.grade}")

    try {
        val student2 = Student("Halit", -5)
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }


}