package com.timmitof.exampractice.adapters

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.timmitof.exampractice.R
import com.timmitof.exampractice.fragments.InDetailNewsFragment
import com.timmitof.exampractice.models.NewsList

class NewsListAdapter(private val array: java.util.ArrayList<NewsList>, private val context: FragmentActivity) :
    RecyclerView.Adapter<NewsListAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val image = view.findViewById<ImageView>(R.id.imageView_news)
        val title = view.findViewById<TextView>(R.id.title_news)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_news, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = array[position]
        holder.title.text = item.titleNews
        Glide.with(holder.itemView).load(item.image).into(holder.image)

        holder.itemView.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("TITLE", item.titleNews)
            bundle.putString("IMAGE", item.image)
            bundle.putString("DESCRIPTION", item.description)


            context.supportFragmentManager.beginTransaction()
                .replace(R.id.container, InDetailNewsFragment::class.java, bundle)
                .addToBackStack(null).commit()
        }
    }

    override fun getItemCount(): Int {
        return array.size
    }

}