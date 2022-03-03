package com.marketBook.marketBook.model

import com.marketBook.marketBook.enums.BookStatus
import java.math.BigDecimal
import javax.persistence.*

@Entity(name = "book")
data class BookModel(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int? = null,
    val name: String,
    val price: BigDecimal,

    @Enumerated(EnumType.STRING)
    val status: BookStatus? = null,

    @ManyToOne
    @JoinColumn(name = "customer_id")
    val customer: CustomerModel? = null,
)