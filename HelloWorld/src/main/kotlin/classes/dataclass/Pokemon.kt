package org.example.classes.dataclass

/**
 * Data class (Veri sınıfı)
 * Sadece veri tutmak için kullanılır. (state) Mantık ve işlem yapmaz.
 * Primary constructor olmalıdır ve en az 1 tane parametre almalıdır.
 * Property'lerin hepsi val veya var olmalıdır.
 * Çünkü primary constructor property'leri için aşağıdaki fonksiyonları otomatik oluşturur.
 * (toString(), equals(), hashCode() ve copy())
 *
 * Member property ve funciton tanımlanabilir. (normal sınıfla aynı)
 * Member property'lerin componentN() fonksiyonları oluşturulmaz.
 * toString(), equals(), hashCode() ve copy() fonksiyonlarını kullanamazlar.
 *
 * Visibilty modifier tanımlanabilir. (public, private, protected, internal)
 * Kalıtıma vermez ancak miras alabilir. İnterface implemente edebilir.
 * Secondary constructoru olabilir.
 * Init bloğu olabilir.
 * Sealed ve inner class olamaz.
 *
 * Copy fonksiyonu ile nesne kopyalayabiliriz ve değişiklik yapabiliriz.
 *  * Destructuring declaration yapılabilir. (val (name, type, origin) = pokemon)
 *  * val pair: Pair<String, String> = pokemon.component1() to pokemon.component2()
 */

internal data class PokemonData(val name: String, val type: String, val origin: String) {
    // Member property
    val color: String = "Red"

    // Init block
    init {
        println("PokemonData init block")
    }

    // Secondary constructor
    constructor(name: String, type: String) : this(name, type, "Kanto")

}

/**
 * Normal sınıfla farkı.
 * Normal sınıf primary constructor olmak zorunda değil.
 * Normal sınıfın property'leri val, var olmak zorunda değil.
 * Normal sınıfın member function'ları olabilir.
 * Normal sınıfın init bloğu olabilir.
 * Normal sınıfın secondary constructor'ı olabilir.
 * Normal sınıfın sealed ve inner class olabilir.
 *
 */

class Pokemon(name: String, type: String, origin: String)
