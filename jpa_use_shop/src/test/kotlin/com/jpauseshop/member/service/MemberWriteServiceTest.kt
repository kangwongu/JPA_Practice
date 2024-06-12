package com.jpauseshop.member.service

import com.jpauseshop.global.model.Address
import com.jpauseshop.integration.IntegrationTest
import com.jpauseshop.member.domain.Member
import com.jpauseshop.member.service.port.MemberRepository
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired

class MemberWriteServiceTest @Autowired constructor(
    val memberWriteService: MemberWriteService,
    val memberRepository: MemberRepository,
) : IntegrationTest() {

    @Test
    @DisplayName("회원가입이 정상적으로 수행되면 DB에 저장된다")
    fun join() {
        // given
        val member = Member(
            name = "강원구",
            address = Address(
                city = "서울",
                street = "영동대로",
                zipCode = "11111"
            )
        )

        // when
        val savedId = memberWriteService.join(member)

        // then
        assertThat(savedId).isNotNull
        val result = memberRepository.findOne(savedId)
        assertThat(result.name).isEqualTo(member.name)
        assertThat(result.address.city).isEqualTo(member.address.city)
        assertThat(result.address.street).isEqualTo(member.address.street)
        assertThat(result.address.zipCode).isEqualTo(member.address.zipCode)
    }

    @Test
    @DisplayName("회원가입 시, 중복된 회원이 DB에 존재하면 예외가 반환된다")
    fun joinFail() {
        // given

        // when

        // then

    }
}