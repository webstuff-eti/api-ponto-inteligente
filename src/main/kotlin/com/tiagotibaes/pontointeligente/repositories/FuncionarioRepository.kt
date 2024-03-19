package com.tiagotibaes.pontointeligente.repositories

import com.tiagotibaes.pontointeligente.documents.Funcionario
import org.springframework.data.mongodb.repository.MongoRepository

interface FuncionarioRepository : MongoRepository<Funcionario, String> {

    fun findByEmail(email: String): Funcionario?
    fun findByCpf(cpf: String): Funcionario?
}