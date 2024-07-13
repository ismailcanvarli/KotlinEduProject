//Created by canVarli on 7/13/2024.

package org.example.testquestion.classes.librarysystem

/**
 * Bu sınıfların hepsini kullanarak, aşağıdaki işlemleri gerçekleştiren bir main fonksiyonu yazın:
 *
 * Bir Librarian ve bir Member oluşturun.
 * Üç adet Book oluşturun.
 * Librarian tarafından kütüphaneye kitap ekleyin.
 * Member bir kitap ödünç alsın ve geri versin.
 * Bir Loan oluşturun ve son teslim tarihini yazdırın.
 */

fun main() {
    // Nesneleri oluşturuyoruz
    val librarian = Librarian("Alice", "M001", "E001")
    val member = Member("Bob", "M002")

    // Kitapları oluşturuyoruz
    val book1 = Book("1984", "George Orwell", "1234567890", 5)
    val book2 = Book("Brave New World", "Aldous Huxley", "0987654321", 3)
    val book3 = Book("Fahrenheit 451", "Ray Bradbury", "1122334455", 2)

    // Kütüphaneyi oluşturuyoruz
    val library = Library("Beylikdüzü AKM")

    // Kitapları kütüphaneye ekliyoruz
    librarian.manageBook(book1, library, "add")
    librarian.manageBook(book2, library, "add")
    librarian.manageBook(book3, library, "add")

    // Üye kitap ödünç alıyor ve iade ediyor
    member.barrowBook(book1)
    member.returnBook(book1)

    // Ödünç alınan kitapların listesini alıyoruz
    val loan = Loan(book2, member, "07/13/2024")
    println(loan.getDueDate())

}