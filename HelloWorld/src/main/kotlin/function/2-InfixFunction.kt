//Created by canVarli on 7/6/2024.

package org.example.function

/**
 *  Daha okunaklı kodlar yazmak için kullanılır
 *  . (nokta) kullanımını kaldırır.
 *  Bir fonksiyonu infix hale getirmek için 5 şart vardır.
 *  1. infix keywordü kullanılmalıdır.
 *  2. Fonksiyon bir üye fonksiyon olmalıdır. (Bir sınıfın içinde tanımlanmış olmalıdır.)
 *  3. yada bir extension fonksiyon olmalıdır.
 *  4. Sadece bir parametre almalıdır. Varargs kullanılamaz.
 *  5. Infix fonksiyonun paratersi default değer alamaz.
 *
 *  Infix'in bize sağladığı özellik
 *  awesomeInstance downloadFile "http://example.com/file.zip"
 *  awesomeInstance.downloadFile("http://example.com/file.zip")
 *  Bence kullanmaya gerek bile yok. Sadeece . ve () kullanımını kaldırır.
 *
 *  And ve Or gibi operatörlerde kullanılabilir. Daha okunaklı.
 *  if ( a and b) { }
 *  if (a.and(b)) { }
 */

fun main() {

    val awesomeInstance = AwesomeClass()
    awesomeInstance downloadFile "http://example.com/file.zip"
}

class AwesomeClass {
    infix fun downloadFile(url: String) {
        println("Downloading file from $url")
    }
}