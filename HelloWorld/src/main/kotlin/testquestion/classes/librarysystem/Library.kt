//Created by canVarli on 7/13/2024.

package org.example.testquestion.classes.librarysystem

/**
 * Library Sınıfı:
 *
 * Primary constructor ile name ve books değişkenlerini alsın. books, kütüphanede bulunan kitapların listesini tutsun.
 * addBook, removeBook ve findBook metodlarını ekleyin. Bu metodlar, kütüphane koleksiyonunu yönetmek için kullanılsın.
 */

class Library(val name: String) {
    val books = mutableListOf<Book>()

    // Kitap ekleme fonkisoyonu
    fun addBook(book: Book) {
        books.add(book)
        println("${book.title} kütüphaneye eklendi.")
    }

    // Kitap silme fonksiyonu
    fun removeBook(book: Book) {
        books.remove(book)
        println("${book.title} kütüphaneden kaldırıldı.")
    }

    // Kitap numarasına göre kitap arama fonksiyonu
    fun findBook(isbn: String): Book? {
        return books.find { it.isbn == isbn }
    }

    // Kütüphanedeki mevcut kitapları listeleme fonksiyonu
    fun getBooksList() = books.toList()
}