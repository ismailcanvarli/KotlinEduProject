//Created by canVarli on 7/5/2024.
/**
 * Başlangıçta 500 birimlik bakiyesi bulunan ve bu bakiyeyle istenilen işlemleri yapan algoritma yazınız:
 *
 *         - 4 işlemi olsun bunlar para ekle, para çek, bakiye öğren, çıkış yap şeklinde adlandırılsın
 *         - Para eklem işlemi seçildiğinde kullanıcıdan değer istesin, girilen değeri bakiyeye ekleyip ekranda göstersin, devam etmek isteyip istemediğini sorsun,
 *           seçilen seçeneğe göre tekrar işlem istesin veya uygulamayı kapatsın
 *         - Para çekme işlemi seçildiğinde bakiyeden fazla olup olmadığını kontrol etsin, fazlaysa işlemi gerçekleştiremeyeceğini belirtip tekrar işlem istesin,,
 *           fazla değilse bakiyeyi ekranda gösterip devam etmek isteyip istemediğini sorsun, seçilen seçeneğe göre tekrar işlem istesin veya uygulamayı kapatsın
 *         - Bakiye öğren işlemi seçildiğinde bakiyeyi ekrana göstersin, devam etmek isteyip istemediğini sorsun, seçilen seçeneğe göre tekrar işlem istesin veya uygulamayı kapatsın
 *         - Çıkış yap işlemi seçilirse uygulamayı kapatsın
 *
 *         Örnek çıktı:
 *         # 1-Para Yatırma
 *         # 2-Para Çekme
 *         # 3-Bakiye Bilgi
 *         # 0-Çıkış
 *         # Yapmak istediğiniz işlemi Seçiniz:
 */

package org.example.testquestion.function

private var balance: Double = 500.00

fun main() {
    while (true) {
        when (chooseOperation()) {
            0 -> {
                println("Uygulamadan çıkıyorsunuz.")
                return
            }

            1 -> deposit()
            2 -> withdraw()
            3 -> displayBalance()
        }
    }
}

fun chooseOperation(): Int {
    println("# 1-Para Yatırma \n" + "# 2-Para Çekme \n" + "# 3-Bakiye Bilgisi \n" + "# 0-Çıkış \n" + "Bir işlem seçiniz: ")
    return readln().toIntOrNull() ?: -1 // Returns -1 for invalid input, prompting re-entry.
}

fun deposit() {
    println("Yatırmak istediğiniz tutarı yazınız: ")
    val amount = readln().toDoubleOrNull()
    if (amount != null && amount > 0) {
        balance += amount
        println("Para yatırma işlemi başarılı. Yeni bakiye: $balance")
    } else {
        println("Geçersiz tutar.")
    }
}

fun withdraw() {
    println("Çekmek istediğiniz tutarı yazınız: ")
    val amount = readln().toDoubleOrNull()
    if (amount != null) {
        if (amount <= balance) {
            balance -= amount
            println("Para başarıyla çekildi. Yeni bakiyeniz: $balance")
        } else {
            println("Yetersiz bakiye. Mevcut bakiyeniz: $balance")
        }
    } else {
        println("Geçersiz tutar.")
    }
}

fun displayBalance() {
    println("Mecvut bakiyeniz: $balance")
    return
}
