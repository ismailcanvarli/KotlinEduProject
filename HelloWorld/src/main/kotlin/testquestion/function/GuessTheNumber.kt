//Created by canVarli on 7/5/2024.

// Basit fonksiyonlarla ilgili örnek
/**
 * 1 ile 25 arasında rastgele bir sayı seçilsin kullanıcıdan bu sayının bulunması istenilsin.
 *         -Kullanıcının bilmek için 3 hakkı olsun
 *         -Kullanıcıya 3 tahmin hakkı verilsin
 *         -Program random 1 sayı seçsin
 *         -Kullanıcıdan tahmin için sayı istesin
 *         -Girilen sayı random sayıdan büyükse daha küçük, küçükse daya büyük bir sayı deneyin diye
 *          çıktı versin ve 1 tahmin hakkı düşürsün, kalan hakkı göstersin
 *         -Tahmin hakkı kaldığı sürece tekrar sayı istesin
 *         -Tahmin hakkı bittiğinde program "hakkınız bitti" yazıp kapansın
 *         -Doğru tahmin edildiğinde Program "tebrik edip" kapansın
 */

package org.example.testquestion.function

import kotlin.random.Random

fun main() {
    guessNumber()
}

fun guessNumber() {
    val randomNumber = Random.nextInt(1, 26)
    var tempNumber: Int
    var attempt = 3

    while (attempt > 0) {
        println("$attempt hakkınız kaldı.")
        println("1 - 25 Arasında bir sayı giriniz: ")

        tempNumber = readln().toInt()
        attempt--

        if (tempNumber == randomNumber) {
            println("Tebrikler doğru tahmin ettiniz.")
            return
        } else if (tempNumber > randomNumber) {
            println("Daha küçük bir sayı deneyin.")
        } else {
            println("Daha büyük bir sayı deneyin.")
        }
    }
    println("Hakkınız bitti.")
}