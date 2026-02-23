package org.dbu.library.service

import org.dbu.library.model.Book
<<<<<<< HEAD
import org.dbu.library.repository.LibraryRepository

class DefaultLibraryService(
    private val repository: LibraryRepository
) : LibraryService {

 TODO: implement the methods
=======
import org.dbu.library.model.Patron
import org.dbu.library.repository.LibraryRepository

class DefaultLibraryService(
        private val repository: LibraryRepository
) : LibraryService {

 override fun addBook(book: Book): Boolean {
  return repository.addBook(book)
 }

 override fun borrowBook(patronId: String, isbn: String): BorrowResult {
  val patron = repository.findPatron(patronId) ?: return BorrowResult.PATRON_NOT_FOUND
  val book = repository.findBook(isbn) ?: return BorrowResult.BOOK_NOT_FOUND

  if (!book.isAvailable) return BorrowResult.NOT_AVAILABLE
  if (patron.borrowedBooks.size >= 3) return BorrowResult.LIMIT_REACHED

  patron.borrowedBooks.add(book)
  book.isAvailable = false
  repository.updatePatron(patron)
  repository.updateBook(book)
  return BorrowResult.SUCCESS
 }

 override fun returnBook(patronId: String, isbn: String): Boolean {
  val patron = repository.findPatron(patronId) ?: return false
  val book = repository.findBook(isbn) ?: return false

  if (patron.borrowedBooks.remove(book)) {
   book.isAvailable = true
   repository.updateBook(book)
   repository.updatePatron(patron)
   return true
  }
  return false
 }

 override fun search(query: String): List<Book> {
  return repository.getAllBooks().filter {
   it.title.contains(query, ignoreCase = true) ||
           it.author.contains(query, ignoreCase = true)
  }
 }
>>>>>>> 3a6bc0e (I am Andualem I Completed Kotlin Library Management System project)
}