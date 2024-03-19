package com.tiagotibaes.pontointeligente.services

import com.tiagotibaes.pontointeligente.documents.Empresa

interface EmpresaService {

    fun buscarPorCnpj(cnpj: String): Empresa?

    fun criar(empresa: Empresa): Empresa

}