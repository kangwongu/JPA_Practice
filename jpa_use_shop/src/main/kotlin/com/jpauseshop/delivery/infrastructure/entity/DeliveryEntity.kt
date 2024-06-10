package com.jpauseshop.delivery.infrastructure.entity

import com.jpauseshop.global.model.Address
import jakarta.persistence.*

@Entity
@Table(name = "delivery")
class DeliveryEntity(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "delivery_id")
    val id: Long? = null,

    @Embedded
    val address: Address,

    @Enumerated(EnumType.STRING)
    val status: DeliveryStatus,

    ) {
}