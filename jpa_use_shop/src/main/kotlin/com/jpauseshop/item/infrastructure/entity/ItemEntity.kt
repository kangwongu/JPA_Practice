package com.jpauseshop.item.infrastructure.entity

import jakarta.persistence.*

// 상속관계
@Entity
// 상속관계 전략
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
// D타입 지정
@DiscriminatorColumn(name = "item_type", columnDefinition = "string")
@Table(name = "item")
abstract class ItemEntity(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_id")
    val id: Long? = null,
    val name: String = "",
    val price: Int = 0,
    val stockQuantity: Int = 0,
) {
}