package org.dbu.library.service

import org.dbu.library.model.Book

interface LibraryService {

    fun addBook(book: Book): Boolean
<<<<<<< HEAD

    fun borrowBook(patronId: String, isbn: String): BorrowResult

    fun returnBook(patronId: String, isbn: String): Boolean

=======
    fun borrowBook(patronId: String, isbn: String): BorrowResult
    fun returnBook(patronId: String, isbn: String): Boolean
>>>>>>> 3a6bc0e (I am Andualem I Completed Kotlin Library Management System project)
    fun search(query: String): List<Book>
}