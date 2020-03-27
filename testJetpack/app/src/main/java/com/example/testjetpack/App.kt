package com.example.testjetpack

import android.app.Application
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelStore
import androidx.lifecycle.ViewModelStoreOwner

class App : Application(), ViewModelStoreOwner {
    override fun onCreate() {
        super.onCreate()

    }

    private var mAppViewModelStore: ViewModelStore? = null
    override fun getViewModelStore(): ViewModelStore = mAppViewModelStore ?: ViewModelStore()
    var instanceProvider: ViewModelProvider? = null

   public fun getAppViewModelProvider(): ViewModelProvider = instanceProvider ?: ViewModelProvider(
        this,
        ViewModelProvider.AndroidViewModelFactory.getInstance(this)
    )
}