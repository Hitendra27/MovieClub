package com.example.movieclub.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.movieclub.R

val Oswald = FontFamily(
    Font(R.font.oswald_bold)
)

val Nunitosans = FontFamily(
    Font(R.font.nunitosans_bold, FontWeight.Bold)
)

val Pacifico = FontFamily(
    Font(R.font.pacifico_regular)
)

val Typography = Typography(
    displayLarge = TextStyle(
        fontFamily = Oswald,
        fontWeight = FontWeight.Normal,
        fontSize = 36.sp
    ),
    displayMedium = TextStyle(
        fontFamily = Nunitosans,
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp
    ),
    labelSmall = TextStyle(
        fontFamily = Nunitosans,
        fontWeight = FontWeight.Bold,
        fontSize = 14.sp
    ),
    bodyLarge = TextStyle(
        fontFamily = Pacifico,
        fontWeight = FontWeight.Normal,
        fontSize = 18.sp
    )
)
