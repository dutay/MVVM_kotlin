package com.dxd.androidx.mvvm_kotlin.viewmodel

import android.app.Application
import android.content.Context
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.dxd.androidx.mvvm_kotlin.adapter.MainAdapter
import com.dxd.androidx.mvvm_kotlin.base.BaseData
import com.dxd.androidx.mvvm_kotlin.bean.MpBean
import com.dxd.androidx.mvvm_kotlin.model.MainModel
import io.reactivex.rxjava3.annotations.NonNull
import io.reactivex.rxjava3.observers.DefaultObserver

/**
 * author : gavin_du
 * date : 2021/5/19 14:31
 * description :
 */
class MainViewModel(application: Application) : AndroidViewModel(application){

    private val mainModel: MainModel? = MainModel.getInstance()
    private var mContext: Context? = null
    var mainAdapter: MainAdapter? = null

    private val mutableLiveData: MutableLiveData<MutableList<MpBean>> =
        MutableLiveData()

    fun getMutableLiveData(): MutableLiveData<MutableList<MpBean>>? {
        return mutableLiveData
    }

    init {
        mContext = application
        mainAdapter = MainAdapter(application)
    }


    fun getMpData() {
        mainModel?.subscribe(object : DefaultObserver<BaseData<MutableList<MpBean>>?>() {
            override fun onError(e: @NonNull Throwable?) {
                Log.d("gavin", e!!.message!!)
            }

            override fun onComplete() {}

            override fun onNext(t: BaseData<MutableList<MpBean>>?) {
                mutableLiveData.postValue(t?.getData())
            }
        })

    }


}