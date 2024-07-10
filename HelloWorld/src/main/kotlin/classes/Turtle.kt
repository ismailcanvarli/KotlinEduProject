//Created by canVarli on 7/10/2024.

package org.example.classes

// Kaplumbağa sınıfı
// 7 property (özellik) ve 3 function (fonksiyon) içerir
// Bu constructor primary constructor'dır.
// Constructor parametresi burada var veya val şekilde çağrılabilir
// bunlar kullanılmadanda bu değişkenler çağıralabilir.
// Burada constructor'da yazabiliriz.
class Turtle(var name: String = "Turtle", feetCount: Int = 4) {
    var age: Int = 100
    var feetCount: Int = 4
    var feetColor: String = "Green"
    var headCount: Int = 1
    var shellColor: String = "Brown"
    var sex: Boolean = true

    // Yine javadan farklı olarak burada init kullanabiliyoruz.
    // Bu init bloğu primary constructor'un body'si gibidir.
    // Bu blok nesne oluşturulduğunda çalışır.
    init {
        this.feetCount = feetCount
        println("Primary constructor")
    }

    // Secondary constructor
    // Bu constructor primary constructor'dan farklı olarak birden fazla olabilir.
    // Secondary constructor'lar primary constructor'a işaret ederler.
    // Yani primary constructor body'sini çalıştırırlar.
    constructor(name: String, feetCount: Int, age: Int) : this(name, feetCount) {
        this.name = name
        this.feetCount = feetCount
        println("Secondary constructor")
    }

    // Secondary constructor
    constructor(name: String, feetCount: Int, age: Int, feetColor: String) : this(name, feetCount, age) {
        this.name = name
        this.feetCount = feetCount
        this.age = age
        this.feetColor = feetColor
        println("Secondary constructor")
    }

    fun swim() {
        println(name)
        println("Turtle is swimming")
    }

    fun eat() {
        println("Turtle is eating")
    }

    fun sleep() {
        println("Turtle is sleeping")
    }

}

fun main() {
    // Kaplumbağa sınıfından bir nesne oluşturuldu
    // Buradaki yuvarlak paranteze constructor parameresi denir.
    val turtle1 = Turtle()

    /**
     * Default değerlere sahip bir primary constructor oluşturulduğunda
     * bu değerlerin değiştirilmesi gerekirse aşağıdaki gibi
     * constructor parametrelerine değer atanabilir.
     * İstersek fonksiyondaki gibi bu şekilde yeni nesne tanımlayabiliriz.
     */
    val turtle2 = Turtle("Turtle2")
    val turtle3 = Turtle(feetCount = 3)
    val turtle4 = Turtle("Turtle4", 4)


    // Kaplumbağa nesnesinin özelliklerine bu şekilde erişebiliyoruz.
    turtle1.swim()
    // Bu şekilde property değerlerini değiştirebiliriz.
    turtle1.name = "Turtle1"

    // Secondary constructor'lar
    val turtle5 = Turtle("Turtle5", 4, 100)
    val turtle6 = Turtle("Turtle6", 4, 100, "Red")
}