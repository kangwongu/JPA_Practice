package com.jpauseshop.global.model

import jakarta.persistence.Embeddable

// 내장 타입
@Embeddable
class Address(
    val city: String,
    val street: String,
    val zipCode: String,
) {
}