package com.timmitof.exampractice.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.timmitof.exampractice.R

class InDetailNewsFragment : Fragment() {
    lateinit var title: TextView
    lateinit var imageView: ImageView
    lateinit var description: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_in_detail_news, container, false)
        title = view.findViewById(R.id.title_textView)
        imageView = view.findViewById(R.id.image_news)
        description = view.findViewById(R.id.description)

        val titleNews = requireArguments().getSerializable("TITLE")
        val descriptionNews = requireArguments().getSerializable("DESCRIPTION")
        val image = requireArguments().getSerializable("IMAGE")


        title.text = titleNews.toString()
        Glide.with(this).load(image).into(imageView)
        description.text = descriptionNews.toString()

        return view
    }
}