package com.example.banklineandroid.domain

data class Movimentacao(
    val id: Int,
    val dataHora: String,
    val descricao: String,
    val valor: Double,
    val tipo: TipoMovimentacao,
    //TODO mapear idCorrentista ->idConta
    val idCorrentista: Int
)
