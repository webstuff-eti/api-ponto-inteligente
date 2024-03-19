package com.tiagotibaes.pontointeligente.services

import com.tiagotibaes.pontointeligente.documents.Funcionario

interface FuncionarioService {

    fun criar(funcionario: Funcionario): Funcionario

    fun buscarPorCpf(cpf: String): Funcionario?

    fun buscarPorEmail(email: String): Funcionario?

    fun buscarPorId(id: String): Funcionario?
}