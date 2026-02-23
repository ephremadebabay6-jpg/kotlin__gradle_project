package org.dbu.library.ui

import org.dbu.library.model.Book
<<<<<<< HEAD
import org.dbu.library.model.Patron
import org.dbu.library.repository.InMemoryLibraryRepository
import org.dbu.library.service.DefaultLibraryService


fun main() {

    val repository = InMemoryLibraryRepository()
    val service = DefaultLibraryService(repository)

    seedData(repository)

    var running = true

    while (running) {
        val choice = showMenu()
        running = handleMenuAction(choice, service, repository)
    }

    println("Goodbye 👋")
}

fun seedData(repository: InMemoryLibraryRepository) {

    repository.addBook(Book("1", "Clean Code", "Robert Martin", 2008))
    repository.addBook(Book("2", "Effective Java", "Joshua Bloch", 2018))

    repository.addPatron(Patron("P1", "Alice"))
=======
import org.dbu.library.repository.InMemoryLibraryRepository
import org.dbu.library.model.Patron
import org.dbu.library.service.DefaultLibraryService
import java.util.*

class ConsoleApp {

    private val repository = InMemoryLibraryRepository()
    private val service = DefaultLibraryService(repository)
    private val menu = MenuHandler(service)
    private val scanner = Scanner(System.`in`)

    fun start() {
        while (true) {
            println("\n--- Library Menu ---")
            println("1. Add Book")
            println("2. List All Books")
            println("3. Exit")
            print("Enter choice: ")
            when (scanner.nextLine()) {
                "1" -> {
                    print("ISBN: "); val isbn = scanner.nextLine()
                    print("Title: "); val title = scanner.nextLine()
                    print("Author: "); val author = scanner.nextLine()
                    print("Year: "); val year = scanner.nextLine().toInt()
                    val book = Book(isbn, title, author, year)
                    menu.addBook(book)
                    println("Book added successfully!")
                }
                "2" -> menu.listAllBooks()
                "3" -> {
                    println("Goodbye!")
                    return
                }
                else -> println("Invalid choice")
            }
        }
    }
}

fun main() {
    ConsoleApp().start()
>>>>>>> 3a6bc0e (I am Andualem I Completed Kotlin Library Management System project)
}