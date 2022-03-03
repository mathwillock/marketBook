package com.marketBook.marketBook.controller

import com.marketBook.marketBook.model.BookModel
import com.marketBook.marketBook.service.BookService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("books/")
class BookController(
    val bookService: BookService
) {

    @PostMapping
    fun createBook(@RequestBody book: BookModel) = bookService.createBook(book)

    @GetMapping
    fun getBooks() = bookService.getBooks()

    @GetMapping("{id}")
    fun getBooksById(@PathVariable id: Int) = bookService.getBooksById(id)

}