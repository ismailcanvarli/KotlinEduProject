//Created by canVarli on 7/9/2024.

package org.example.function

/**
 * Bir fonksiyonu hof yaptığımızda kaç kere o fonksiyonu çağırırsak
 * o kadar o fonksiyonun nesnesi oluşturulur.
 * Inline fonksiyon yaptığımızda o fonksiyonun nesnesi oluşturulmaz.
 * Normal bir fonksiyonu inline yapamazsın. Higher Order fonksiyon olmalı.
 * Inline fonskiyonlar, fonksiyonun içeriğini çağırıldığı yere kopyalar.
 * Bu sayede performans artışı sağlar.
 *
 * Az kullanacağımız bir fonksiyonu inline yapmamız gereksiz.
 */

fun main() {
    // inline fonksiyon örneği
    repeat(10) {
        runAndPrint {
            println(it)
        }
    }

    // noinline örneği
    runAndPrintNoInline({ message ->
        println(message)
    }, {
        println(it)
    })

    // non local return örnek
    println("Start")
    val list = listOf(1, 2, 3, 4, 5)
    // buradaki return non-local return olur. Burada main'den çıkar.
    list.forEach {
        if (it == 3) {
            return
        }
        println(it)
    }
    // forEach fonksiyonu inline olduğu için return çalışır ve End yazılmaz.
    println("End")

}

// Inline yukarıdaki print it işlemini buranın içine alıp çalıştırmamızı sağlar
// Arka planda fonksiyonun nesnesini oluşturmaz.
inline fun runAndPrint(run: (String) -> Unit) {
    run("Message")
}

// NoInline
// Inline fonksiyonun içindeki fonksiyonu inline yapmamızı engeller.
// run'ın nesnesi oluşturulmazken logger'ın nesnesi oluşturulur.
inline fun runAndPrintNoInline(run: (String) -> Unit, noinline logger: (String) -> Unit) {
    log(logger)
    run("Message")
    logger("End")
}

// NoInline için kullanılan hof bir fonksiyon
fun log(logger: (String) -> Unit) {
    logger("Start")
}
