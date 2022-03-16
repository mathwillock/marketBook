package com.marketBook.marketBook.service

import com.marketBook.marketBook.model.BookModel
import com.marketBook.marketBook.repository.BookRepository
import org.springframework.stereotype.Service

@Service
class BookService(
    val bookRepository: BookRepository
) {

    fun createBook(book: BookModel) = bookRepository.save(book)

    fun getBooks() = bookRepository.findAll()

    fun getBooksById(id: Int) = bookRepository.findById(id)

    fun updateBook(id: Int, book: BookModel) =
        if(!bookRepository.existsById(id)) throw Exception()
        else bookRepository.save(book)

    fun deleteBook(id: Int) =
        if(!bookRepository.existsById(id)) throw Exception()
        else bookRepository.deleteById(id)
}