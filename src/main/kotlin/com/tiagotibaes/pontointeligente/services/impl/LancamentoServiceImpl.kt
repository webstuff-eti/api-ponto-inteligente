package com.tiagotibaes.pontointeligente.services.impl

import com.tiagotibaes.pontointeligente.documents.Lancamento
import com.tiagotibaes.pontointeligente.repositories.LancamentoRepository
import com.tiagotibaes.pontointeligente.services.LancamentoService
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest
import org.springframework.stereotype.Service

@Service
class LancamentoServiceImpl(val lancamentoRepository: LancamentoRepository) :  LancamentoService {

    override fun buscarPorFuncionarioId(funcionarioId: String, pageRequest: PageRequest): Page<Lancamento> {
        return lancamentoRepository.findByFuncionarioId(funcionarioId, pageRequest);
    }

    override fun buscarPorId(id: String): Lancamento? {
        return lancamentoRepository.findById(id).get()
    }

    override fun criar(lancamento: Lancamento) = lancamentoRepository.save(lancamento)

    override fun remover(id: String) = lancamentoRepository.deleteById(id)


}