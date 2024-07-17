//Created by canVarli on 7/17/2024.

package org.example.testquestion.classes.appliance

/**
 * Interface Kullanımı Sorusu
 * Bir Appliance (cihaz) adlı interface oluşturun.
 * Bu interface içinde turnOn ve turnOff adlı iki metot tanımlayın.
 * Bu interface'i kullanarak WashingMachine ve Refrigerator sınıflarını implement edin.
 * Ayrıca, her iki sınıfta da brand ve model gibi özellikler ekleyin
 * ve bu bilgileri ekrana yazdıran bir metot oluşturun.
 */

fun main() {

    val refrigerator = Refrigerator("Arçelik", "B200")
    val washingMachine = WashingMachine("LG", "Inverter Direct Drive")

    refrigerator.turnOn()
    println(refrigerator.brand + " " + refrigerator.model)
    refrigerator.turnOff()

    washingMachine.turnOn()
    println(washingMachine.brand + " " + washingMachine.model)
    washingMachine.turnOff()
}