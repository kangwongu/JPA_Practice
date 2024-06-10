package com.jpauseshop.item.infrastructure.entity

import jakarta.persistence.DiscriminatorValue
import jakarta.persistence.Entity

@Entity
// D타입 구분자
@DiscriminatorValue("movie")
class MovieEntity(
    val director: String,
    val actor: String,
) : ItemEntity() {
}