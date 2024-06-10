package com.jpauseshop.order.infrastructure.entity

import com.jpauseshop.delivery.infrastructure.entity.DeliveryEntity
import com.jpauseshop.member.infrastructure.entity.MemberEntity
import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name = "orders")
class OrderEntity(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    val id: Long? = null,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    val member: MemberEntity,

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "delivery_id")
    val delivery: DeliveryEntity,

    val orderDate: LocalDateTime,

    val status: OrderStatus,

    ) {
}