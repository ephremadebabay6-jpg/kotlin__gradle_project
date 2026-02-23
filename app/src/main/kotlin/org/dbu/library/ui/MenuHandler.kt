package org.dbu.library.ui

import org.dbu.library.model.Book
import org.dbu.library.model.Patron
<<<<<<< HEAD
import org.dbu.library.repository.LibraryRepository
import org.dbu.library.service.BorrowResult
import org.dbu.library.service.LibraryService

fun handleMenuAction(
    choice: String,
    service: LibraryService,
    repository: LibraryRepository
): Boolean {

    return when (choice) {

        "1" -> {
            addBook(service)
            true
        }

        "2" -> {
            registerPatron(repository)
            true
        }

        "3" -> {
            borrowBook(service)
            true
        }

        "4" -> {
            returnBook(service)
            true
        }

        "5" -> {
            search(service)
            true
        }

        "6" -> {
            listAllBooks(repository)
            true
        }

        "0" -> false

        else -> {
            println("Invalid option")
            true
        }
    }
}

TODO: implement all required functions to handle the menu actions
=======
import org.dbu.library.service.LibraryService
import org.dbu.library.util.display

class MenuHandler(private val service: LibraryService) {

    fun addBook(book: Book) {
        service.addBook(book)
    }

    fun borrowBook(patronId: String, isbn: String) {
        service.borrowBook(patronId, isbn)
    }

    fun returnBook(patronId: String, isbn: String) {
        service.returnBook(patronId, isbn)
    }

    fun search(query: String): List<Book> {
        return service.search(query)
    }

    fun listAllBooks() {
        service.search("").forEach { println(it.display()) }
    }
}
>>>>>>> 3a6bc0e (I am Andualem I Completed Kotlin Library Management System project)
