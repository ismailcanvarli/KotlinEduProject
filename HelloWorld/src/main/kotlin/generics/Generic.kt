//Created by canVarli on 7/19/2024.

package org.example.generics

/**
 * Kotlinde generic invariant (değişmez) dır.
 * Bunun anlamı List<String>, List<Object>'nin bir alt tipi değil.
 * Mesela int için bir number diyorduk. Ancak burada bir dönüşüm olamyacak.
 * Sub type'ları super type'lar yerine kullanamayız.
 */

// Bu invariant bir generic type'dır
class Box<T>(t: T) {
    var value = t
}

// Co-variant (out) kullanımı
class Source<out T> {
    fun nextT(): T {
        return value as T
    }
    val value: Any = "String"
}

// Contra-variant  (in) kullamnımı
class Comparable<in T> {
    operator fun compareTo(other: T): Int {
        return 0
    }
}

fun main() {
    val box = Box(1) // Box<Int> türünde bir nesne oluşturuldu.
    val box1 = Box("asd") // Box<String> türünde bir nesne oluşturuldu.

    // Kendisini yada alt sınıfı bekliyorsa co-variant kullanabiliriz.
    // buna örnek olarak List<Any> -> List<String> verilebilir.

    // Kendisini yada üst sınıfı bekliyorsa contra-variant kullanabiliriz.
    // buna örnek olarak List<String> -> List<Any> verilebilir.
}