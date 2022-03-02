package com.marketBook.marketBook.controller

import com.marketBook.marketBook.controller.request.PostCustomerRequest
import com.marketBook.marketBook.extension.toCustomerModel
import com.marketBook.marketBook.service.CustomerService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("customers/")
class CustomerController(
    val customerService: CustomerService
) {

    @GetMapping
    fun getCustomer(@RequestParam name: String?) = customerService.getCustomers(name)

    @GetMapping("{id}")
    fun getCustomerById(@PathVariable id: Int) = customerService.getCustomerById(id)

    @PostMapping
    fun createCustomer(@RequestBody customer: PostCustomerRequest) =
        customerService.createCustomer(customer.toCustomerModel())

    @PutMapping("{id}")
    fun updateCustomer(@PathVariable id: Int, @RequestBody customer: PostCustomerRequest) =
        customerService.updateCustomer(customer.toCustomerModel(id))

    @DeleteMapping("{id}")
    fun deleteCustomer(@PathVariable id: Int) = customerService.deleteCustomer(id)
}