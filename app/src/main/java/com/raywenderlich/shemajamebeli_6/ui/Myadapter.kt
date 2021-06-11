package com.raywenderlich.shemajamebeli_6.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.raywenderlich.shemajamebeli_6.ItemListener
import com.raywenderlich.shemajamebeli_6.data.Results
import com.raywenderlich.shemajamebeli_6.databinding.ItemMoviesBinding

class Myadapter(private val itemListener: ItemListener):RecyclerView.Adapter<Myadapter.ViewHolder>() {

    var dataList: List<Results> = emptyList()
        set(value) {
            field = value
        }

    inner class ViewHolder(private val binding: ItemMoviesBinding):RecyclerView.ViewHolder(binding.root),View.OnClickListener{
        private lateinit var current: Results
        fun bind(){

            binding.button.setOnClickListener(this)

            current = dataList[adapterPosition]
            binding.titleTxt.text = current.title
            binding.descriptionTxt.text = current.overview
            Glide.with(itemView.context).load(img500+current.posterPath)
                .into(binding.imgview)
        }

        override fun onClick(v: View?) {
            if (v == binding.button){
                itemListener.img(adapterPosition)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        return ViewHolder(ItemMoviesBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind()
    }

    override fun getItemCount()=dataList.size


    companion object{
        const val img500 = "https://image.tmdb.org/t/p/w200/"
    }

}
