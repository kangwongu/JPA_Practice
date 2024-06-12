package com.jpauseshop.member.infrastructure.entity

import com.jpauseshop.global.model.Address
import com.jpauseshop.member.domain.Member
import jakarta.persistence.Column
import jakarta.persistence.Embedded
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "member")
class MemberEntity(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
    var id: Long? = null,

    val name: String,

    // 내장 타입을 엔티티에 포함했다는 의미
    @Embedded
    val address: Address,

) {

    fun toModel(): Member {
        return Member(
            id = id,
            name = name,
            address = address
        )

    }
}