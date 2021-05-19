package com.dxd.androidx.mvvm_kotlin.model

import com.dxd.androidx.mvvm_kotlin.base.BaseData
import com.dxd.androidx.mvvm_kotlin.bean.MpBean
import com.dxd.androidx.mvvm_kotlin.http.HttpConfig
import com.dxd.androidx.mvvm_kotlin.http.MpService
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.core.Observer
import io.reactivex.rxjava3.observers.DefaultObserver
import io.reactivex.rxjava3.schedulers.Schedulers
import retrofit2.Retrofit
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

/**
 * author : gavin_du
 * date : 2021/5/19 14:44
 * description :
 */
class MainModel {
    private var mainModel: MainModel? = null
    private val retrofit: Retrofit = Retrofit.Builder().baseUrl(HttpConfig.BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
        .build()

    companion object{
        fun getInstance() : MainModel?{
            return MainModel();
        }
    }

    /**
     * get the proxy object of MpService
     * get the observable of proxy object
     * build a subscription relationship
     * @param observer observer
     */
    fun subscribe(observer: DefaultObserver<BaseData<MutableList<MpBean>>?>) {
        retrofit.create(MpService::class.java).getListData()
            ?.subscribeOn(Schedulers.io())
            ?.observeOn(AndroidSchedulers.mainThread())
            ?.subscribe(observer)
    }
}