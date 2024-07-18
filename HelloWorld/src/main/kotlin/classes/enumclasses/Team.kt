//Created by canVarli on 7/18/2024.

package org.example.classes.enumclasses

/**
 * Enum sınıfı
 *
 * Enum sabitleri: Enum sınıfının içine yazılan değerler static'tir
 * Büyük harfle yazılır. Bunlar özünde sınıftır. Anonymous (isimsiz) sınıf denir.
 * Visibility modifier verilebilir (public, private, internal, protected)
 * Access modifier verilemez default final. (open, final)
 * Primary constructor ve init bloğu yazılabilir.
 * Secondary constructor yazılabilir.
 *
 * Enum sınıflar başka herhangi sınıfı miras alamazlar.
 * Nesnesi oluşturulamaz. Çünkü primary constructor private.
 *
 * Companion object oluşturulabilir
 *
 * Fonksiyon tanımlayabiliyoruz.
 * Abstruct fun'daa yazabiliriz ancak enum sabitleri override etmek zorunda.
 */

enum class Team(val starCount: Int) {
    FENERBAHCE(3), GALATASARAY(4), BESIKTAS(2), TRABZONSPOR(2);

    init {
    }

    constructor(type: Int, starCount: Int) : this(starCount)

    companion object

}

fun main() {
    Team.BESIKTAS.starCount // 2
    Team.FENERBAHCE.starCount // 3
    Team.entries // Enum sınıfının enum sabitlerini verir.
    Team.GALATASARAY.ordinal // Kaçıncı enum sabiti olduğunu söyler
    Team.GALATASARAY.name // O sabitin adını verir.
}