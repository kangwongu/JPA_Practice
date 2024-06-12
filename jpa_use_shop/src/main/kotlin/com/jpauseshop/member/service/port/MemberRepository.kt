package com.jpauseshop.member.service.port

import com.jpauseshop.member.domain.Member

interface MemberRepository {

    fun save(member: Member): Member

    fun findOne(id: Long): Member

    fun findAll(): List<Member>

    fun findAllByName(name: String): List<Member>
}