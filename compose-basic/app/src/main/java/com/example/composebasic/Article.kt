package com.example.composebasic

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composebasic.ui.theme.ComposeBasicTheme

class Article : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeBasicTheme {
                Column {
                    Header()
                    Article(
                        stringResource(R.string.title),
                        stringResource(R.string.abst),
                        stringResource(R.string.detail),
                    )
                }
            }
        }
    }
}

@Composable
fun Header(modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.bg_compose_background)
    Image(
        painter = image,
        contentDescription = null,
        modifier = modifier,
    )
}

@Preview
@Composable
fun HeaderPreview() {
    ComposeBasicTheme {
        Header()
    }
}

@Composable
fun Article(title: String, abst: String, detail: String, modifier: Modifier = Modifier) {
    Column(modifier) {
        Text(text = title, fontSize = 24.sp, modifier = modifier.padding(16.dp))
        Text(text = abst, textAlign = TextAlign.Justify, modifier = modifier.padding(16.dp))
        Text(text = detail, textAlign = TextAlign.Justify, modifier = modifier.padding(16.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun ArticlePreview() {
    ComposeBasicTheme {
        Article("title", "abst", "detail")
    }
}
