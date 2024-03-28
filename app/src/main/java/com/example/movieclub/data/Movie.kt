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
    Movie(R.drawable.terminator2, R.string.movie_2, R.string.movie_2_dir, R.string.movie_2_plot),
    Movie(R.drawable.terminator2, R.string.movie_3, R.string.movie_3_dir, R.string.movie_3_plot),
    Movie(R.drawable.terminator2, R.string.movie_4, R.string.movie_4_dir, R.string.movie_4_plot),
    Movie(R.drawable.terminator2, R.string.movie_5, R.string.movie_5_dir, R.string.movie_5_plot),
    Movie(R.drawable.terminator2, R.string.movie_6, R.string.movie_6_dir, R.string.movie_6_plot),
    Movie(R.drawable.terminator2, R.string.movie_7, R.string.movie_7_dir, R.string.movie_7_plot),
    Movie(R.drawable.terminator2, R.string.movie_8, R.string.movie_8_dir, R.string.movie_8_plot),
    Movie(R.drawable.terminator2, R.string.movie_9, R.string.movie_9_dir, R.string.movie_9_plot),
    Movie(R.drawable.terminator2, R.string.movie_10, R.string.movie_10_dir, R.string.movie_10_plot),
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
    Movie(R.drawable.terminator2, R.string.movie_1, R.string.movie_1_dir, R.string.movie_1_plot),
)
