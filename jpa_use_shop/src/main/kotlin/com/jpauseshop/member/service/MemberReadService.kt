package com.jpauseshop.member.service

import com.jpauseshop.member.domain.Member
import com.jpauseshop.member.service.port.MemberRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional(readOnly = true)
class MemberReadService(
    private val memberRepository: MemberRepository,
) {

    // 전체 회원 조회
    fun findAllMembers(): List<Member> {
        return memberRepository.findAll()
    }

    // 회원 조회
    fun findMember(memberId: Long): Member {
        return memberRepository.findOne(memberId)
    }

}