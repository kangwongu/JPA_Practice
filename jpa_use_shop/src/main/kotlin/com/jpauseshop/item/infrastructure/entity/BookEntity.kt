package com.jpauseshop.item.infrastructure.entity

import jakarta.persistence.DiscriminatorValue
import jakarta.persistence.Entity

@Entity
// D타입 구분자
@DiscriminatorValue("book")
class BookEntity(
    val author: String,
    val isbn: String,
) : ItemEntity() {
}