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
class DocumentPrint(printerType: PrinterType) {
    private val printer = when (printerType) {
        PrinterType.INK -> InkPrinter()
        PrinterType.LASER -> LaserPrinter()
        PrinterType.MIXED -> MixedPrinter()
    }

    fun printDocument() {
        printer.printDocument()
    }
}

// Delegation ile yapılan işlem
// Bu sınıf Printer interface'ini implemente eder.
// printer nesnesine yetkiyi verir (delegation)
// Printer arayüzündeki tüm fonksiyonları printer nesnesine devreder.
// Printer arayüzüne yeni bir fonksiyon eklendiğinde bu sınıfı güncellememize gerek kalmaz.
class DocumentPrinterDelegate(printer: Printer) : Printer by printer

fun main() {
    val inkPrinter = DocumentPrint(PrinterType.INK)
    inkPrinter.printDocument()

    val inkPrinter1 = DocumentPrint(PrinterType.LASER)
    inkPrinter1.printDocument()

    val inkPrinter2 = DocumentPrint(PrinterType.MIXED)
    inkPrinter2.printDocument()

    // Delegation ile yapılan işlem
    val documentPrinterDelegate = DocumentPrinterDelegate(InkPrinter())
    documentPrinterDelegate.printDocument()

    val documentPrinterDelegate1 = DocumentPrinterDelegate(LaserPrinter())
    documentPrinterDelegate1.printDocument()

    val documentPrinterDelegate2 = DocumentPrinterDelegate(MixedPrinter())
    documentPrinterDelegate2.printDocument()
}