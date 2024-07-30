//Created by canVarli on 7/30/2024.

package org.example.delegation

/**
 * Değerlendirme (Evaluation): by lazy ile tanımlanan property'lerin değeri sadece
 * ilk çağrıldığında hesaplanır. Sonraki erişimlerde ise hesaplanan değer doğrudan döndürülür.
 * Bu özellik hesaplaması maliyetli veya değeri büyük olan property'ler için kullanışlıdır.
 *
 * Thread safety: by lazy varsayılan olarak thread-safe'dir.
 * Yani aynı anda birden fazla thread'in aynı anda erişmesine izin vermez.
 *
 * Null safety: by lazy null değerlerle çalışabilir.
 */

class Foo {
    init {
        println("Object init")
    }
}

fun demo() {
    // val foo: Foo = Foo() // Bu satır aşağıdaki ile aynıdır.

    // Ne zaman çağrılırsa o zaman oluşturulur. (Lazy initialization)
    // İlk çağrıldığında oluşturulur. Sonraki çağrılarda daha önce oluşturulan nesne döndürülür.
    // Ek bilgi: Bu bir lambda fonksiyondur. Son satırın değeri döndürülür.
    val lazyObject: Foo by lazy {
        println("Lazy object init")
        Foo()
    }

    // İlk erişimde init bloğu çalışır. Nesne oluşturulur.
    println("First access:")
    println(lazyObject)

    // İkinci erişimde init bloğu çalışmaz. Daha önceki nesne döndürülür.
    println("Second access:")
    println(lazyObject)
}

fun main() {
    demo()
}