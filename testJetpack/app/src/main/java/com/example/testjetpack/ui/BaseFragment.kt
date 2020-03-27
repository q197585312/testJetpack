package com.example.testjetpack.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.testjetpack.App

open class BaseFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    fun getAppViewModelProvider(): ViewModelProvider =
        (activity as BaseActivity).getAppViewModelProvider()

    var instanceProvider: ViewModelProvider? = null
    fun getFragmentViewModelProvider(): ViewModelProvider = instanceProvider ?: ViewModelProvider(
        this,
        defaultViewModelProviderFactory
    )
}