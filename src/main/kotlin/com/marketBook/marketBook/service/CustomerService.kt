package com.marketBook.marketBook.service

import com.marketBook.marketBook.model.CustomerModel
import com.marketBook.marketBook.repository.CustomerRepository
import org.springframework.stereotype.Service

@Service
class CustomerService(
    val customerRepository: CustomerRepository
) {

    fun createCustomer(customer: CustomerModel) = customerRepository.save(customer)

    fun getCustomers(name: String?): MutableIterable<CustomerModel> {
        name?.let {
            return customerRepository.findByName(it)
        }
        return customerRepository.findAll()
    }

    fun getCustomerById(id: Int) = customerRepository.findById(id)

    fun updateCustomer(customer: CustomerModel) =
        if(!customerRepository.existsById(customer.id!!)) throw Exception()
        else customerRepository.save(customer)

    fun deleteCustomer(id: Int) =
        if(!customerRepository.existsById(id)) throw Exception()
        else customerRepository.deleteById(id)

}