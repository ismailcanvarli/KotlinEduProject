package org.example

fun main() {

    // Array (diziler)
    /**
     * Aynı türden ya da belirli bir tür grubundan elemanları içinde barındıran veri yapılardır.
     * En sık kllanılan versiyonu Object-type array tipinde olanıdır.
     * Primite tiplerin array'leri de vardır.
     * ByteArray, ShortArray, IntArray, LongArray, FloatArray, DoubleArray, CharArray, BooleanArray
     *
     * arrayOf (ayni tipden elemanlar) şeklinde tanımlanır.
     * arrayOf <Any> (farklı tiplerden elemanlar) şeklinde tanımlanır.
     * arrayOfNulls <Type>(size) şeklinde ise belirli bir boyutta null elemanlarla doldurulmuş bir array oluşturulur.
     * emptyArray <Type> () şeklinde ise belirli bir türde boş bir array oluşturulur.
     */


    val array = arrayOf(1, 2, 3, 4, 5)
    val array2 = arrayOf("Kotlin", "Java", "Python", "C++")

    // Buradaki <> işareti generic yapıdır. Bu yapıda farklı türlerde elemanlar bulunabilir.
    // Interface de denebilir. Any ise tüm türleri kapsayan bir yapıdır.
    val array3 = arrayOf<Any>(13, "Kotlin", 3.14, 'A', true)

    // Null elemanlarla doldurulmuş 5 elemanlı bir array oluşturuldu.
    val array4 = arrayOfNulls<Int>(5)
    // String tipte boş bir array oluşturuldu. Size belirtilmediği için boyutu 0'dır.
    val array5 = emptyArray<String>()

    /**
     * Array'ler sabit boyutludur. Yani bir array oluşturulduğunda boyutu değiştirilemez.
     * Array'lerde elemanlara erişim index numarası ile yapılır.
     */

    /**
     * Array<Type>(size) {higher order function} şeklinde de tanımlanabilir.
     * Bu durumda higher order function içerisinde son satıra denk gelen değerler ile dizi oluşturulur.
     * Higher order function, içerisi dizinin boyutu kadar index'i (it) bir bir arttırarak çalışır.
     */

    // 5 Elemanli, tüm elemanları 3.14 olan bir array oluşturuldu.
    val carNamesMini = Array<Double>(5) { 3.14 }

    // 10 elemanlı, 0-9 arası index değerlerinin karesi olan bir array oluşturuldu.
    val carNamesMini2 = Array<Int>(10) { it * it }

    // Primitive type array'ler
    // ByteArray, ShortArray, IntArray, LongArray, FloatArray, DoubleArray, CharArray, BooleanArray

    val firstCharOfCountries = CharArray(6)
    // Array'in elemanlarını değiştirme
    firstCharOfCountries[0] = 'T'
    firstCharOfCountries[1] = 'U'
    firstCharOfCountries[2] = 'R'
    firstCharOfCountries[3] = 'K'
    firstCharOfCountries[4] = 'E'
    firstCharOfCountries[5] = 'Y'

    // Array'in elemanlarına erişim
    println(firstCharOfCountries[0])
    val stringSample = "TURKEY" // String bir array'dir.

    /**
     * Val ile tanımlanan array'lerin herhangi bir index'teki elemanı değişiştirilebilir.
     * val indexdeki değerlerin değişmesine karışmaz
     * Ancak o diziyi başka bir diziye atayamayız.
     * Yani arraylar mutable'dir.
     */

    val array6 = arrayOf(1, 2, 3, 4, 5)
    array6[2] = 10
    println(array6[2])

    /**
     * Multi-dimensional Arrays (Çok boyutlu arrayler)
     * 2 Boyutlu Array 3 boyutlu arrayler vardır.
     * 2 boyutlu array'lerde satır ve sütunlar vardır.
     * Array<Type>(row, column) şeklinde tanımlanır.
     * Array<Type>(row) {Array<Type>(column)} şeklinde de tanımlanabilir.
     */

    val matrix = Array(3) { Array(3) { 0 } }
    // 0 0 0
    // 0 0 0
    // 0 0 0

    println(matrix[0][1])

    /**
     * Vararg (Variable number of arguments)
     * Vararg, fonksiyonlara değişken sayıda argüman göndermek için kullanılır.
     * Eğer varrag'a denk gelecek şekilde bir array kullanmak istioyrsak "spread operator" kullanılır.
     * Spread operator "*" ile gösterilir, array'in elemanlarını ayırarak fonksiyona gönderir.
     */

    val lettersArray = arrayOf("A", "B", "C", "D", "E")

    printLetters(*lettersArray)

}

fun printLetters(vararg letters: String) {
    for (letter in letters) {
        print(letter)
    }
}