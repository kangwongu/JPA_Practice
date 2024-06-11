package com.jpauseshop.categoryitem.infrastructure.entity

import com.jpauseshop.category.infrastructure.entity.CategoryEntity
import com.jpauseshop.item.infrastructure.entity.ItemEntity
import jakarta.persistence.*

@Entity
@Table(name = "category_item")
class CategoryItemEntity(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    val category: CategoryEntity,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "item_id")
    val item: ItemEntity
) {
}