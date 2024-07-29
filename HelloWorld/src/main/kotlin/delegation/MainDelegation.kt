//Created by canVarli on 7/26/2024.

package org.example.delegation

// Printer tiplerini belirleyen enum class
enum class PrinterType {
    INK, LASER, MIXED
}

interface Printer {
    fun printDocument()
}

class InkPrinter : Printer {
    override fun printDocument() {
        println("Ink")
    }
}

class LaserPrinter : Printer {
    override fun printDocument() {
        println("Laser")
    }
}

class MixedPrinter : Printer {
    override fun printDocument() {
        println("Mixed")
    }
}

// Buradaki problem, yeni bir printer türü, yeni bir fonksiyon
// eklediğimizde bu sınıfı güncellememiz gerekecektir.
// Bu durumu önlemek için Delegation yapısını kullanabiliriz.
class DocumentPrintManuel(private val printer: Printer) {
    fun printDocument() {
        printer.printDocument()
    }
}

// Delegation ile yapılan işlem
// Bu sınıf Printer interface'ini implemente eder.
// Burada interface delegaion var. Çünkü interface by ile yetki veriliyor.
// Printer arayüzündeki tüm fonksiyonları printer nesnesine devreder.
// Printer arayüzüne yeni bir fonksiyon eklendiğinde bu sınıfı güncellememize gerek kalmaz.
class DocumentPrinterDelegate(printer: Printer) : Printer by printer

fun main() {
    val inkPrinter = InkPrinter()
    val documentPrintManuel = DocumentPrintManuel(inkPrinter)
    documentPrintManuel.printDocument()

    val laserPrinter = LaserPrinter()
    val documentPrintManuel1 = DocumentPrintManuel(laserPrinter)
    documentPrintManuel1.printDocument()

    val mixedPrinter = MixedPrinter()
    val documentPrintManuel2 = DocumentPrintManuel(mixedPrinter)
    documentPrintManuel2.printDocument()

    // Delegation ile yapılan işlem
    val documentPrinterDelegate = DocumentPrinterDelegate(InkPrinter())
    documentPrinterDelegate.printDocument()

    val documentPrinterDelegate1 = DocumentPrinterDelegate(LaserPrinter())
    documentPrinterDelegate1.printDocument()

    val documentPrinterDelegate2 = DocumentPrinterDelegate(MixedPrinter())
    documentPrinterDelegate2.printDocument()
}