package org.example.testquestion.function//Created by canVarli on 7/5/2024.

// Fonksiyonlar ve when kullanımıyla ilgili örnek
/**
 * Soru: Bir Hesap Makinesi Uygulaması
 *
 * Kullanıcıdan iki sayı ve bir işlem türü (+, -, *, /) alın.
 * Kullanıcının girdiği sayılar ve işlem türüne göre hesaplama yapın.
 * Sonucu ekrana yazdırın.
 * Kullanıcıdan geçersiz bir işlem türü girildiğinde uygun bir hata mesajı gösterin.
 * Kullanıcı sayıları ve işlemi tekrar girebilene kadar döngüde kalın.
 * Bir fonksiyon kullanarak işlemi gerçekleştirin.
 * Diziler ve "when" yapısını kullanarak işlemleri gerçekleştirin.
 *
 * Örnek Çıktı:
 * Birinci sayıyı girin: 10
 * İkinci sayıyı girin: 5
 * İşlem türünü girin (+, -, *, /): +
 * Sonuç: 15
 *
 * Birinci sayıyı girin: 10
 * İkinci sayıyı girin: 2
 * İşlem türünü girin (+, -, *, /): x
 * Geçersiz işlem türü! Lütfen tekrar deneyin.
 */

fun main() {
    calculator()
}

fun calculator() {
    while (true) {
        val number1 = getInput("Birinci sayıyı giriniz: ")
        val number2 = getInput("İkinci sayıyı giriniz: ")

        if (number1 != null && number2 != null) {
            chooseOperator(number1, number2)
        } else {
            println("Eksik veya yanlış ifade girdiniz. Lütfen tekrar deneyin.")
        }

        println("Başka bir işlem yapmak istiyor musunuz? (E/H)")
        val again = readln().trim().uppercase()
        if (again != "E") break
    }
}

fun getInput(prompt: String): Double? {
    println(prompt)
    return readln().toDoubleOrNull()
}

fun chooseOperator(number1: Double, number2: Double) {
    println("İşlem türünü giriniz (+, -, *, /): ")
    val operator = readln().trim()

    val result = when (operator) {
        "+" -> number1 + number2
        "-" -> number1 - number2
        "*" -> number1 * number2
        "/" -> if (number2 != 0.0) number1 / number2 else null
        else -> null
    }

    if (result != null) {
        println("Sonuç: $result")
    } else {
        println("Geçersiz işlem türü veya bölme işleminde sıfıra bölme hatası! Lütfen tekrar deneyin.")
    }
}