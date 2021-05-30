package com.kayro.santanderdevweek.data.local

import com.kayro.santanderdevweek.data.Cartao
import com.kayro.santanderdevweek.data.Cliente
import com.kayro.santanderdevweek.data.Conta

class FakeData {
    fun getLocalData() : Conta {
        val cartao = Cartao("0331111")
        val cliente = Cliente("Kayro")
        return Conta(
            "445666-5",
            "6665-4",
            "RS 2.315,54",
            "4.423,54",
            cliente,
            cartao
        );
    }
}