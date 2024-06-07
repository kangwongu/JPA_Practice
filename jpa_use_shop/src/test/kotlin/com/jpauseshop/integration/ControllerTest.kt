package com.jpauseshop.integration

import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.web.servlet.MockMvc

// 테스트할 컨트롤러를 추가하자
@WebMvcTest(controllers = [])
abstract class ControllerTest {

    @Autowired
    internal lateinit var mockMvc: MockMvc

    @Autowired
    internal lateinit var objectMapper: ObjectMapper
}
