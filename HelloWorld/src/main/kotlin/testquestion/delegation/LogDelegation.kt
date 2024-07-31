//Created by canVarli on 7/31/2024.

package org.example.testquestion.delegation

/**
 * Android uygulamalarında kullanılan bir delegation örneği yazınız.
 */

// Delegate arayüzü
fun interface Logger {
    fun log(message: String)
}

// Arayüzü uygulayan sınıflar
class ConsoleLogger : Logger {
    override fun log(message: String) {
        println("Console log: $message")
    }
}

class FileLogger : Logger {
    override fun log(message: String) {
        // Dosyaya log yazma işlemleri
        println("File log: $message")
    }
}

// Delegasyon kullanan bir sınıf
class Application(logger: Logger) : Logger by logger

fun main() {
    val consoleLogger = ConsoleLogger()
    val app = Application(consoleLogger)
    app.log("Application started")
}