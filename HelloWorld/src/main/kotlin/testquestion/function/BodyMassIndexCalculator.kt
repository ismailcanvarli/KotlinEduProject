//Created by canVarli on 7/5/2024.
/**
 * Vücut kitle indeksi hesaplayan bir algoritma yazınız:
 *
 *         - Vücut kitle indeksi kilo/(boy*boy) şeklinde bulunur
 *         - Kullanıcıdan boy(cm) ve Kilo(kg) şeklinde istesin
 *         - Boyu metre cinsine çevirsin
 *         - Ekrana vücut kitle indeksini ve durumunu yazdırsın
 *
 *         # 0-20 =  Zayıf
 *         # 20-25 = Ortalama
 *         # 25-30 = Kilolu
 *         # 30-oo = Obez
 *
 * Örnek çıktı: vücut kitle indeksiniz 24 Normal kilodasınız:
 */

package org.example.testquestion.function

fun main() {
    println("Boyunuzu santimetre (cm) cinsinden giriniz: ")
    val heightCm = readln().toDouble()

    println("Kilonuzu kilogram (kg) cinsinden giriniz: ")
    val weight = readln().toDouble()

    calculateBodyMassIndex(heightCm, weight)
}

fun calculateBodyMassIndex(heightCm: Double, weight: Double) {
    val heightM = heightCm / 100
    val bmi: Double = (weight / (heightM * heightM))

    println("Vücut kitle indeksiniz: $bmi")
    printWeightStatus(bmi)
}

fun printWeightStatus(bmi: Double) {
    when {
        bmi < 20 -> println("Zayıf")
        bmi < 25 -> println("Ortalama")
        bmi < 30 -> println("Kilolu")
        else -> println("Obez")
    }
}