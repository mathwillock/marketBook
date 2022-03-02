package com.marketBook.marketBook.repository

import com.marketBook.marketBook.model.CustomerModel
import org.springframework.data.repository.CrudRepository

interface CustomerRepository : CrudRepository<CustomerModel, Int> {
    fun findByName(name: String):  MutableList<CustomerModel>
}