//Created by canVarli on 8/5/2024.

package org.example.classes.dataclass

// Data class (veri sınıfı) tanımı
data class Customer(
    val id: Int,
    val name: String,
    val email: String? = null, // Varsayılan değer
    val isActive: Boolean
)

// Veri işleme fonksiyonu
fun main() {
    // Yeni bir müşteri oluşturma
    val customer1 = Customer(
        id = 1,
        name = "John Doe",
        email = "john.doe@example.com",
        isActive = true
    )

    // Müşteri bilgilerini yazdırma
    println(customer1) // toString() fonksiyonu otomatik olarak çağrılır

    // Müşteriyi kopyalayarak yeni bir müşteri oluşturma (bazı bilgileri değiştirerek)
    val customer2 = customer1.copy(id = 2, name = "Jane Doe")

    // İki müşteri nesnesinin eşit olup olmadığını kontrol etme
    println(customer1 == customer2) // equals() fonksiyonu otomatik olarak çağrılır

    // Müşterinin email bilgisine erişme
    println(customer1.email)

    // Müşteri bileşenlerine erişim (componentN() fonksiyonları)
    val (id, name, email, isActive) = customer1
    println("ID: $id, Name: $name, Email: $email, Active: $isActive")
}