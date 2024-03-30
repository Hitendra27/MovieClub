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
    Movie(R.drawable.reservoirdogs, R.string.movie_2, R.string.movie_2_dir, R.string.movie_2_plot),
    Movie(R.drawable.thehangover, R.string.movie_3, R.string.movie_3_dir, R.string.movie_3_plot),
    Movie(R.drawable.thematrix, R.string.movie_4, R.string.movie_4_dir, R.string.movie_4_plot),
    Movie(R.drawable.theshawshankredemption, R.string.movie_5, R.string.movie_5_dir, R.string.movie_5_plot),
    Movie(R.drawable.thegodfather, R.string.movie_6, R.string.movie_6_dir, R.string.movie_6_plot),
    Movie(R.drawable.thedarkknight, R.string.movie_7, R.string.movie_7_dir, R.string.movie_7_plot),
    Movie(R.drawable.fightclub, R.string.movie_8, R.string.movie_8_dir, R.string.movie_8_plot),
    Movie(R.drawable.inception, R.string.movie_9, R.string.movie_9_dir, R.string.movie_9_plot),
    Movie(R.drawable.starwars5, R.string.movie_10, R.string.movie_10_dir, R.string.movie_10_plot),
    Movie(R.drawable.goodfellas, R.string.movie_11, R.string.movie_11_dir, R.string.movie_11_plot),
    Movie(R.drawable.backtothefuture, R.string.movie_12, R.string.movie_12_dir, R.string.movie_12_plot),
    Movie(R.drawable.gladiator, R.string.movie_13, R.string.movie_13_dir, R.string.movie_13_plot),
    Movie(R.drawable.theusualsuspects, R.string.movie_14, R.string.movie_14_dir, R.string.movie_14_plot),
    Movie(R.drawable.alien, R.string.movie_15, R.string.movie_15_dir, R.string.movie_15_plot),
    Movie(R.drawable.memento, R.string.movie_16, R.string.movie_16_dir, R.string.movie_16_plot),
    Movie(R.drawable.raiderofthelostark, R.string.movie_17, R.string.movie_17_dir, R.string.movie_17_plot),
    Movie(R.drawable.theshining, R.string.movie_18, R.string.movie_18_dir, R.string.movie_18_plot),
    Movie(R.drawable.inglouriousbasterds, R.string.movie_19, R.string.movie_19_dir, R.string.movie_19_plot),
    Movie(R.drawable.oldboy, R.string.movie_20, R.string.movie_20_dir, R.string.movie_20_plot),
    Movie(R.drawable.oppenheimer, R.string.movie_21, R.string.movie_21_dir, R.string.movie_21_plot),
    Movie(R.drawable.scarface, R.string.movie_22, R.string.movie_22_dir, R.string.movie_22_plot),
    Movie(R.drawable.diehard, R.string.movie_23, R.string.movie_23_dir, R.string.movie_23_plot),
    Movie(R.drawable.eternal_sunshine_of_the_spotless_mind, R.string.movie_24, R.string.movie_24_dir, R.string.movie_24_plot),
    Movie(R.drawable.thetrumanshow, R.string.movie_25, R.string.movie_25_dir, R.string.movie_25_plot),
    Movie(R.drawable.groundhogday, R.string.movie_26, R.string.movie_26_dir, R.string.movie_26_plot),
    Movie(R.drawable.piratesofthecaribbean, R.string.movie_27, R.string.movie_27_dir, R.string.movie_27_plot),
    Movie(R.drawable.gone_girl, R.string.movie_28, R.string.movie_28_dir, R.string.movie_28_plot),
    Movie(R.drawable.cathmeifyoucan, R.string.movie_29, R.string.movie_29_dir, R.string.movie_29_plot),
    Movie(R.drawable.killbill, R.string.movie_30, R.string.movie_30_dir, R.string.movie_30_plot),
    Movie(R.drawable.thething, R.string.movie_31, R.string.movie_31_dir, R.string.movie_31_plot),
)
