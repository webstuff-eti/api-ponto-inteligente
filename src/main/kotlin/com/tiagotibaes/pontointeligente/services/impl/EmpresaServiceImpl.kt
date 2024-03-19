package com.tiagotibaes.pontointeligente.services.impl

import com.tiagotibaes.pontointeligente.documents.Empresa
import com.tiagotibaes.pontointeligente.repositories.EmpresaRepository
import com.tiagotibaes.pontointeligente.services.EmpresaService
import org.springframework.stereotype.Service

@Service
class EmpresaServiceImpl(val empresaRepository: EmpresaRepository) : EmpresaService {


    override fun buscarPorCnpj(cnpj: String): Empresa? {
        return empresaRepository.findByCnpj(cnpj)
    }

    override fun criar(empresa: Empresa): Empresa = empresaRepository.save(empresa)

}