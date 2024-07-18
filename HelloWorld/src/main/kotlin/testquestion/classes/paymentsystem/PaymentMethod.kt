//Created by canVarli on 7/18/2024.

package org.example.testquestion.classes.paymentsystem

sealed class PaymentMethod {
    // Burada sınıf tanımından sonra sealed classtan extend aldığını  yazmayı unutma!!!
    data class CreditCard(val cardNumber: String, val expiryDate: String) : PaymentMethod()
    data class PayPal(val email: String) : PaymentMethod()
    data class BankTransfer(val accountNumber: String, val bankCode: String) : PaymentMethod()
}

fun processPayment(paymentMethod: PaymentMethod) {
    when (paymentMethod) {
        is PaymentMethod.CreditCard -> {
            println("Processing credit card payment with card number: ${paymentMethod.cardNumber}")
        }

        is PaymentMethod.PayPal -> {
            println("Processing PayPal payment with email: ${paymentMethod.email}")
        }

        is PaymentMethod.BankTransfer -> {
            println("Processing bank transfer with account number: ${paymentMethod.accountNumber} and bank code: ${paymentMethod.bankCode}")
        }
    }
}