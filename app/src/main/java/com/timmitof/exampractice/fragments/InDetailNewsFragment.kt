package com.timmitof.exampractice.fragments

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.ScrollView
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.timmitof.exampractice.Categories
import com.timmitof.exampractice.R
import com.timmitof.exampractice.models.NewsList

class InDetailNewsFragment : Fragment() {
    lateinit var title: TextView
    lateinit var imageView: ImageView
    lateinit var description: TextView
    lateinit var backgroundNews: ScrollView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_in_detail_news, container, false)
        title = view.findViewById(R.id.title_textView)
        imageView = view.findViewById(R.id.image_news)
        description = view.findViewById(R.id.description)
        backgroundNews = view.findViewById(R.id.detail_news)

        val news = arguments?.getSerializable("NEWS") as NewsList


        title.text = news.titleNews
        Glide.with(this).load(news.image).into(imageView)
        description.text = news.description

        when(news.categoryId){
            Categories.Criminal.ordinal -> backgroundNews.setBackgroundColor(Color.parseColor("#FF03DAC5"))
            Categories.Natural.ordinal -> backgroundNews.setBackgroundColor(Color.parseColor("#BA4BF6"))
            Categories.Political.ordinal -> backgroundNews.setBackgroundColor(Color.parseColor("#8DF64B"))
            Categories.Sport.ordinal -> backgroundNews.setBackgroundColor(Color.parseColor("#F6DA4B"))
        }

        when(news.categoryId){
            Categories.Criminal.ordinal -> description.setTextColor(Color.parseColor("#3E0060"))
            Categories.Natural.ordinal -> description.setTextColor(Color.parseColor("#930000"))
            Categories.Political.ordinal -> description.setTextColor(Color.parseColor("#000000"))
            Categories.Sport.ordinal -> description.setTextColor(Color.parseColor("#2D7500"))
        }

        return view
    }
}