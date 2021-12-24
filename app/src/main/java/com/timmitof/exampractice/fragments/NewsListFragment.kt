package com.timmitof.exampractice.fragments

import android.os.Bundle
import android.os.RecoverySystem
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.timmitof.exampractice.Constants
import com.timmitof.exampractice.R
import com.timmitof.exampractice.adapters.NewsListAdapter

class NewsListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_news_list, container, false)

        val recyclerView = view.findViewById<RecyclerView>(R.id.news_recyclerView)
        recyclerView.adapter = NewsListAdapter(Constants.picture)

        return view
    }

}