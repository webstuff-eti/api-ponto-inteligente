package com.tiagotibaes.pontointeligente.utils


import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

class SenhaUtilsTest {

    //given
    private val senhaMocada = "123456"
    private val bCryptEncoder = BCryptPasswordEncoder()

    @Test
    fun testeGerarHashSenha(){

        //when
        val hash = SenhaUtils().gerarBcrypt(senhaMocada)

        //then
        assertTrue(bCryptEncoder.matches(senhaMocada, hash))

    }
}