package com.jpauseshop.member.domain

import com.jpauseshop.global.model.Address
import com.jpauseshop.member.infrastructure.entity.MemberEntity

class Member(
    val id: Long? = null,
    val name: String,
    val address: Address,
) {

    fun toEntity(): MemberEntity {
        return MemberEntity(
            name = name,
            address = address
        )
    }
}