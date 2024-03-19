package com.tiagotibaes.pontointeligente.services.impl

import com.tiagotibaes.pontointeligente.documents.Funcionario
import com.tiagotibaes.pontointeligente.repositories.FuncionarioRepository
import com.tiagotibaes.pontointeligente.services.FuncionarioService
import org.springframework.stereotype.Service

@Service
class FuncionarioServiceImpl(val funcionarioRepository: FuncionarioRepository) :  FuncionarioService {

    override fun criar(funcionario: Funcionario): Funcionario = funcionarioRepository.save(funcionario)

    override fun buscarPorCpf(cpf: String): Funcionario? {
        return funcionarioRepository.findByCpf(cpf)
    }

    override fun buscarPorEmail(email: String): Funcionario? {
        return funcionarioRepository.findByEmail(email)
    }

    override fun buscarPorId(id: String): Funcionario? {
        return funcionarioRepository.findById(id).get()
    }


}