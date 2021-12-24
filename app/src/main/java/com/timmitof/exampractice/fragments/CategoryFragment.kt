package com.timmitof.exampractice.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import androidx.recyclerview.widget.RecyclerView
import com.timmitof.exampractice.Constants
import com.timmitof.exampractice.R
import com.timmitof.exampractice.adapters.CategoryAdapter

class CategoryFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_category, container, false)

        val recyclerView = view.findViewById<RecyclerView>(R.id.category_recyclerView)
        recyclerView.adapter = CategoryAdapter(Constants.categories, requireActivity())

        return view
    }

}