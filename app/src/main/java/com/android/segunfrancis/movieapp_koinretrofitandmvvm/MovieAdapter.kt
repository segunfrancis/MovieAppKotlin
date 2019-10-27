package com.android.segunfrancis.movieapp_koinretrofitandmvvm

import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import com.squareup.picasso.Picasso

class MovieAdapter(private val picasso: Picasso) :
    ListAdapter<MovieCollection.Movie, MovieViewHolder>(DIFF_CALLBACK) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        MovieViewHolder.create(parent, picasso)

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    companion object {
        private val DIFF_CALLBACK = object : DiffUtil.ItemCallback<MovieCollection.Movie>() {
            override fun areItemsTheSame(
                oldItem: MovieCollection.Movie,
                newItem: MovieCollection.Movie
            ) = oldItem.id == newItem.id

            override fun areContentsTheSame(
                oldItem: MovieCollection.Movie,
                newItem: MovieCollection.Movie
            ) = oldItem == newItem
        }
    }
}