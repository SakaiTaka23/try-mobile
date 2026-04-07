package com.example.composebasic

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composebasic.ui.theme.ComposeBasicTheme

class ComposeWindow : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeBasicTheme {
                Column(modifier = Modifier.fillMaxSize()) {
                    Row(Modifier.weight(1f)) {
                        WindowTile(
                            stringResource(R.string.text_composable),
                            stringResource(R.string.text_composable_detail),
                            Modifier
                                .weight(1f)
                                .background(color = colorResource(R.color.text_composable))
                        )
                        WindowTile(
                            stringResource(R.string.image_composable),
                            stringResource(R.string.image_composable_detail),
                            Modifier
                                .weight(1f)
                                .background(colorResource(R.color.image_composable))
                        )
                    }
                    Row(Modifier.weight(1f)) {
                        WindowTile(
                            stringResource(R.string.row_composable),
                            stringResource(R.string.row_composable_detail),
                            Modifier
                                .weight(1f)
                                .background(colorResource(R.color.row_composable))
                        )
                        WindowTile(
                            stringResource(R.string.column_composable),
                            stringResource(R.string.column_composable_detail),
                            Modifier
                                .weight(1f)
                                .background(colorResource(R.color.column_composable))
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun WindowTile(title: String, detail: String, modifier: Modifier = Modifier) {
    Column(
        modifier
            .padding(16.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(text = detail, modifier = Modifier)
    }
}

@Preview(showBackground = true)
@Composable
fun WindowTileView() {
    ComposeBasicTheme {
        WindowTile("title", "detail")
    }
}
