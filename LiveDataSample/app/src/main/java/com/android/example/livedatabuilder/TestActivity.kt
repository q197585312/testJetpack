package com.android.example.livedatabuilder

import android.os.Bundle
import android.widget.BaseAdapter
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.android.example.livedata.databinding.TestBinding

class TestActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        val bind1= DataBindingUtil.setContentView<TestBinding>(this, R.layout.test)
        val bind=TestBinding.inflate(layoutInflater)
        setContentView(bind.root)
        val userData = UserData("aasdsadsas", 12)
        bind.test=userData
        bind.tvNick.text= userData.userName
        val listOf = listOf<String>("a", "b", "c", "d")
        bind.rcContent.layoutManager=LinearLayoutManager(this)
        bind.rcContent.adapter=RecyclerView.a()
        /*  bind.tvAge.text="${test.age}"
          bind.tvName.text= test.userName*/
    }
}