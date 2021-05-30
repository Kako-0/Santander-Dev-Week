package com.kayro.santanderdevweek.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kayro.santanderdevweek.data.Conta
import com.kayro.santanderdevweek.data.local.FakeData

class MainViewModel : ViewModel() {
    private val mutableLiveData: MutableLiveData<Conta> = MutableLiveData();

    fun buscarContaCliente() : LiveData<Conta>{
        mutableLiveData.value = FakeData().getLocalData()

        return mutableLiveData;
    }
}