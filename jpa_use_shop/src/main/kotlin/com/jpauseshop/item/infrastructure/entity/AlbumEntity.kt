package com.jpauseshop.item.infrastructure.entity

import jakarta.persistence.DiscriminatorValue
import jakarta.persistence.Entity

@Entity
// D타입 구분자
@DiscriminatorValue("album")
class AlbumEntity(
    val artist: String,
    val etc: String,
) : ItemEntity() {
}