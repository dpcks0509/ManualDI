package ted.gun0912.manual.di.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import ted.gun0912.manual.di.presentation.MovieViewModel
import ted.gun0912.manual.di.ui.model.MovieModel
import ted.gun0912.manual.di.ui.theme.ManualDITheme
import java.util.Date

@Composable
fun MovieScreen(viewModel: MovieViewModel) {
    val uiState by viewModel.uiState.collectAsState()

    val snackbarHostState = remember { SnackbarHostState() }
    var errorMessage by remember { mutableStateOf<String?>(null) }

    LaunchedEffect(errorMessage) {
        if (errorMessage != null) {
            snackbarHostState.showSnackbar(errorMessage!!)
            errorMessage = null
        }
    }

    Scaffold(
        snackbarHost = { SnackbarHost(hostState = snackbarHostState) },
    ) { contentPadding ->

        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(contentPadding),
            contentAlignment = Alignment.Center
        ) {
            Content(uiState.movies)
            if (uiState.isLoading) {
                CircularProgressIndicator()
            }
            if (uiState.error != null) {
                errorMessage = "오류발생: ${uiState.error}"

            }
        }
    }

}

@Composable
private fun Content(movies: List<MovieModel>) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(3),
        modifier = Modifier
            .fillMaxSize(),
        contentPadding = PaddingValues(8.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        items(movies.size) { index ->
            MovieItem(movie = movies[index])
        }
    }
}

@Composable
fun MovieItem(movie: MovieModel) {

    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        AsyncImage(
            model = movie.posterImageUrl,
            contentDescription = movie.name,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .aspectRatio(2f / 3),
        )
        Column(
            modifier = Modifier.padding(vertical = 4.dp)
        ) {
            Text(
                text = movie.name,
                style = MaterialTheme.typography.bodyMedium,
                maxLines = 1,
            )
            Spacer(modifier = Modifier.padding(2.dp))
            Text(
                text = "⭐ ${movie.rating} (${movie.rateCount})",
                style = MaterialTheme.typography.labelMedium,
                color = Color.Gray,
                maxLines = 1,
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Preview() {
    ManualDITheme {
        val movies = (0..10).map {
            MovieModel(
                id = it,
                name = "Movie Name $it",
                description = "Movie Description $it",
                posterImageUrl = "https://image.tmdb.org/t/p/w500/8UlWHLMpgZm9bx6QYh0NFoq67TZ.jpg",
                rating = 8.0f,
                rateCount = 100,
                releasedAt = Date()
            )
        }
        Content(movies)
    }
}
