package com.dlight.algoguide.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dlight.algoguide.R
import com.dlight.algoguide.model.Courses

class CoursesAdapter(private val courseList: List<Courses>) : RecyclerView.Adapter<CoursesAdapter.ViewHolder>() {
    class ViewHolder(view: View): RecyclerView.ViewHolder(view) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CoursesAdapter.ViewHolder {
        val root = LayoutInflater.from(parent.context)
            .inflate(R.layout.fragment_course,parent,false)
        return ViewHolder(root)
    }

    override fun onBindViewHolder(holder: CoursesAdapter.ViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

}