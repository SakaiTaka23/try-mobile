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
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composebasic.ui.theme.ComposeBasicTheme

class BusinessCard : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeBasicTheme {
                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(3.dp)
                ) {
                    MainSection(
                        icon = painterResource(R.drawable.ic_task_completed),
                        iconDescription = "My profile picture",
                        name = "SakaiTaka23",
                        title = "Application Engineer",
                        modifier = Modifier.padding(vertical = 10.dp)
                    )
                    Addresses(
                        phoneNumber = "000-0000-0000",
                        sNS = "N/A",
                        email = "See My GitHub"
                    )
                }
            }
        }
    }
}

@Composable
fun MainSection(
    icon: Painter,
    iconDescription: String,
    name: String,
    title: String,
    modifier: Modifier = Modifier,
) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
    ) {
        Image(painter = icon, contentDescription = iconDescription)
        Text(text = name, fontSize = 50.sp, fontWeight = FontWeight.Bold)
        Text(text = title, fontSize = 30.sp)
    }
}

@Composable
fun Addresses(
    phoneNumber: String,
    sNS: String,
    email: String,
    modifier: Modifier = Modifier
) {
    Column(
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Center,
        modifier = modifier
    ) {
        val padding = Modifier.padding(3.dp)
        Text(text = phoneNumber, modifier = padding)
        Text(text = sNS, modifier = padding)
        Text(text = email, modifier = padding)
    }
}

@Preview(showBackground = true)
@Composable
fun MainSectionView() {
    ComposeBasicTheme {
        MainSection(
            icon = painterResource(R.drawable.ic_task_completed),
            iconDescription = "My photo",
            name = "Full Name",
            title = "Title"
        )
    }
}

@Preview(showBackground = true)
@Composable
fun AddressesView() {
    ComposeBasicTheme {
        Addresses(
            phoneNumber = "000-0000-0000",
            sNS = "@sns",
            email = "some@some.com"
        )
    }
}
