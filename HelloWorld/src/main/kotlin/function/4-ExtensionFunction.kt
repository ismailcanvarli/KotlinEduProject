//Created by canVarli on 7/6/2024.

package org.example.function

/**
 * Üzerinde değişiklik yapamadığımız (read only) sınıflara yada değişiklik yapmak istemediğimiz
 * sınıflara yeni fonksiyonlar eklemek için kullanılır.
 * Javada bu işlem için utility sınıfları kullanılır. Static fonksiyonlar tanımlanır.
 *
 * Extension fonksiyonlar, sınıflara yeni fonksiyonlar eklememizi sağlar.
 * Ancak aslında o sınıfın içerisine yeni fonksiyonlar eklemiyoruz.
 * Sadece o sınıfın tipini kullanarak "yeni fonksiyonlar oluşturuyoruz."
 *
 * Yapısı şu şekildedir: fun SınıfAdı.extensionFunctionName() {
 * fun Sring.extensionFunctionName() {
 * Burada ki string'e reciever (alıcı) denir.
 */

// String sınıfı için bir extension fonksiyon tanımlıyoruz.
// Bu fonksiyon, String'in ilk harfini büyük yapar.
fun String.capitalizeFirstLetter(): String {
    if (this.isEmpty()) return ""
    return this[0].uppercaseChar() + this.substring(1)
}

fun main() {
    val originalText = "kotlin"
    val modifiedText = originalText.capitalizeFirstLetter()
    println(modifiedText) // Çıktı: Kotlin
}