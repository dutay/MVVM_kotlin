package com.dxd.androidx.mvvm_kotlin.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.dxd.androidx.mvvm_kotlin.R
import com.dxd.androidx.mvvm_kotlin.bean.MpBean
import com.dxd.androidx.mvvm_kotlin.databinding.AdapterMainItemBinding
import java.util.*

/**
 * author : gavin_du
 * date : 2021/5/19 15:04
 * description :
 */
class MainAdapter(context: Context?) :
    RecyclerView.Adapter<MainAdapter.ViewHolder?>() {
    private var list: MutableList<MpBean> = ArrayList<MpBean>()
    private val inflater: LayoutInflater = LayoutInflater.from(context)


    inner class ViewHolder(binding: AdapterMainItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        val binding: AdapterMainItemBinding = binding

    }

    override fun getItemCount(): Int {
        return list.size
    }

    fun setList(list: MutableList<MpBean>) {
        this.list = list
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val adapterMainBinding: AdapterMainItemBinding =
            DataBindingUtil.inflate(inflater, R.layout.adapter_main_item, parent, false)
        return ViewHolder(adapterMainBinding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val bean: MpBean = list[position]
        holder.binding.mp = bean
        holder.binding.tvName.text = "Name: "
    }
}
