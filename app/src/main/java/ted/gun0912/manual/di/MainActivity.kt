package ted.gun0912.manual.di

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import ted.gun0912.manual.di.ManualDiApplication.Companion.appModule
import ted.gun0912.manual.di.presentation.MovieViewModel
import ted.gun0912.manual.di.ui.MovieScreen
import ted.gun0912.manual.di.ui.theme.ManualDITheme

class MainActivity : ComponentActivity() {

    private val viewModel: MovieViewModel by lazy { appModule.movieViewModel }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ManualDITheme {
                MovieScreen(viewModel = viewModel)
            }
        }
    }
}
