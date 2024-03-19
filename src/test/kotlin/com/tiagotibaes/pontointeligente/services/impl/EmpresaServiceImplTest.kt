package com.tiagotibaes.pontointeligente.services.impl

import com.tiagotibaes.pontointeligente.documents.Empresa
import com.tiagotibaes.pontointeligente.documents.Funcionario
import com.tiagotibaes.pontointeligente.enums.PerfilEnum
import com.tiagotibaes.pontointeligente.repositories.EmpresaRepository
import com.tiagotibaes.pontointeligente.services.EmpresaService
import com.tiagotibaes.pontointeligente.utils.SenhaUtils

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.BDDMockito
import org.mockito.Mockito
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.data.mongo.AutoConfigureDataMongo
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.test.context.ActiveProfiles
import java.util.Optional


@SpringBootTest
@ActiveProfiles("test")
@AutoConfigureDataMongo
class EmpresaServiceImplTest {

    @Autowired
    val empresaService: EmpresaService? = null

    @MockBean
    private val empresaRepository: EmpresaRepository? = null

    private val CNPJ = "41494789000161"

    @BeforeEach
    @Throws(Exception::class)
    fun setUp() {
        BDDMockito.given(empresaRepository?.save(Mockito.any(Empresa::class.java))).willReturn(empresa())
        BDDMockito.given(empresaRepository?.findByCnpj(CNPJ)).willReturn(empresa())
    }

    @Test
    fun testCriarEmpresa() {
        val empresa: Empresa? = empresaService?.criar(empresa())
        Assertions.assertNotNull(empresa)
    }

    @Test
    fun testBuscarEmpresaPorCnpj() {
        val empresa: Empresa? = empresaService?.buscarPorCnpj(CNPJ)
        Assertions.assertNotNull(empresa)
    }


    private fun empresa(): Empresa = Empresa("1","Razão Social", "41494789000161")


}