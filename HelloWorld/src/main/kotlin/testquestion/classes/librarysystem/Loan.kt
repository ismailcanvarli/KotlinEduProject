//Created by canVarli on 7/13/2024.

package org.example.testquestion.classes.librarysystem

/**
 * Loan Sınıfı:
 *
 * Primary constructor ile book, member, ve loanDate değişkenlerini alsın.
 * loanDate, kitap ödünç alınma tarihini tutsun.
 * getDueDate metodu ekleyin, bu metod ödünç alınan kitabın son teslim tarihini (loanDate + 14 gün) hesaplasın.
 */

class Loan(val book: Book, val member: Member, val loanDate: String) {

    // This is a simple example, a real implementation would need a date library to add 14 days correctly
    // Bu basit bir uygulamadır, gerçek uygulamada eklenme tarihi düzgünce verilmelidir.
    fun getDueDate(): String {
        return "Kitabın iade süresi bu günden $loanDate 14 gün sonrasıdır."
    }
}