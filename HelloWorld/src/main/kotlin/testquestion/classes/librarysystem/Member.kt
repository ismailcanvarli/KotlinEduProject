//Created by canVarli on 7/13/2024.

package org.example.testquestion.classes.librarysystem

/**
 * Member Sınıfı:
 *
 * Primary constructor ile name ve memberId değişkenlerini alsın.
 * Üyenin ödünç aldığı kitapları tutmak için private bir liste (borrowedBooks) tanımlayın.
 * borrowBook ve returnBook metodlarını ekleyin. Bu metodlar, ödünç alma ve geri verme işlemlerini yönetsin.
 */

open class Member(val name: String, private val memberId: String) {
    // Ödünç alınan kitaplar için oluşturulan liste
    private val borrowedBooks = mutableListOf<Book>()

    // Kullanıcının kitap ödünç alma işlemi
    fun barrowBook(book: Book) {
        book.barrowCopy()
        borrowedBooks.add(book)
        println("$name ${book.title} kitabını ödünç aldı.")
    }

    //Kullanıcının kitap iade etme işlemi
    fun returnBook(book: Book) {
        book.returnCopy()
        borrowedBooks.remove(book)
        println("$name ${book.title} kitabını iade etti.")
    }

    //Ödünç alınmış kitapların listesini listeleme işlemi
    fun getBorrowedBooks() = borrowedBooks.toList()

}