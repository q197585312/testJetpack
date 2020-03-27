package com.example.testjetpack.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

public open class MainActivityViewModel : ViewModel() {
    val openDrawer = MutableLiveData<Boolean>()
    val str = MutableLiveData<String>()
}