//Created by canVarli on 7/23/2024.

package org.example.testquestion.generics.pair

/**
 * Bir Pair sınıfı yazmanızı istiyoruz.
 * Bu sınıf, iki farklı türdeki öğeyi (ilk ve ikinci öğe) tutabilmelidir.
 * Ayrıca, bu sınıf aşağıdaki metodları içermelidir:
 *
 * getFirst: İlk öğeyi döndürmelidir.
 * getSecond: İkinci öğeyi döndürmelidir.
 * setFirst: İlk öğeyi ayarlamalıdır.
 * setSecond: İkinci öğeyi ayarlamalıdır.
 * Bu sınıfı Kotlin'de yazınız ve ardından bir main
 * fonksiyonunda birkaç örnekle nasıl çalıştığını gösteriniz.
 */

class PairClass<A, B>(private var first: A, private var second: B) {

    fun getFirst(): A {
        return first
    }

    fun getSecond(): B {
        return second
    }

    fun setFirst(first: A) {
        this.first = first
    }

    fun setSecond(second: B) {
        this.second = second
    }
}

fun main() {
    val intStringPair = PairClass(1, "One")
    println(intStringPair.getFirst())  // Çıktı: 1
    println(intStringPair.getSecond()) // Çıktı: One

    intStringPair.setFirst(2)
    intStringPair.setSecond("Two")
    println(intStringPair.getFirst())  // Çıktı: 2
    println(intStringPair.getSecond()) // Çıktı: Two

    val doubleBooleanPair = PairClass(3.14, true)
    println(doubleBooleanPair.getFirst())  // Çıktı: 3.14
    println(doubleBooleanPair.getSecond()) // Çıktı: true
}
