package com.dxd.androidx.mvvm_kotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.dxd.androidx.mvvm_kotlin.bean.MpBean
import com.dxd.androidx.mvvm_kotlin.databinding.ActivityMainBinding
import com.dxd.androidx.mvvm_kotlin.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {

    lateinit var mainBinding: ActivityMainBinding
    lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        mainViewModel.getMpData()
        mainBinding.rvMain.adapter = mainViewModel.mainAdapter
        mainViewModel.getMutableLiveData()?.observe(this,
            Observer<MutableList<MpBean>> {
                    it -> it?.let {
                mainViewModel.mainAdapter?.setList(it) }
            })





    }
}

