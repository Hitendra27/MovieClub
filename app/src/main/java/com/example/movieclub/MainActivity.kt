package com.example.movieclub

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.movieclub.ui.theme.MovieClubTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MovieClubTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                }
            }
        }
    }
}

/**
 * Composable that display a movie's name and movie director
 *
 * @param movieName is the resource ID for the string of the movie name
 * @param movieDirector is the resource ID for the string of the movie director
 * @param modifier modifier to set to this composable
 */


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MovieClubTheme {

    }
}