//Created by canVarli on 7/18/2024.

package org.example.testquestion.classes.paymentsystem

/**
 * Bir ödeme sistemi geliştirdiğinizi düşünün.
 * Ödeme yöntemlerini temsil etmek için bir sealed class
 * oluşturmanız gerekiyor. Ödeme yöntemleri şunları içermelidir:
 *
 * CreditCard - cardNumber: String, expiryDate: String
 * PayPal - email: String
 * BankTransfer - accountNumber: String, bankCode: String
 *
 * Aşağıdaki gereksinimleri karşılayan kodu yazın:
 *
 * PaymentMethod adlı bir sealed class tanımlayın ve
 * yukarıdaki ödeme yöntemlerini içeren veri sınıflarını (data classes) oluşturun.
 * Bir processPayment fonksiyonu yazın. Bu fonksiyon, bir PaymentMethod
 * parametresi almalı ve ödeme yöntemine göre farklı işlemler gerçekleştirmelidir:
 * CreditCard için: "Processing credit card payment with card number: [cardNumber]"
 * PayPal için: "Processing PayPal payment with email: [email]"
 * BankTransfer için: "Processing bank transfer with account number:
 * [accountNumber] and bank code: [bankCode]"
 * Farklı ödeme yöntemlerini kullanarak processPayment fonksiyonunu çağırın
 * ve sonuçları ekrana yazdırın.
 */
fun main() {

    // 3. Farklı ödeme yöntemlerini kullanarak processPayment fonksiyonunu çağırın
    val creditCardPayment = PaymentMethod.CreditCard("1234-5678-9012-3456", "12/24")
    val payPalPayment = PaymentMethod.PayPal("user@example.com")
    val bankTransferPayment = PaymentMethod.BankTransfer("987654321", "001122")

    processPayment(creditCardPayment)
    processPayment(payPalPayment)
    processPayment(bankTransferPayment)

}