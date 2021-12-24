package com.timmitof.exampractice.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.timmitof.exampractice.Constants
import com.timmitof.exampractice.R
import com.timmitof.exampractice.models.NewsList

class NewsListAdapter(private val array: ArrayList<NewsList>) :
    RecyclerView.Adapter<NewsListAdapter.ViewHolder>() {
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imageView = view.findViewById<ImageView>(R.id.imageView_news)
        val textView = view.findViewById<TextView>(R.id.title_news)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_news, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = array[position]
        holder.textView.text = holder.itemView.context.getString(item.titleNews)
    }

    override fun getItemCount(): Int {
        return array.size
    }

}