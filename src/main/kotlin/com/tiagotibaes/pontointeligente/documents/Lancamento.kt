package com.tiagotibaes.pontointeligente.documents

import com.tiagotibaes.pontointeligente.enums.TypeEnum
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.Date

@Document
data class Lancamento ( @Id val id: String? = null,
                            val descricao: String? = "",
                            val localizacao: String? = "",
                            val tipo: TypeEnum,
                            val data: Date,
                            val funcionarioId: String

)