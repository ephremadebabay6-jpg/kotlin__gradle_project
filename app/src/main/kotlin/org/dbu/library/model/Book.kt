package org.dbu.library.model

data class Book(
<<<<<<< HEAD
    val isbn: String,
    val title: String,
    val author: String,
    val year: Int,
    val isAvailable: Boolean = true
=======
        val isbn: String,
        val title: String,
        val author: String,
        val year: Int,
        var isAvailable: Boolean = true
>>>>>>> 3a6bc0e (I am Andualem I Completed Kotlin Library Management System project)
)