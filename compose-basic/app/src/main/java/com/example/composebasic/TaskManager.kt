package com.example.composebasic

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composebasic.ui.theme.ComposeBasicTheme

class TaskManager : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeBasicTheme {
                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.fillMaxSize(),
                ) {
                    CompleteImage()
                    CompleteStatusMessage(stringResource(R.string.all_completed))
                    CompleteMotivationMessage(stringResource(R.string.nice_work))
                }
            }
        }
    }
}

@Composable
fun CompleteImage(modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.ic_task_completed)
    Image(
        painter = image,
        contentDescription = null,
        modifier,
    )
}

@Composable
fun CompleteStatusMessage(message: String, modifier: Modifier = Modifier) {
    Text(
        text = message,
        fontWeight = FontWeight.Bold,
        modifier = modifier.padding(top = 24.dp, bottom = 8.dp)
    )
}

@Composable
fun CompleteMotivationMessage(message: String, modifier: Modifier = Modifier) {
    Text(text = message, fontSize = 16.sp, modifier = modifier)
}
