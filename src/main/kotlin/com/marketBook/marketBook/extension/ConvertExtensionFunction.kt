package com.marketBook.marketBook.extension

import com.marketBook.marketBook.controller.request.PostCustomerRequest
import com.marketBook.marketBook.model.CustomerModel

fun PostCustomerRequest.toCustomerModel() = CustomerModel(null, name = this.name, email = this.email)

fun PostCustomerRequest.toCustomerModel(id: Int) = CustomerModel(id, this.name, this.email)