package com.jpauseshop.orderitem.infrastructure.entity

import com.jpauseshop.item.infrastructure.entity.ItemEntity
import com.jpauseshop.order.infrastructure.entity.OrderEntity
import jakarta.persistence.*

@Entity
@Table(name = "order_item")
class OrderItemEntity(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "item_id")
    val item: ItemEntity,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id")
    val order: OrderEntity,

    val orderPrice: Int,
    val count: Int
) {

}
