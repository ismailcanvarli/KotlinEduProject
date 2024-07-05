//Created by canVarli on 7/4/2024.

/**
 * Bu gün günlerden çarşamba olduğunu varsayalım kullanıcıdan sayı alıp aldığı sayı kadar gün geçtiğinde günlerden hangi gün olduğunu söyleyen bir algoritma yazınız.
 *
 *         -Kullanıcıdan bir sayı alsın
 *         -When kullanarak alınan sayıya göre girilen sayı kadar gün sonra hangi güne denk geleceğini söylesin
 *         -7 den büyük girilen sayılar içinde hesaplamaya devam etsin(dersteki örneğin aksine)
 *         örnek: girdi: 2 - çıktı: 2 gün sonra günlerden Cuma
 *         Şubat'ın 29 çektiği yıllar hesaba katılmayacak.
 */
package org.example.testquestion

fun main() {

    println("Pozitif bir sayı giriniz: ")
    val number = readln().toInt()

    println("$number gün sonra günlerden " + calculateDay(number))
}

// İlk gün çarşamba
fun calculateDay(number: Int): String {

    when (number % 7) {
        0 -> return "Çarşamba"
        1 -> return "Perşembe"
        2 -> return "Cuma"
        3 -> return "Cumartesi"
        4 -> return "Pazar"
        5 -> return "Pazartesi"
        6 -> return "Salı"
    }
    return "Yanlış değer girdiniz"
}

