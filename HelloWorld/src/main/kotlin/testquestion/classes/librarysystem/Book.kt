//Created by canVarli on 7/13/2024.

package org.example.testquestion.classes.librarysystem

/**
 * Book Sınıfı:
 *
 * Primary constructor ile title, author, isbn ve copiesAvailable değişkenlerini alsın.
 * copiesAvailable 0'dan küçük olmamalı ve bu koşul init bloğunda kontrol edilmeli.
 * borrowCopy (Kitaplıktan 1 kopya ödünç alıyor) ve
 * returnCopy (Ödünç aldığı kitabı iade ediyor) metodları ekleyin,
 * bu metodlar copiesAvailable değerini güncellesin.
 */

class Book(val title: String, val author: String, val isbn: String, var copiesAvailable: Int) {

    init {
        require(copiesAvailable >= 0) { "Kopya sayısı 0'dan büyük olmalıdır." }
    }

    fun barrowCopy() {
        if (copiesAvailable > 0) {
            copiesAvailable--
        } else {
            println("Bu kitabın $title kopyası yok.")
        }
    }

    fun returnCopy() {
        copiesAvailable++
    }
}