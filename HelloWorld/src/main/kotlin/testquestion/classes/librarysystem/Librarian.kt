//Created by canVarli on 7/13/2024.

package org.example.testquestion.classes.librarysystem

/**
 *Librarian Sınıfı:
 *
 * Member sınıfından miras alsın.
 * Primary constructor ile name, memberId ve employeeId değişkenlerini alsın.
 * employeeId değişkeni private olmalı ve sadece sınıf içinden erişilebilmeli.
 * manageBook metodu ekleyin, bu metod bir kitabın kütüphaneye eklenmesini veya silinmesini sağlasın.
 */

class Librarian(name: String, memberId: String, private val employeeId: String) : Member(name, memberId) {
    fun manageBook(book: Book, library: Library, action: String) {
        when (action) {
            "add" -> library.addBook(book)
            "remove" -> library.removeBook(book)
            else -> println("Geçersiz işlem.")
        }
    }
}