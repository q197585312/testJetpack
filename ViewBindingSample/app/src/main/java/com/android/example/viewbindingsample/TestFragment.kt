package com.android.example.viewbindingsample

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.android.example.viewbindingsample.databinding.TestLayoutBinding

class TestFragment: Fragment(R.layout.test_layout) {
    var bindTestFragment:TestLayoutBinding?=null
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        bindTestFragment=null
    }
}