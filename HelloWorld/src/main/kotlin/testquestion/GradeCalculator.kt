//Created by canVarli on 7/4/2024.

/**
 * When kullanarak harf notu hesaplayan bir algoritma yazınız
 *
 *         -Kullanıcıdan vize ve final notlarını istesin
 *         -Ortalama hesaplasın
 *         -Ortalamaya göre geçip kaldıklarını yazsın
 *         -Çıktılara göre yazılacaklar:
 *
 *             0-49 FF
 *             50-59 DD
 *             60-69 CC
 *             70-79 BB
 *             80-100 AA
 */
package org.example.testquestion

fun main() {

    println("0-100 arasında sırasıyla vize ve final notlarınızı giriniz: ")
    val midTerm: Int = readln().toInt()
    val final: Int = readln().toInt()

    if (midTerm > 100) {
        println("Yanlış değer girdiniz.")
        return
    } else if (midTerm < 0) {
        println("Yanlış değer girdiniz.")
        return
    }

    if (final > 100) {
        println("Yanlış değer girdiniz.")
        return
    } else if (final < 0) {
        println("Yanlış değer girdiniz.")
        return
    }

    println("Harf notunuz: " + calculateGrade((midTerm + final) / 2))

}

fun calculateGrade(average: Int): String {
    when (average) {
        in 0..49 -> return "FF"
        in 50..59 -> return "DD"
        in 60..69 -> return "CC"
        in 70..79 -> return "BB"
        in 80..100 -> return "AA"
    }
    return "FF"
}
