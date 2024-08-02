//Created by canVarli on 7/4/2024.

package org.example.loop

/**
 * While döngüsü belirli bir koşul sağlandığı sürece çalışır.
 * While döngüsü, döngü başlamadan önce koşul kontrol edilir.
 * For ve if birleştirilmiş hali gibi.
 * İş hayatında çok kullanılmaz. Genelde for ve for if
 */

fun main() {
    var number = 0

    while (number < 5) {
        println("Number: $number") // 0, 1, 2, 3, 4
        number++
    }

    // While döngüsü ile aynı işlemi for döngüsü ile yapalım.
    for (value in 0..4) {
        if (value < 5) {
            println("Value: $value") // 0, 1, 2, 3, 4
        } else {
            break
        }
    }
}