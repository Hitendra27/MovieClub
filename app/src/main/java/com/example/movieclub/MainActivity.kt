package com.example.movieclub

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.movieclub.data.Movie
import com.example.movieclub.data.movies
import com.example.movieclub.ui.theme.MovieClubTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MovieClubTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    MovieClubApp()
                }
            }
        }
    }
}

/**
 * Composable that displays an app bar and a list of movies.
 */
@Composable
fun MovieClubApp() {
    Scaffold { it ->
        LazyColumn(contentPadding = it) {
            items(movies) {
                MovieItem(
                    movie = it,
                    modifier = Modifier.padding(dimensionResource(R.dimen.padding_small))
                )
            }
        }
    }
}

/**
 * Composable that displays a list item containing movie poster and movie information.
 *
 * @param movie contains the data that populates the list item
 * @param modifier modifiers to set to this composable
 */
@Composable
fun MovieItem(
    movie: Movie,
    modifier: Modifier = Modifier
) {
    Card(modifier = modifier) {
        Column(
            modifier = modifier
                .fillMaxWidth()
                .padding(dimensionResource(R.dimen.padding_small))
        ) {
            MovieInformation(movie.movieName, movie.movieDir)
            MoviePoster(movie.imageResourceId)
        }
    }
}

/**
 * Composable that display a poster of a movie
 *
 * @param moviePoster is the resource ID for the image of the movie
 * @param modifier modifiers to set to this composable
 */
@Composable
fun MoviePoster(
    @DrawableRes moviePoster: Int,
    modifier: Modifier = Modifier
) {
    Image(
        painter = painterResource(moviePoster),
        contentDescription = null,
        modifier = Modifier
            .fillMaxWidth()
            .height(218.dp),
        contentScale = ContentScale.FillBounds
    )

}

/**
 * Composable that display a movie's name and movie director
 *
 * @param movieName is the resource ID for the string of the movie name
 * @param movieDirector is the resource ID for the string of the movie director
 * @param modifier modifier to set to this composable
 */
@Composable
fun MovieInformation(
    @StringRes movieName: Int,
    @StringRes movieDirector: Int,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier) {
        Text(
            text = stringResource(movieName),
            modifier = Modifier.padding(top = dimensionResource(R.dimen.padding_small))
        )
        Text(text = stringResource(movieDirector))
    }
}
@Preview(showBackground = true)
@Composable
fun MovieClubAppPreview() {
    MovieClubTheme(useDarkTheme = false) {
        MovieClubApp()
    }
}

@Preview
@Composable
fun MovieClubAppDarkThemePreview() {
    MovieClubTheme(useDarkTheme = true) {
        MovieClubApp()
    }
}