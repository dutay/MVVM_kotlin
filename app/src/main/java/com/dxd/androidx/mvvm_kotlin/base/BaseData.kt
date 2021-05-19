package com.dxd.androidx.mvvm_kotlin.base

/**
 * author : gavin_du
 * date : 2021/5/19 14:41
 * description :
 */
class BaseData<T> {
    private var errorCode = 0
    private var errorMsg: String? = null
    private var data: T? = null

    fun getErrorCode(): Int {
        return errorCode
    }

    fun setErrorCode(errorCode: Int) {
        this.errorCode = errorCode
    }

    fun getErrorMsg(): String? {
        return errorMsg
    }

    fun setErrorMsg(errorMsg: String?) {
        this.errorMsg = errorMsg
    }

    fun getData(): T? {
        return data
    }

    fun setData(data: T) {
        this.data = data
    }
}