package com.jpauseshop.member.infrastructure

import com.jpauseshop.member.domain.Member
import com.jpauseshop.member.infrastructure.entity.MemberEntity
import com.jpauseshop.member.service.port.MemberRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Repository

@Repository
class MemberRepositoryImpl(
    private val memberJpaRepository: MemberJpaRepository,
) : MemberRepository {

    override fun save(member: Member): Member {
        return memberJpaRepository.save(member.toEntity()).toModel()
    }

    override fun findOne(id: Long): Member {
        return memberJpaRepository.findByIdOrNull(id)?.toModel()
            ?: throw IllegalStateException("Member with id $id not found")
    }

    override fun findAll(): List<Member> {
        return memberJpaRepository.findAll()
            .map { it.toModel() }
            .toList()
    }

    override fun findAllByName(name: String): List<Member> {
        return memberJpaRepository.findAllByName(name)
            .map { it.toModel() }
            .toList()
    }

}