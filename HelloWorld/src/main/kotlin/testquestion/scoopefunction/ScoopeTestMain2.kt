//Created by canVarli on 7/27/2024.

package org.example.testquestion.scoopefunction

data class Book(var title: String, var author: String)

class Library {
    private val books = mutableListOf<Book>()

    // Kitap ekleme fonksiyonu
    fun addBook(book: Book) {
        books.add(book)
    }

    // Kitapları listeleme fonksiyonu
    fun listBooks() {
        books.forEach {
            println("Title: ${it.title}, Author: ${it.author}")
        }
    }
}

fun main() {
    val library = Library()

    // 'apply' fonksiyonunu kullanarak yeni bir kitap oluşturun ve kütüphaneye ekleyin.
    // Kitap bilgileri: Title = "The Catcher in the Rye", Author = "J.D. Salinger"

    val newBook = Book("The Catcher in the Rye", "J.D. Salinger").apply {
        library.addBook(this)
    }

    // 'with' fonksiyonunu kullanarak kütüphanedeki tüm kitapları listeleyin.
    with(library) {
        listBooks()
    }
}
