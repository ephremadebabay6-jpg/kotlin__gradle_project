package org.dbu.library.model

data class Patron(
<<<<<<< HEAD
    val id: String,
    val name: String,
    val borrowedBooks: List<String> = emptyList()
=======
        val id: String,
        val name: String,
        val email: String,
        val phone: String,
        val borrowedBooks: MutableList<Book> = mutableListOf()
>>>>>>> 3a6bc0e (I am Andualem I Completed Kotlin Library Management System project)
)