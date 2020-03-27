package com.example.testjetpack.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.testjetpack.App

open class BaseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    var instanceProvider: ViewModelProvider? = null

    fun getAppViewModelProvider(): ViewModelProvider =
        (application as App).getAppViewModelProvider()

    fun getActivityViewModelProvider(): ViewModelProvider = instanceProvider ?: ViewModelProvider(
        this,
        defaultViewModelProviderFactory
    )

}


