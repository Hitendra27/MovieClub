package com.example.movieclub.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.movieclub.R

data class Movie(
    @DrawableRes val imageResourceId: Int,
    @StringRes val movieName: Int,
    @StringRes val movieDir: Int,
    @StringRes val moviePlot: Int
)

val movies = listOf(
    Movie(R.drawable.terminator2, R.string.movie_1, R.string.movie_1_dir, R.string.movie_1_plot),
    Movie(R.drawable.terminator2, R.string.movie_1, R.string.movie_1_dir, R.string.movie_1_plot),
    Movie(R.drawable.terminator2, R.string.movie_1, R.string.movie_1_dir, R.string.movie_1_plot),
    Movie(R.drawable.terminator2, R.string.movie_1, R.string.movie_1_dir, R.string.movie_1_plot),
    Movie(R.drawable.terminator2, R.string.movie_1, R.string.movie_1_dir, R.string.movie_1_plot),
    Movie(R.drawable.terminator2, R.string.movie_1, R.string.movie_1_dir, R.string.movie_1_plot),
    Movie(R.drawable.terminator2, R.string.movie_1, R.string.movie_1_dir, R.string.movie_1_plot),
    Movie(R.drawable.terminator2, R.string.movie_1, R.string.movie_1_dir, R.string.movie_1_plot),
    Movie(R.drawable.terminator2, R.string.movie_1, R.string.movie_1_dir, R.string.movie_1_plot),
    Movie(R.drawable.terminator2, R.string.movie_1, R.string.movie_1_dir, R.string.movie_1_plot),
)
