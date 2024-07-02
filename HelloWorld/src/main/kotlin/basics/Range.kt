package org.example.basics

fun main() {
    /**
     * Range sonlu sayılı bir aralığı (bir listeyi) temsil eder.
     * ".." operatörü yada rangeTo fonksiyonu ile range oluşturulabilir.
     * "..<" operatörü yada until fonksiyonu ile range oluşturulabilir.
     * Küçükten büyüğe doğru bir aralık oluşturmak için 1..5 şeklinde kullanılır.
     * Büyükten küçüğe doğru bir aralık oluşturmak için 5 downTo 1 şeklinde kullanılır.
     * Belirli bir aralıkta belirli bir sayıda artış yapmak için 1..10 step 2 şeklinde kullanılır.
     * Range içindeki değerleri kontrol etmek için in operatörü kullanılır.
     */

    val numbers1 = 1..5 // 1, 2, 3, 4, 5
    val numbers2 = 1.rangeTo(5) // 1..5
    val numbers3 = 1 until 5 // 1, 2, 3, 4 (5 hariç)
    val numbers4 = 5 downTo 1 // 5, 4, 3, 2, 1
    val numbers5 = 1..10 step 2 // 1, 3, 5, 7, 9

    /**
     * Karakterler için de range oluşturulabilir.
     */

    val characters = 'a'..'z' // a, b, c, ..., z

    /**
     * Progression, CharRange, LongRange ve IntRange sınıflarının bir alt sınıfıdır.
     * Diğer tiplerde bulunmaz. Bunun nedeni o sınıflar sayılamazlar.
     */

    val numberList: IntRange = 10 until 20 // 10, 11, 12, ..., 19
    numberList.first // 10
    numberList.last // 19
}
