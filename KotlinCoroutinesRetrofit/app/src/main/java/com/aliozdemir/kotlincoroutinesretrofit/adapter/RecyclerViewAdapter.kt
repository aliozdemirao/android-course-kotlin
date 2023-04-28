package com.aliozdemir.kotlincoroutinesretrofit.adapter

import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.aliozdemir.kotlincoroutinesretrofit.databinding.RowLayoutBinding
import com.aliozdemir.kotlincoroutinesretrofit.model.CryptoModel

class RecyclerViewAdapter (private val cryptoList : ArrayList<CryptoModel>, private val listener : Listener) : RecyclerView.Adapter<RecyclerViewAdapter.RowHolder>(){

    interface Listener{
        fun onItemClick(cryptoModel : CryptoModel)
    }

    private val colors : Array<String> = arrayOf("#000000", "#FF0000", "#0000FF", "#808080", "#800080", "#000080", "#FF00FF", "#800000")

    class RowHolder (val binding: RowLayoutBinding) : RecyclerView.ViewHolder(binding.root){

        fun bind(cryptoModel: CryptoModel, colors: Array<String>, position: Int, listener: Listener){

            itemView.setOnClickListener{
                listener.onItemClick(cryptoModel)
            }

            itemView.setBackgroundColor(Color.parseColor(colors[position % 8]))
            binding.textName.text = cryptoModel.currency
            binding.textPrice.text = cryptoModel.price

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowHolder {
        val binding = RowLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return RowHolder(binding)
    }

    override fun onBindViewHolder(holder: RowHolder, position: Int) {
        holder.bind(cryptoList[position], colors, position, listener)
    }

    override fun getItemCount(): Int {
        return cryptoList.count()
    }
}
