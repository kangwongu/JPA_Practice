package com.jpauseshop.member.infrastructure

import com.jpauseshop.member.infrastructure.entity.MemberEntity
import org.springframework.data.jpa.repository.JpaRepository

interface MemberJpaRepository : JpaRepository<MemberEntity, Long> {

    fun findAllByName(name: String): List<MemberEntity>

}