package com.jpauseshop.member.service

import com.jpauseshop.member.domain.Member
import com.jpauseshop.member.service.port.MemberRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class MemberWriteService(
    private val memberRepository: MemberRepository,
) {

    // 회원가입
    fun join(member: Member): Long {
        // 중복 회원 검증
        validateDuplicateMember(member)

        val saveMember = memberRepository.save(member)

        return saveMember.id!!
    }

    // 어플리케이션단에서 중복을 막는 걸로 완전히 막아지지 못하기 때문에, DB단에서도 막자
    private fun validateDuplicateMember(member: Member) {
        val members = memberRepository.findAllByName(member.name)
        if (members.isNotEmpty()) {
            throw IllegalStateException("이미 존재하는 회원입니다")
        }
    }

}