package com.example.android.persistence.test

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

public class TestActivity :AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val observer=LifeObserver()
        lifecycle.addObserver(observer)
    }
}