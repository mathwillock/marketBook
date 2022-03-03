package com.marketBook.marketBook.repository

import com.marketBook.marketBook.model.BookModel
import org.springframework.data.repository.CrudRepository

interface BookRepository: CrudRepository<BookModel, Int>