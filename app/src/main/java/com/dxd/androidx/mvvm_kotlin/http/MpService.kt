package com.dxd.androidx.mvvm_kotlin.http

import com.dxd.androidx.mvvm_kotlin.base.BaseData
import com.dxd.androidx.mvvm_kotlin.bean.MpBean
import io.reactivex.rxjava3.core.Observable
import retrofit2.http.GET

/**
 * author : gavin_du
 * date : 2021/5/19 14:39
 * description :
 */
interface MpService {

    /**
     * request MP data
     * @return MP list
     */
    @GET("wxarticle/chapters/json")
    fun getListData(): Observable<BaseData<MutableList<MpBean>>?>?

}